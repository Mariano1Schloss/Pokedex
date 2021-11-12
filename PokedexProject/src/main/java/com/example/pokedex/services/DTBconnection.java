package com.example.pokedex.services;

import org.sqlite.SQLiteConfig;

import java.sql.*;
//This class creates a connection with a local SQlite database
public class DTBconnection {

    private static Connection sqlConnection;

    public static void connect(String dtbName)
    {
        sqlConnection = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:"+dtbName;
            // create a connection to the database
            sqlConnection = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Getter

    public static Connection getSqlConnection() {
        return sqlConnection;
    }
}
