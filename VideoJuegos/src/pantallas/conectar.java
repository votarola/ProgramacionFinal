/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

/**
 *
 * @author Victor Otarola M
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/video_juegos","root","12345");
       if (conectar != null) { 
        System.out.println("conexion OK"); 
        } 

        else 
        System.out.println("conexion x"); 
        } 
        catch (Exception e) 
        { 
        e.printStackTrace(); 
        } 
            return conectar;
        }
    
}