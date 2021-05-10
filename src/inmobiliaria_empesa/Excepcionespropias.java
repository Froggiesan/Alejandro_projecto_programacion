/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_empesa;

import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class Excepcionespropias extends SQLException {
    
    public Excepcionespropias(){}
        
    
    public Excepcionespropias(String msj_error){
        super(msj_error);
        
    }
    //Las excepciones propias están lanzadas cuando hago las tablas para mostrar usuarios,clientes etc
   
    
    
}
