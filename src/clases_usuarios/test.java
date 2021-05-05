
package clases_usuarios;

import inmobiliaria_empesa.Controlador;
import java.sql.SQLException;


public class test {
    
    Usuario dibo = new Usuario();
    Usuario emp = new Usuario();
    
    String mensaje ="";
    public void insertar() throws SQLException{
        emp.setNombre("Julio");
        emp.setApellido1("Jamau");
        emp.setApellido2("Ramon");
        emp.setContrasena("1234");
        emp.setFecha_nacimiento(36);
        emp.setCorreo("correo");
        emp.setNick("Jamau");
        emp.setSexo("H");
        emp.setNumero_telefono("662589455");
        
        mensaje = dibo.agregarUsuario(emp);
    }
    public static void main(String[]args) throws SQLException{
        test Test = new test();
        Test.insertar();
    }
    
    
    
}
