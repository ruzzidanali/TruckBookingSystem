/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBConnection implements java.io.Serializable {
    public static Connection connection;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String myUrl = "jdbc:mysql://localhost:3306/trucksystem2";
            connection = DriverManager.getConnection(myUrl, "root", "admin");
        }catch (ClassNotFoundException | SQLException e){
            e.getMessage();
        }
        return connection;
    }
    public void closeConnection(){
        try{
            connection.close();
        }catch (SQLException e){
            e.getMessage();
        }
    }
}
