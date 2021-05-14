/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_empresa_Clases_Viviendas;

import inmobiliaria_empesa.BBDD.Controlador;
import inmobiliaria_empesa.BBDD.acceso_a_BD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

public class Viviendas {
    private String calle;
    private int id;
    private String descripcion;
    private int precio;
    private String foto;
    public Viviendas(String calle,int id,String descripcion){
        this.calle=calle;
        this.descripcion=descripcion;
        this.id=id;
        //fotos=new ArrayList;
    }
    
    public String getFoto(){
        return this.foto;
    }
    
    public void setFoto(String url){
        this.foto = url;
    }
    
    public Viviendas(){
        
    }
    
    public void rellenar_formulario_cita(){
        
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String agregarVivienda(Viviendas emp) throws SQLException{
        String mensaje = "";
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarVivienda(conn, emp);
            
            
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
    public String eliminarVivienda(Viviendas emp) throws SQLException{
        String mensaje = "";
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.eliminarVivienda(conn, emp.getId());
            
            
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
   public String[][] listarViviendas(JTable Tabla) throws SQLException{
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();
        
        return consulta.mostrarVivienda(conn, Tabla);
        
    }
   public String[][] listarViviendasPrecioGaP(JTable Tabla) throws SQLException{
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();
        
        return consulta.mostrarViviendaPrecioGaP(conn, Tabla);
        
    }
   public String[][] listarViviendasPrecioPaG(JTable Tabla) throws SQLException{
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();
        
        return consulta.mostrarViviendaPrecioPaG(conn, Tabla);
        
    }
   
   
}
