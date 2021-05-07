/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_usuarios;

import inmobiliaria_empesa.Controlador;
import inmobiliaria_empesa.acceso_a_BD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JTable;


public class Trabajador extends Usuario {
    private int id_usuario;
    private int id_trabajador;
    private int ventas;
    private int sueldo;
    
    
    public Trabajador(String nombre, String apellido1,String apellido2, int edad, String numero_telefono, String sexo, int id, String nick, String contrasena,String correo,int id_trabajador,int ventas) {
        super(nombre, apellido1,apellido2, edad, numero_telefono, sexo, id, nick, contrasena,correo);
        this.id_trabajador=id_trabajador;
        this.ventas=ventas;
    }   
    public Trabajador(){
        
    }
    
    
    //Creamos los metodos para las consultas
    public void consulta_BD(String consulta){
        
    }
    
    
    
    private int return_ventas(){
        return ventas;
    }
    @Override
    public void consultar_cita(){
        
    }
    @Override
    public void acceder_calculadora(){
        
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id_trabajador=" + id_trabajador + ", ventas=" + ventas + '}';
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    private String mensaje="";
    public String agregarTrabajador(Trabajador emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarTrabajador(conn, emp);
            
            
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
    public String modificarTrabajador(Trabajador emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
       
        try {
            mensaje = controladora.modTrabajador(conn, emp);
            
            
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
    public String eliminarTrabajador(Trabajador emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        
        try {
            mensaje = controladora.eliminarTrabajador(conn, id_trabajador);
            
            
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

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }
    public String[][] listarTrabajador(JTable Tabla) throws SQLException{
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();
        
        return consulta.mostrarTrabajador(conn, Tabla);
        
    }
    
}
