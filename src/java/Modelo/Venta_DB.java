/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Jorge Urueta
 */
public class Venta_DB {
    
         Date dates = new Date();
     public static boolean insertarVenta(Venta v){
        boolean resp = false;
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
    
        String SQl="insert into VENTA(Codigo_V, Codigo_U, Total,fecha) values (?,?,?,?)";
         
        System.out.println(v.getCodigoVenta());
        System.out.println(v.getCliente());
        Date date = new Date();
                        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
                        
                        Calendar cal = Calendar.getInstance(); 

       java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());

        try{
           
            //JOptionPane.showInternalMessageDialog(null, v.getCodigoVenta());
            PreparedStatement cs = cn.prepareStatement(SQl);
              cs.setString(1, v.getCodigoVenta());            
            cs.setString(2, v.getCliente());
            cs.setDouble(3, v.getTotal());
            
            

            cs.setTimestamp(4,timestamp);
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
            
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
}
