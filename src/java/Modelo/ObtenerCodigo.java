/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ObtenerCodigo {
    
     public static String CodigoVenta(){
        String Codigo = "";
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        String SQL="SELECT CAST(substring((select MAX(Codigo_V) from VENTA) from 5 for 1) AS INTEGER)+1 AS Codigo_V;";
        
        try{
            PreparedStatement cs = cn.prepareStatement(SQL);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Codigo ="V000"+ rs.getString("Codigo_V");
            }
        }catch(Exception e){
           System.out.println(e);
        }
        return Codigo;
    }
    
}
