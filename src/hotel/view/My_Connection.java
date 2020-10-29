/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nipun Lakshan
 */
public class My_Connection {
    
    private Connection con;
    private static My_Connection db;
    
    private My_Connection(){
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_hotel","root","");
            System.out.println("Connection Established");
            
        } 
        catch (Exception ex) {
            
            System.out.println(ex);
            
        }
    }
    
    public static My_Connection getDatabaseConnection(){
        if(db == null){
            db = new My_Connection();
        }
        return db;
        }
    public Connection getConnection(){
        return con;
        
    }
    
}