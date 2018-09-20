/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
MYADMIN Crear tabla, en paquete agregar libreria MYSQL
Crear clase Conexion.java
 */
package conexionmysqlcorba;

/**
 *
 * @author Usuario
 */
public class ConexionMysqlCorba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Conexion objConex=new Conexion();
        objConex.conectar();
    }
    
}
