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
    private int precio;

    public Alquileres(String calle, int id, String descripcion,int id_alquiler) {
        super(calle, id, descripcion);
        this.id_alquiler=id_alquiler;
        
        
    }

    public Alquileres(String calle, String description, int precio) {
        this.precio = precio;
        super.setCalle(calle);
        super.setDescripcion(description);
    }

    public Alquileres(){
        
    }

    public Alquileres(String calle, int id, String descripcion, int id_alquiler, int alquiler) {
        super(calle, id, descripcion);
        this.id_alquiler = id_alquiler;
        this.precio = alquiler;
    }

    public int getAlquiler() {
        return precio;
    }

    public void setAlquiler(int alquiler) {
        this.precio = alquiler;
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

    
    
    public String agregarAlquiler() throws SQLException{
        super.agregarVivienda((Viviendas) this);
        String[][] viviendas = super.listarViviendas();
        for (String[] vivienda : viviendas){
            if (vivienda[0].equals(super.getCalle())){
                super.setId(Integer.parseInt(vivienda[2]));
            }
        }

        String mensaje="";
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarAlquiler(conn, this);
            
            
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
        return "Alquileres{" +
                "id_alquiler=" + id_alquiler +
                ", precio=" + precio +
                '}';
    }
}
