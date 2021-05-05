
package inmobiliaria_empesa;

import clases_usuarios.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;

public class Controlador {
    
    private String mensaje="";
    
    public String agregarUsuario(Connection con,Usuario emp){
        PreparedStatement pst = null;
        String sql = "INSERT INTO USUARIO(nombre, apellido1,apellido2,edad,num_telefono,sexo,correo,nick,contrasena)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombre());
            pst.setString(2, emp.getApellido1());
            pst.setString(3, emp.getApellido2());
            pst.setInt(4, emp.getEdad());
            pst.setString(5, emp.getNumero_telefono());
            pst.setString(6, emp.getSexo());
            pst.setString(7,emp.getCorreo());
            pst.setString(7, emp.getNick());
            pst.setString(8, emp.getContrasena());
            mensaje="guardado correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido guardar correctamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modificarUsuario(Connection con,Usuario emp){
        PreparedStatement pst = null;
        String sql = "UPDATE USUARIO SET NOMBRE = ?,APELLIDO1=?,APELLIDO2=?,EDAD=?,NUM_TELEFONO = ?,CORREO = ?,SEXO = ?,NICK = ?,CONTRASENA = ?"
                +"WHERE IDEMPEADO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombre());
            pst.setString(2, emp.getApellido1());
            pst.setString(3, emp.getApellido2());
            pst.setInt(4, emp.getEdad());
            pst.setString(5, emp.getNumero_telefono());
            pst.setString(6, emp.getSexo());
            pst.setString(7,emp.getCorreo());
            pst.setString(7, emp.getNick());
            pst.setString(8, emp.getContrasena());
            pst.setInt(9,emp.getId());
            mensaje="actualizado correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido modificar correctamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarUsuario(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIO WHERE ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje="borrado correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido borrar correctamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public void mostrarUsuario(Connection con,JTable tabla){
        
    }
    
    
    
    
    
    
    
    
    
    
    public Controlador(){
        
    }
    
    public void showClientes(){
        String consultaClientes = "";
        
        
    }
    public void showVentasGaP(){
        
    }
    public void showVentasPaG(){
        
    }
    public void showPrecioGaP(){
        
    }
    public void showPrecioPaG(){
        
    }
    public void showClientesXNombre(){
        
    }
    public void showClientesXApellido(){
        
    }
    public void showClientesXApellido2(){
        
    }
    public void showClientesXCorreo(){
        
    }
    public void showClientesXTelefono(){
        
    }
    public void setTrabajador(){
        
    }
    public void modPisos(){
        
    }
    public void setPisos(){
        
    }
    public void borrarPisos(){
        
    }
    
    
    
    
}
