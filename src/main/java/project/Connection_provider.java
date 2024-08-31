/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project;
import java.sql.*;
public class Connection_provider {

   
    public static Connection getcon(){
        
        try {
            Class.forName("com.mysql.jdbc.driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/career_guidance_system","root","root");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
        
    }
}
