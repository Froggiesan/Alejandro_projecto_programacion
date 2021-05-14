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

public class Ventas extends Viviendas {
    private int id_venta;
    //private int id_viviendas;
    
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
    public String agregarVenta(Ventas emp) throws SQLException{
        String mensaje="";
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarVenta(conn, emp);
            
            
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
