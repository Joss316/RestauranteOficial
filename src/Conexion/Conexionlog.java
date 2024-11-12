
package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexionlog {

    public String URL = "jdbc:sqlserver://DESKTOP-SG1C8QC\\TEW_SQLEXPRESS2:1433;databaseName=BD_UBUNTUCINE;user=usuariosql;password=321;";
    public Connection cn = null;
    public Statement st= null;

  public Statement Conectar(){
      try{
          Connection cn = DriverManager.getConnection(URL);
          st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
          
      }catch(SQLException i)
      {
          JOptionPane.showMessageDialog(null,i);
      }
      return st;
}
}
