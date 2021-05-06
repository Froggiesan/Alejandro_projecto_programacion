
package clases_usuarios;
import inmobiliaria_empesa.Controlador;
import inmobiliaria_empesa.acceso_a_BD;
import java.sql.Connection;
import java.util.*;
import java.sql.*;
import inmobiliaria_empesa.*;
import javax.swing.JTable;
public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String numero_telefono;
    private String sexo;
    private String correo;
    private int id;
    private String nick;
    private String contrasena;
    
    
    
    
    
    
    public Usuario(String nombre,String apellido1,String apellido2,int edad,String numero_telefono,String sexo,int id,String nick,String contrasena,String correo){
        this.nombre= nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
        this.numero_telefono=numero_telefono;
        this.sexo=sexo;
        this.nick=nick;
        this.id=id;
        this.contrasena=contrasena;
        this.correo=correo;
        
    }
    public Usuario(){
        
    }
    
    
    public void consultar_cita(){
        
    }
    public void acceder_calculadora(){
        
    }
    public void ver_pisos_ventas(){
        
    }
    public void ver_pisos_alquiler(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setFecha_nacimiento(int edad) {
        this.edad = edad;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    private String mensaje="";
    public String agregarUsuario(Connection con , Usuario emp){
        return mensaje;
    }
    public String modificarUsuario(Connection con , Usuario emp){
        return mensaje;
    }
    public String eliminarUsuario(Connection con , int id){
        return mensaje;
    }
    public void mostrarUsuario(){
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String agregarUsuario(Usuario emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarUsuario(conn, emp);
            
            
        } catch (Exception e) {
            mensaje = mensaje+ " "+e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+ " "+e.getMessage();
            }
        }
        return mensaje;
    }
    public String Mod_usuario(Usuario emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.modificarUsuario(conn, emp);
            
            
        } catch (Exception e) {
            mensaje = mensaje+ " "+e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+ " "+e.getMessage();
            }
        }
        return mensaje;
    }
    public String deleteUsuario(Usuario emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.eliminarUsuario(conn, id);
            
            
        } catch (Exception e) {
            mensaje = mensaje+ " "+e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje+ " "+e.getMessage();
            }
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", numero_telefono=" + numero_telefono + ", sexo=" + sexo + ", correo=" + correo + ", id=" + id + ", nick=" + nick + ", contrasena=" + contrasena + ", contr="+ ", mensaje=" + mensaje + '}';
    }
    public String[][] listarUsuario(JTable Tabla) throws SQLException{
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();
        
        return consulta.mostrarUsuario(conn, Tabla);
        
    }

    
    
}
    
