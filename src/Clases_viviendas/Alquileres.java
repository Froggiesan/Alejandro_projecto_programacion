/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_viviendas;

/**
 *
 * @author Alejandro y Marta
 */
public class Alquileres extends Viviendas {
    private int id_alquiler;
    public Alquileres(String calle, int id, String descripcion,int id_alquiler) {
        super(calle, id, descripcion);
        this.id_alquiler=id_alquiler;
        
        
    }
    @Override
    public void next_foto() {
        super.next_foto(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void past_foto() {
        super.past_foto(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rellenar_formulario_cita() {
        super.rellenar_formulario_cita(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
