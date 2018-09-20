package conexionmysqlcorba;
import  java.sql.*;

public class Conexion{
    public Connection Conexion;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion=DriverManager.getConnection("jdbc:mysql://localhost/conexionmysqlcorba","root","");
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          return Conexion;
    }
}
