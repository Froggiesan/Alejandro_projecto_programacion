
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
    public String agregarTrabajador(Connection con,Trabajador emp){
        PreparedStatement pst = null;
        String sql ="INSERT INTO \"SYSTEM\".\"TRABAJADOR\" (ID_USUARIO, SUELDO, VENTAS) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, emp.getId_usuario());
            pst.setInt(2, emp.getSueldo());
            pst.setInt(3,emp.getVentas());
            mensaje="Trabajador guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        } catch (Exception e) {
            mensaje="No se ha podido guardar el trabajador \n "+e.getMessage();
        }return mensaje;
        
    }
    public String agregarVivienda(Connection con,Viviendas emp) throws SQLException{
        PreparedStatement pst = null;
        String mensaje="";
        String sql="INSERT INTO \"SYSTEM\".\"VIVIENDA\" (CALLE, DESCRIPCION, PRECIO) VALUES (?,?,?)";
        System.out.println("Ha llegado al metodo");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,emp.getCalle());
            pst.setString(2, emp.getDescripcion());
            pst.setInt(3, emp.getPrecio());
            
            mensaje="Vivienda guardada correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            System.out.println("Ha llegado al final del try de agregarVivienda");
        } catch (Exception e) {
            mensaje="No se ha podido agregar la vivienda correctamente \n "+e.getMessage();
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
            mensaje="Borrado correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido borrar correctamente \n "+e.getMessage();
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
            mensaje="Foto eliminada correctamente";
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
            mensaje="Alquiler eliminado correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido borrar correctamente \n "+e.getMessage();
            System.out.println(mensaje);
        }
        return mensaje;
    }
    public String eliminarVenta(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIO WHERE ID = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje="Venta eliminada correctamente";
            pst.execute();
            pst.close();
            
            
            
        } catch (SQLException e) {
            mensaje="no se ha podido borrar correctamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarVivienda(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM vivienda WHERE id = ?";
        System.out.println(id);
        System.out.println("aqui llega");
        try {
            System.out.println("Estas dentro del try del metodo controlador");
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje="La vivienda ha sido borrada correctamente";
            System.out.println(mensaje);
            //Cerramos la conexion y ejecturarla
            pst.execute();
            pst.close();
            System.out.println("Ha llegado a su final"+id);
            
            
            
        } catch (SQLException e) {
            mensaje="No se ha podido borrar correctamente \n "+e.getMessage();
            e.printStackTrace();
            System.out.println("Comprobación");
        }
        return mensaje;
    }
    public String eliminarTrabajador(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM trabajador WHERE id_trabajador = ?";
        System.out.println(id);
        System.out.println("aqui llega");
        try {
            System.out.println("asd isab");
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje="El trabajador ha sido borrado correctamente";
            //Cerramos la conexion y ejecturarla
            pst.execute();
            pst.close();
            System.out.println("Ha llegado a su final");
            
            
        }catch(Excepcionespropias e){
            System.out.println("Ha habido un problema al eliminar el trabajador , consultar al administrador");
        }
        catch (SQLException e) {
            mensaje="No se ha podido borrar correctamente \n "+e.getMessage();
            e.printStackTrace();
            System.out.println("algo que ver");
        }
        return mensaje;
    }
    public String [][] mostrarUsuario(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"NICK","CONTRASENA","NOMBRE","APELLIDO1","APELLIDO2","CORREO","EDAD","NUM_TELEFONO","ID"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"USUARIOS\" ORDER BY ID"; //sentencia
        String [] filas = new String[9];
        Statement st = null;
        ResultSet rs = null;
        //Aqui hago el arrayList
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
        }
        catch(Excepcionespropias e){
            System.out.println("Ha habido un problema al mostrar la tabla , consultar al administrador");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    public String modTrabajador(Connection con,Trabajador emp){
        PreparedStatement pst = null;
        String sql ="UPDATE \"SYSTEM\".\"TRABAJADOR\" SET SUELDO = ?, VENTAS = ? WHERE ID_TRABAJADOR= ?";
                
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(3,emp.getId_trabajador());
            pst.setInt(1, emp.getSueldo());
            pst.setInt(2,emp.getVentas());
            mensaje="guardado correctamente";
            System.out.println(mensaje);
            pst.execute();
            pst.close();
            
        }
        catch(Excepcionespropias e){
            System.out.println("Ha habido un problema al modificar el trabajador , consultar al administrador");
        }catch (Exception e) {
            mensaje="no se ha podido modificar correctamente \n "+e.getMessage();
        }return mensaje;
    }
    public String [][] mostrarTrabajador(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"ID_USUARIO","SUELDO","VENTAS","ID_TRABAJADOR"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"TRABAJADOR\""; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                if(Integer.parseInt(filas[1])>=15000){
                    throw new Excepcionespropias("Cuidado, este trabajador se ha pasado de los 15k de sueldo");
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
            }
            return Usuarios.toArray(String[][]::new);
        }catch(Excepcionespropias e){
            System.out.println("Ha habido un problema al mostrar la tabla , consultar al administrador");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    
    public String [][] mostrarVivienda(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"CALLE","DESCRIPCION","PRECIO","ID_VIVIENDA ORDER BY CALLE"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"VIVIENDA\""; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
            }
            return Usuarios.toArray(String[][]::new);
        }catch(Excepcionespropias e){
            System.out.println("Ha habido un problema al mostrar la tabla , consultar al administrador");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    
    public String [][] mostrarJefe(Connection con){
        DefaultTableModel model;
        String [] columnas = {"ID_USUARIO","SUELDO","VENTAS","ID_JEFE"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"JEFE\""; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;
        //Aqui hago el arrayList
        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
                
            }
            return Usuarios.toArray(String[][]::new);
        }
        catch(Excepcionespropias e){
            System.out.println("Ha habido un problema al mostrar la tabla , consultar al administrador");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    public String [][] mostrarTrabajador2(Connection con){
        DefaultTableModel model;
        String [] columnas = {"ID_USUARIO","SUELDO","VENTAS","ID_TRABAJADOR"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"TRABAJADOR\""; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
            }
            return Usuarios.toArray(String[][]::new);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
     public String [][] mostrarUsuario2(Connection con){
        DefaultTableModel model;
        String [] columnas = {"NICK","CONTRASENA","NOMBRE","APELLIDO1","APELLIDO2","CORREO","EDAD","NUM_TELEFONO","ID"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"USUARIOS\" ORDER BY ID"; //sentencia
        String [] filas = new String[9];
        Statement st = null;
        ResultSet rs = null;
        //Aqui hago el arrayList
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
    public String [][] mostrarTrabVentasGaP(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"ID_USUARIO","SUELDO","VENTAS","ID_TRABAJADOR ORDER BY VENTAS"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"TRABAJADOR\" ORDER BY VENTAS"; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;
        //Aqui hago el arrayList
        
        
        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
                
            }
            return Usuarios.toArray(String[][]::new);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    public String [][] mostrarTrabVentasPaG(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"ID_USUARIO","SUELDO","VENTAS","ID_TRABAJADOR"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"TRABAJADOR\" ORDER BY VENTAS REVERSE "; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
            }
            return Usuarios.toArray(String[][]::new);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mosrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    public String [][] mostrarViviendaPrecioGaP(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"CALLE","DESCRIPCION","PRECIO","ID_VIVIENDA ORDER BY CALLE"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"VIVIENDA\" ORDER BY PRECIO"; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
            }
            return Usuarios.toArray(String[][]::new);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla");
            e.printStackTrace();
        }
        return null;
    }
    public String [][] mostrarViviendaPrecioPaG(Connection con,JTable Tabla){
        DefaultTableModel model;
        String [] columnas = {"CALLE","DESCRIPCION","PRECIO","ID_VIVIENDA ORDER BY CALLE REVERSE"};
        model = new DefaultTableModel(null,columnas);

        String sql= "SELECT  *  FROM \"SYSTEM\".\"VIVIENDA\" ORDER BY PRECIO"; //sentencia
        String [] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> Usuarios = new ArrayList<>();
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1); //recorremos las filas
                }
                Usuarios.add(Arrays.copyOf(filas, 4));
            }
            return Usuarios.toArray(String[][]::new);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla");
            e.printStackTrace();
        }
        return null;
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
