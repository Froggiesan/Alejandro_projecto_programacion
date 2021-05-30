package inmobiliaria_empresa_Clases_Viviendas;

import inmobiliaria_empesa.BBDD.Controlador;
import inmobiliaria_empesa.BBDD.acceso_a_BD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTable;

public class Viviendas {
    private String calle;
    private int id;
    private String descripcion;
    private ArrayList<String> fotos = new ArrayList<>();

    public Viviendas(String calle, int id, String descripcion) {
        this.calle = calle;
        this.descripcion = descripcion;
        this.id = id;

    }


    public Viviendas(String calle, int id, String descripcion, String fotos) {
        this.calle = calle;
        this.descripcion = descripcion;
        this.id = id;
        this.setFoto(fotos);
    }

    public String getFoto() {
        return String.join(",", this.fotos);
    }


    public void setFoto(String url) {
        String[] fotos = url.split(",");
        this.fotos.addAll(Arrays.asList(fotos));
    }

    public Viviendas() {

    }

    public void rellenar_formulario_cita() {

    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Viviendas{" +
                "calle='" + calle + '\'' +
                ", id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fotos=" + fotos +
                '}';
    }

    public String agregarVivienda(Viviendas emp) throws SQLException {
        String mensaje = "";
        Connection conn;
        conn = acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.agregarVivienda(conn, emp);


        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String eliminarVivienda(Viviendas emp) throws SQLException {
        String mensaje = "";
        Connection conn;
        conn = acceso_a_BD.getConnection();
        Controlador controladora = new Controlador();
        try {
            mensaje = controladora.eliminarVivienda(conn, emp.getId());


        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String[][] listarViviendas() throws SQLException {
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();

        return consulta.mostrarVivienda(conn);

    }

    public String[][] listarViviendasPrecioGaP() throws SQLException {
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();

        return consulta.mostrarViviendaPrecioGaP(conn);

    }

    public String[][] listarViviendasPrecioPaG() throws SQLException {
        Connection conn = acceso_a_BD.getConnection();
        Controlador consulta = new Controlador();

        return consulta.mostrarViviendaPrecioPaG(conn);
    }

    public void cargarFotos(){
        try{
            Connection conn = acceso_a_BD.getConnection();
            Controlador consulta = new Controlador();
            this.fotos = consulta.getFotosVivienda(conn, this.id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
