/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * 
 */
public class DataBaseConnection {
    
    
    public Connection Conn = null;
    public ResultSet RSet = null;
    
    
    private PreparedStatement FectSL ;
    
    public Connection dbcon ()
            
    {
    
    try {

      Class.forName("com.mysql.cj.jdbc.Driver");
   

     }catch (ClassNotFoundException e){ //System.out.println("driver not found");
     }
       
try{

   Conn =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/carrent" , "root", "MirhaKhan"  );
 
   if (Conn!=null) {     }   
   } catch(SQLException sqlex){
   
 
    System.out.println(sqlex.getMessage());
   System.out.println(sqlex.getErrorCode());
  
   }
           
    
   return  Conn;
    }
 
    
}
