package inmobiliaria_empesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Properties;
import javax.swing.JOptionPane;

import oracle.ucp.jdbc.PoolDataSourceFactory;
import oracle.ucp.jdbc.PoolDataSource;



public class acceso_a_BD{
    // Metemos la URL
    final static String DB_URL="jdbc:oracle:thin:@//localhost/XE";
    // Entramos con el usuario del sistema
    final static String DB_USER = "system";
    // Ponemos la contraseña
    final static String DB_PASSWORD = "1234";
    final static String CONN_FACTORY_CLASS_NAME="oracle.jdbc.pool.OracleDataSource";
    private static Connection conn=null;
    
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("oracle.jdbc.pool.OracleDataSource");
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            conn.setAutoCommit(false);
            if(conn !=null){
                System.out.println("Conexion exitosa");
            }else{
                System.out.println("Conexion erronea");
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexion erronea");
        }
        return conn;
    }
    public void desconectar(){
        try {
            conn .close();
        } catch (Exception e) {
            System.out.println("Error al desconectar"+e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        // Get a pooled connection
        PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();
        // Set the connection factory
        pds.setConnectionFactoryClassName(CONN_FACTORY_CLASS_NAME);
        pds.setURL(DB_URL);
        pds.setUser(DB_USER);
        pds.setPassword(DB_PASSWORD);
        pds.setConnectionPoolName("JDBC_UCP_POOL");

        // Metemos las propiedades de la conexion
        pds.setInitialPoolSize(5);
        pds.setMinPoolSize(5);
        pds.setMaxPoolSize(20);
        pds.setTimeoutCheckInterval(5);
        pds.setInactiveConnectionTimeout(10);

        // Get the database connection from UCP
        try (Connection conn = pds.getConnection()) {
            //doSQLWork(conn);
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
    }
}
