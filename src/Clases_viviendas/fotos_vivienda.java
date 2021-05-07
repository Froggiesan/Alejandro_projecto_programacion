
package Clases_viviendas;

import inmobiliaria_empesa.Controlador;
import inmobiliaria_empesa.acceso_a_BD;
import java.sql.Connection;
import java.sql.SQLException;

public class fotos_vivienda{
    private int id_vivienda;
    private int id_foto;
    private String URL_foto;
    public fotos_vivienda(){
        
    }
    public fotos_vivienda(int id_vivienda,String url_foto) {
        this.URL_foto=url_foto;
        this.id_vivienda=id_vivienda;
        
    }
    
    public void add_foto_venta(){
        
    }
    public void add_foto_alquiler(){
        
    }

    public int getId_vivienda() {
        return id_vivienda;
    }

    public void setId_vivienda(int id_vivienda) {
        this.id_vivienda = id_vivienda;
    }

    public String getURL_foto() {
        return URL_foto;
    }

    public void setURL_foto(String URL_foto) {
        this.URL_foto = URL_foto;
    }
    private String mensaje = "";
    public String agregarFotosVivienda(fotos_vivienda emp) throws SQLException{
        Connection conn;
        conn= acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarFoto(conn, emp);
            
            
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
