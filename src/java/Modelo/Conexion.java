/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author Daniel
 */
public class Conexion {
    Connection conectar = null;
    
    public Connection conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empresa","postgres","");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return conectar;
    }
}
