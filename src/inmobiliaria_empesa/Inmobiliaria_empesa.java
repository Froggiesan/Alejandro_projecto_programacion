
package inmobiliaria_empesa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
public class Inmobiliaria_empesa {

    public static void main(String[] args) throws SQLException {
        
        Controlador contr = new Controlador();
        Connection conn = acceso_a_BD.getConnection();
        
        String[][] mensaje;
        mensaje = contr.mostrarUsuario2(conn);
        for(String[] msg:mensaje){
            System.out.println(Arrays.toString(msg));

        }
        
        
    }
    
    
    
}
