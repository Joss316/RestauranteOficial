package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class ConexionSQL {
    public static Connection conectar(){
        String URL = "jdbc:sqlserver://DESKTOP-C4O2B7U:1433;databaseName=Restaurante;user=usuariosql;password=123;";
        try{
            Connection con = DriverManager.getConnection(URL);
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
