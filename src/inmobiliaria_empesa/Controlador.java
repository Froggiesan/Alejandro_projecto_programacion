
package inmobiliaria_empesa;
import java.util.*;
import clases_usuarios.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;
import Clases_viviendas.*;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Controlador {
    
    private String mensaje="";
    
    public String agregarUsuario(Connection con,Usuario emp){
        PreparedStatement pst = null;
        String sql = "INSERT INTO \"SYSTEM\".\"USUARIOS\" (NICK, \"contrasena\", NOMBRE, \"apellido1\", \"apellido2\", CORREO, EDAD, NUM_TELEFONO)"
                + " VALUES(?,?,?,?,?,?,?,?)";
        String prueba = "INSERT INTO \"SYSTEM\".\"USUARIOS\" (NICK, \"contrasena\", NOMBRE, \"apellido1\", \"apellido2\", CORREO, EDAD, NUM_TELEFONO) VALUES ('Labosis', '1234', 'Victor', 'Mari', 'rodriguez', 'victor@gmail.com','25', '633584758')";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNick());
            pst.setString(2, emp.getContrasena());
            pst.setString(3, emp.getNombre());
            pst.setString(4, emp.getApellido1());
            pst.setString(5, emp.getApellido2());
            pst.setString(6,emp.getCorreo());
            
            pst.setInt(7, emp.getEdad());
            pst.setString(8, emp.getNumero_telefono());
            
            
            
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido guardar correctamente \n "+e.getMessage();
            System.out.println(mensaje);
            
        }
        return mensaje;
    }
    public String modificarUsuario(Connection con,Usuario emp){
        PreparedStatement pst = null;
        String sql = "UPDATE USUARIO SET NOMBRE = ?,APELLIDO1=?,APELLIDO2=?,EDAD=?,NUM_TELEFONO = ?,CORREO = ?,SEXO = ?,NICK = ?,CONTRASENA = ?"
                +"WHERE ID = ?;";
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
        String sql = "DELETE FROM USUARIOS WHERE ID = ?;";
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
    public String agregarTrabajador(Connection con,Trabajador emp){
        PreparedStatement pst = null;
        String sql ="INSERT INTO \"SYSTEM\".\"TRABAJADOR\" (ID_USUARIO, SUELDO, VENTAS)"
                + " VALUES (?,?,?);";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getId_usuario());
            pst.setInt(2, emp.getSueldo());
            pst.setInt(3,emp.getVentas());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            mensaje="no se ha podido modificar correctamente \n "+e.getMessage();
        }return mensaje;
        
    }
    public String agregarVivienda(Connection con,Viviendas emp) throws SQLException{
        PreparedStatement pst = null;
        String mensaje="";
        String sql="INSERT INTO \"SYSTEM\".\"VIVIENDA\" (CALLE, DESCRIPCION, PRECIO)"
                + " VALUES(?,?,?)";
        try {
            pst.setString(1,emp.getCalle());
            pst.setString(2, emp.getDescripcion());
            pst.setInt(3, emp.getPrecio());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="no se ha podido agregar correctamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String agregarVenta(Connection con,Ventas emp){
        PreparedStatement pst = null;
        String sql ="INSERT INTO \"SYSTEM\".\"VENTA\" (ID_VIVIENDA)"
                + " VALUES (?);";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getId_viviendas());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            mensaje="no se ha podido agregar correctamente \n "+e.getMessage();
        }return mensaje;
    }
    public String agregarAlquiler(Connection con,Alquileres emp){
        PreparedStatement pst = null;
        String sql ="INSERT INTO \"SYSTEM\".\"ALQUILER\" (ID_VIVIENDA)"
                + " VALUES (?);";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getId_viviendas());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            mensaje="no se ha podido agregar correctamente \n "+e.getMessage();
        }return mensaje;
    }
    public String agregarFoto(Connection con,fotos_vivienda emp){
        PreparedStatement pst = null;
        String sql ="INSERT INTO \"SYSTEM\".\"FOTOS_PISOS\" (ID_VIVIENDA, URL_FOTO)"
                + " VALUES (?,?);";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getId_vivienda());
            pst.setString(2, emp.getURL_foto());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            mensaje="no se ha podido agregar correctamente \n "+e.getMessage();
        }return mensaje;
    }
    public String eliminarFoto(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM FOTOS_PISOS WHERE ID = ?;";
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
    public String eliminarAlquiler(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIO WHERE ID = ?;";
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
    public String eliminarVenta(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIO WHERE ID = ?;";
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
    public String eliminarVivienda(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM VIVIENDA WHERE ID = ?;";
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
    public String eliminarTrabajador(Connection con,int id){
        PreparedStatement pst = null;
        String sql = " delete from trabajador where id_trabajador=?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje="Borrado correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido borrar correctamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String [][] mostrarUsuario(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"NICK","CONTRASENA","NOMBRE","APELLIDO1","APELLIDO2","CORREO","EDAD","NUM_TELEFONO","ID"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"USUARIOS\""; //sentencia
        String [] filas = new String[9];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 9; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 9));
            }
            return Usuarios.toArray(String[][]::new);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    public String modTrabajador(Connection con,Trabajador emp){
        PreparedStatement pst = null;
        String sql ="UPDATE \"SYSTEM\".\"TRABAJADOR\" SET SUELDO = ?,VENTAS=?"
                +"WHERE ID_TRABAJADOR = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,emp.getId_trabajador());
            pst.setInt(2, emp.getSueldo());
            pst.setInt(3,emp.getVentas());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            mensaje="no se ha podido modificar correctamente \n "+e.getMessage();
        }return mensaje;
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
