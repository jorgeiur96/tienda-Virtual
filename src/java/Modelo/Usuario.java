/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Usuario {

    public String getCodigoUsuario() {
        return CodigoUsuario;
    }

    public void setCodigoUsuario(String CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getApellidosUsuario() {
        return ApellidosUsuario;
    }

    public void setApellidosUsuario(String ApellidosUsuario) {
        this.ApellidosUsuario = ApellidosUsuario;
    }

    public String getDniUsuario() {
        return DniUsuario;
    }

    public void setDniUsuario(String DniUsuario) {
        this.DniUsuario = DniUsuario;
    }

    public String getEmailUsuario() {
        return EmailUsuario;
    }

    public void setEmailUsuario(String EmailUsuario) {
        this.EmailUsuario = EmailUsuario;
    }

    public String getDepartamentoUsuario() {
        return DepartamentoUsuario;
    }

    public void setDepartamentoUsuario(String DepartamentoUsuario) {
        this.DepartamentoUsuario = DepartamentoUsuario;
    }

    public String getMunicipioUsuario() {
        return MunicipioUsuario;
    }

    public void setMunicipioUsuario(String MunicipioUsuario) {
        this.MunicipioUsuario = MunicipioUsuario;
    }

    public String getBarrioUsuario() {
        return BarrioUsuario;
    }

    public void setBarrioUsuario(String BarrioUsuario) {
        this.BarrioUsuario = BarrioUsuario;
    }

    public String getDireccion1Usuario() {
        return Direccion1Usuario;
    }

    public void setDireccion1Usuario(String Direccion1Usuario) {
        this.Direccion1Usuario = Direccion1Usuario;
    }

    public String getDireccion2Usuario() {
        return Direccion2Usuario;
    }

    public void setDireccion2Usuario(String Direccion2Usuario) {
        this.Direccion2Usuario = Direccion2Usuario;
    }

    public String getTelefonoUsuario() {
        return TelefonoUsuario;
    }

    public void setTelefonoUsuario(String TelefonoUsuario) {
        this.TelefonoUsuario = TelefonoUsuario;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getClaveUsuario() {
        return ClaveUsuario;
    }

    public void setClaveUsuario(String ClaveUsuario) {
        this.ClaveUsuario = ClaveUsuario;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public String getEstadoUsuario() {
        return EstadoUsuario;
    }

    public void setEstadoUsuario(String EstadoUsuario) {
        this.EstadoUsuario = EstadoUsuario;
    }

    public Usuario(String CodigoUsuario, String NombreUsuario, String ApellidosUsuario, String DniUsuario, String EmailUsuario, String DepartamentoUsuario, String MunicipioUsuario, String BarrioUsuario, String Direccion1Usuario, String Direccion2Usuario, String TelefonoUsuario, String IdUsuario, String ClaveUsuario, String TipoUsuario, String EstadoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
        this.NombreUsuario = NombreUsuario;
        this.ApellidosUsuario = ApellidosUsuario;
        this.DniUsuario = DniUsuario;
        this.EmailUsuario = EmailUsuario;
        this.DepartamentoUsuario = DepartamentoUsuario;
        this.MunicipioUsuario = MunicipioUsuario;
        this.BarrioUsuario = BarrioUsuario;
        this.Direccion1Usuario = Direccion1Usuario;
        this.Direccion2Usuario = Direccion2Usuario;
        this.TelefonoUsuario = TelefonoUsuario;
        this.IdUsuario = IdUsuario;
        this.ClaveUsuario = ClaveUsuario;
        this.TipoUsuario = TipoUsuario;
        this.EstadoUsuario = EstadoUsuario;
    }

    public Usuario() {
        
    }
    
    private String CodigoUsuario;
    private String NombreUsuario;
    private String ApellidosUsuario;
    private String DniUsuario;
    private String EmailUsuario;
    private String DepartamentoUsuario;
    private String MunicipioUsuario;
    private String BarrioUsuario;
    private String Direccion1Usuario;
    private String Direccion2Usuario;
    private String TelefonoUsuario;
    private String IdUsuario;
    private String ClaveUsuario;
    private String TipoUsuario;
    private String EstadoUsuario;
    
}
