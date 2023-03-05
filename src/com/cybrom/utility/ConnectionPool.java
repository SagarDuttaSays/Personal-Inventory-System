package com.cybrom.utility;
import java.sql.*;
public class ConnectionPool {
    static Connection con = null;
    public static Connection connectionDB()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cybrom", "root", "duttasagar086");
            System.out.println("Connection established successfully.");
        }
        catch (Exception e)
        {
            System.out.println("Connection not established due to "+e);
        }
        return con;
    }
    public static void main(String[] args) {
        connectionDB();
    }
}
