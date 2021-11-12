package com.example.pokedex.services;


import com.example.pokedex.models.PokemonDTB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
This class get data from a database after that a connexion has been made by DTBConnection database
 */
public class DTBGetData {
    private PokemonDTB pokemon;
    private static DTBconnection sqlConnection;

    public PokemonDTB getPokemonDTB() {
        return pokemon;
    }

    //Constructor
    public DTBGetData()
    {
        pokemon = new PokemonDTB();
        sqlConnection = new DTBconnection(); //Getting a connection to the desired database by calling the SQLLiteConnection class.

    }

    public void getDataFromSQL(int pokemonId, String dbName)
    {
        try {
            sqlConnection.connect(dbName);
            PreparedStatement stmt  = sqlConnection.getSqlConnection().prepareStatement("SELECT * FROM pokemons WHERE id = ?");  // Forming the query
            stmt.setInt(1, pokemonId);
            ResultSet rs    = stmt.executeQuery();                                                                                  //Executing the query
            rs.next();                                                                                                              //Putting data in a result set
            pokemon.setId(pokemonId);
            pokemon.setName(rs.getString("name"));
            pokemon.setSize(Integer.parseInt(rs.getString("height")));
            pokemon.setWeight(Integer.parseInt(rs.getString("weight")));
            pokemon.setDescription(rs.getString("description"));                                                 //Forming the character

        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
