package com.example.pokedex.services;

import java.sql.*;

public class SQLLiteExample {
    public static void run() {
        /* Connect to the database */
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:/Users/ICM2 A/TB 3/good practices/TP 1/PokedexProject/pokemondatabase.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

            PreparedStatement stmt  = conn.prepareStatement("SELECT name, description FROM pokemons WHERE id = ?");
            stmt.setInt(1, 1);
            ResultSet rs    = stmt.executeQuery();
            rs.next();
            System.out.println("Pokémon name : " + rs.getString("name"));
            System.out.println("Pokémon description : " + rs.getString("description"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
