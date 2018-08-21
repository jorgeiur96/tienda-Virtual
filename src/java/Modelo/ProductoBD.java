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
import java.util.ArrayList;


public class ProductoBD {
    
     public static ArrayList<Producto> obtenerProductosHabilitados(){
        ArrayList<Producto> lista = new ArrayList<Producto>();
            Connection cn;
            Conexion con = new Conexion();
            cn = con.conectar();
            
            PreparedStatement cs = null;
            ResultSet rs = null;
            
            String SQL="SELECT P.Codigo_P, CP.Nombre_CP as Clase_P, MP.Nombre_MP as Marca_P, P.Descripcion, P.Precio_P, P.Imagen_P, P.Estado_P FROM PRODUCTO P\n" +
"	INNER JOIN clase_producto CP ON CP.Codigo_CP = P.Codigo_CP\n" +
"	INNER JOIN marca_producto MP ON MP.Codigo_MP = P.Codigo_MP\n" +
"	WHERE P.Estado_P = 'HAB' and CP.Estado_CP = 'HAB' and MP.Estado_MP = 'HAB' ORDER BY cp.Nombre_CP ASC;";
            
            try{
                cs=cn.prepareStatement(SQL);
                rs=cs.executeQuery();
                while(rs.next()){
                    Producto p = new Producto(rs.getString("Codigo_P"), rs.getString("Clase_P"), rs.getString("Marca_P"), rs.getString("Descripcion"), rs.getDouble("Precio_P"), rs.getString("Imagen_P"), rs.getString("Estado_P"));
                    lista.add(p);
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        return lista;
    }
    public static Producto listarProductoPorCodigo(String Codigo){
        Producto p = new Producto();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        String SQL="SELECT P.Codigo_P, CP.Nombre_CP, MP.Nombre_MP, P.Descripcion, P.Precio_P, P.Imagen_P, P.Estado_P FROM PRODUCTO P\n" +
"	INNER JOIN clase_producto CP ON CP.Codigo_CP = P.Codigo_CP\n" +
"	INNER JOIN marca_producto MP ON MP.Codigo_MP = P.Codigo_MP\n" +
"	WHERE P.Codigo_P = ? and P.Estado_P = 'HAB' ORDER BY cp.Nombre_CP ASC;";
        try{
            PreparedStatement cs = cn.prepareStatement(SQL);
            cs.setString(1, Codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                p.setCodigoP(rs.getString("Codigo_P"));
                p.setClaseProducto(rs.getString("Nombre_CP"));
                p.setMarcaProducto(rs.getString("Nombre_MP"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setPrecioP(rs.getDouble("Precio_P"));
                p.setImagenP(rs.getString("Imagen_P")); 
            }
        }catch(Exception e){System.out.println(e);}
        return p;
    }
}
