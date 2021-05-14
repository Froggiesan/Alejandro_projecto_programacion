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

/**
 *
 * @author Alejandro y Marta
 */
public class Alquileres extends Viviendas {
    private int id_alquiler;
    //private int id_viviendas;
    public Alquileres(String calle, int id, String descripcion,int id_alquiler) {
        super(calle, id, descripcion);
        this.id_alquiler=id_alquiler;
        
        
    }
    public Alquileres(){
        
    }
    

    @Override
    public void rellenar_formulario_cita() {
        super.rellenar_formulario_cita(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    
    
    public String agregarVenta(Alquileres emp) throws SQLException{
        String mensaje="";
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarAlquiler(conn, emp);
            
            
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
    
    
}
