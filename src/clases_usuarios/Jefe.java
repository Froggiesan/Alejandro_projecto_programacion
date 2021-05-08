/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_usuarios;

import inmobiliaria_empesa.Controlador;
import inmobiliaria_empesa.acceso_a_BD;
import java.sql.Connection;
import java.util.Date;
import clases_usuarios.Trabajador;
import java.sql.SQLException;
import javax.swing.JTable;

public class Jefe extends Usuario {
    private final int id_jefe;
    private int ventas;
    private int sueldo;
    
    public Jefe(String nombre, String apellido1,String apellido2, int edad, String numero_telefono, String sexo, int id, String nick, String contrasena,String correo, int id_jefe,int ventas) {
        super(nombre, apellido1,apellido2, edad, numero_telefono, sexo, id, nick, contrasena,correo);
        this.id_jefe=id_jefe;
        this.ventas=ventas;
    }
    
    public void add_empleado(){
        
    }
    
    public void add_ventas(){
        
    }
    
    public void consulta_BD(String consulta){
        
    }
    @Override
    public void consultar_cita(){
        
    }
    @Override
    public void acceder_calculadora(){
        
    }
    public void delete_empleado(){
        
    }
    public void add_vivienda(){
        
    }
    public void delete_vivienda(){
        
    }
    public void mod_vivienda(){
        
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    

    @Override
    public String toString() {
        return "Jefe{" + "id_jefe=" + id_jefe + ", ventas=" + ventas + '}';
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public String[][] listarUsuario(JTable Tabla) throws SQLException{
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();
        
        return consulta.mostrarJefe(conn);
        
    }
    
    
   
    
}
