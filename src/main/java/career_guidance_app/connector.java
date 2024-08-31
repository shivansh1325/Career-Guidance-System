/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package career_guidance_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class connector {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/career_guidance_system";
        String user="root";
        String password="root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION IS SUCESSFULL TO DATABASE");
            String query="Insert into signup_info(name) values('ram')";
            Statement statement = connection.createStatement();
            statement.execute(query);
            System.out.println("DONE");
        } catch (Exception e) {
        }
    }
}
