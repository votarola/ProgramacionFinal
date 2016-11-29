/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author alexander
 */

public class conexion_consulta { 
  
    private Connection conexion; 
    public Connection getConexion() { 
    return conexion; 
    } 

    public void setConexion(Connection conexion) { 
    this.conexion = conexion; 
    } 

    public conexion_consulta conectar()
            
    { 
    try 
    { 
    Class.forName("com.mysql.jdbc.Driver"); 
    String base = ("jdbc:mysql://localhost/video_juegos/root/12345"); 

    setConexion (DriverManager.getConnection(base)); 

    if (conexion != null) { 
    System.out.println("conexion OK"); 
    } 

    else 
    System.out.println("conexion x"); 
    } 
    catch (Exception e) 
    { 
    e.printStackTrace(); 
    } 
    return this; 


    } 
   
 
    
}
