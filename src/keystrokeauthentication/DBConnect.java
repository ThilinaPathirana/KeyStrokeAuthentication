/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokeauthentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilina Pathirana
 */
public class DBConnect {
    
    Connection conn = null;
    PreparedStatement pstm = null;
    
    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:LoginData.sqlite");
            System.out.println("Database Connection Successful");
            return conn;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    
}
