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

/**
 *
 * @author Jorge Urueta
 */
public class UsuarioBD {
    
    public static boolean RegistrarUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        String Sql="INSERT INTO usuario values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        
        try{
            PreparedStatement cs = cn.prepareStatement(Sql);
            
            cs.setString(1, usu.getCodigoUsuario());
            cs.setString(2, usu.getNombreUsuario());
            cs.setString(3, usu.getApellidosUsuario());
            cs.setString(4, usu.getDniUsuario());
            cs.setString(5, usu.getEmailUsuario());
            cs.setString(6, usu.getDepartamentoUsuario());
            cs.setString(7, usu.getMunicipioUsuario());
            cs.setString(8, usu.getDireccion1Usuario());
            cs.setString(9, usu.getDireccion2Usuario());
            cs.setString(10, usu.getTelefonoUsuario());
            cs.setString(11, usu.getIdUsuario());
            cs.setString(12, usu.getClaveUsuario());
            cs.setString(13, "CLIENTE");
            cs.setString(14, "HAB");
            cs.setString(15, usu.getBarrioUsuario());
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
     public static Usuario VerificarUsuario(String id_usuario){
        Usuario usu = new Usuario();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        String SQl="select Codigo_U,Id_U,Clave,Estado_u from usuario where Id_U = ?";
        
        try{
           PreparedStatement cs = cn.prepareStatement(SQl);
            cs.setString(1, id_usuario);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                usu.setCodigoUsuario(rs.getString("Codigo_U")); 
                usu.setIdUsuario(rs.getString("Id_U"));
                usu.setClaveUsuario(rs.getString("Clave"));
                usu.setEstadoUsuario(rs.getString("Estado_U")); 
            }
        }catch(Exception e){System.out.println(e);}
        return usu;
    }
     
     
      public static Usuario listarUsuarioPorCodigo(String codigo){
        Usuario usu = new Usuario();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        String SQL="select * from usuario where Codigo_U = ?";
        
        try{
            PreparedStatement cs = cn.prepareStatement(SQL);
            cs.setString(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                usu.setCodigoUsuario(rs.getString("Codigo_U"));
                usu.setNombreUsuario(rs.getString("Nombre_U"));
                usu.setApellidosUsuario(rs.getString("Apellido_U"));
                usu.setDniUsuario(rs.getString("Dni_U"));
                usu.setEmailUsuario(rs.getString("Email_U"));
                usu.setDepartamentoUsuario(rs.getString("Departamento"));
                usu.setMunicipioUsuario(rs.getString("Municipio"));
                usu.setBarrioUsuario(rs.getString("Barrio"));
                usu.setDireccion1Usuario(rs.getString("Direccion1_U"));
                usu.setDireccion2Usuario(rs.getString("Direccion2_U"));
                usu.setTelefonoUsuario(rs.getString("Telefono")); 
                usu.setIdUsuario(rs.getString("Id_U"));
                usu.setClaveUsuario(rs.getString("Clave"));
                usu.setTipoUsuario(rs.getString("Tipo_U")); 
                usu.setEstadoUsuario(rs.getString("Estado_U")); 
            }
        }catch(Exception e){System.out.println(e);}
        return usu;
    }
    
}
