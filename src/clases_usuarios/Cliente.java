/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_usuarios;


import java.util.Date;

public class Cliente extends Usuario {
    
    public Cliente(String nombre, String apellido1,String apellido2, int edad, String numero_telefono, String sexo, int id, String nick, String contrasena,String correo) {
        super(nombre, apellido1,apellido2, edad, numero_telefono, sexo, id, nick, contrasena,correo);
    }
    
    

    @Override
    public void acceder_calculadora() {
        super.acceder_calculadora(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultar_cita() {
        super.consultar_cita(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ver_pisos_alquiler() {
        super.ver_pisos_alquiler(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ver_pisos_ventas() {
        super.ver_pisos_ventas(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
