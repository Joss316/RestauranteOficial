package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-C4O2B7U:1433;databaseName=Restaurante;user=usuariosql;password=123;";
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Nos conectamos");
        
        
    }
    }
    
