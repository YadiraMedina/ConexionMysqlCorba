
package conexionmysqlcorba;

import java.sql.*;
import Terceros.*;
import javax.swing.JOptionPane;

public class Tercero extends TerceroPOA{
    //atributo de tipo conexion
    Conexion objConec=new Conexion();

    @Override
    public boolean insertarTercero(String nombre, String apellido, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarTercero(int id, String nombre, String apellido, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarTercero(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarTercero(int id) {
       String resultado="";
        try {
            String sqlConsultar="Select * from terceros where id="+ id;
            objConec.conectar();
            Statement st=objConec.Conexion.createStatement();
            ResultSet rs=st.executeQuery(sqlConsultar);
            while(rs.next()){
                resultado+=rs.getString(2)+ "-"
                        + rs.getString(3)+ "-"
                        + rs.getString(4);
            }
            //Se cierran las conexiones
            rs.close();
            objConec.Conexion.close();
        } catch (Exception e) {
            System.out.print("Error"+ e.getMessage());
        }
       
       return resultado; 
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet cargarTercero(){
        ResultSet resultado=null;
        try {
            String sql="SELECT nombres, apellidos, telefono FROM terceros";
            objConec.conectar();
            Statement st=objConec.Conexion.createStatement();
            resultado=st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+ e.getMessage());
        }
        return resultado;
    }
}
