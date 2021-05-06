/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_viviendas;

public class Ventas extends Viviendas {
    private int id_venta;
    private int id_viviendas;
    
    public Ventas(String calle, int id, String descripcion,int id_venta) {
        super(calle, id, descripcion);
        this.id_venta=id_venta;
        
    }
    public Ventas(){
        
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

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_viviendas() {
        return id_viviendas;
    }

    public void setId_viviendas(int id_viviendas) {
        this.id_viviendas = id_viviendas;
    }
    
    
    
    
    
    
    
    
    
    
}
