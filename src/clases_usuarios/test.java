
package clases_usuarios;

import inmobiliaria_empesa.Controlador;
import java.sql.SQLException;


public class test {
    
    Usuario dibo = new Usuario();
    Usuario emp = new Usuario();
    
    String mensaje ="";
    public void insertar() throws SQLException{
        emp.setNombre("Julio"); //1
        emp.setApellido1("Jamau"); //2
        emp.setApellido2("Ramon"); //3
        emp.setContrasena("1234"); //4
        emp.setFecha_nacimiento(36); //5
        emp.setCorreo("correo"); //6
        emp.setNick("Jamau"); //7
        
        emp.setNumero_telefono("662589455"); //9
        
        mensaje = dibo.agregarUsuario(emp);
    }
    public static void main(String[]args) throws SQLException{
        test Test = new test();
        Test.insertar();
        
    }
    
    
    
}
