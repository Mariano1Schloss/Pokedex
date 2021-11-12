package com.example.pokedex.controllers;

import com.example.pokedex.models.PokemonDTB;
import com.example.pokedex.services.DTBGetData;

/*This interface implements the PokedexController interface
 * This class takes in charge the calling of services functions
 * to send the request and get the response for the database
 *It returns the pokemon found
 * */

public class PokedexDTBController implements PokedexController {
    public static PokemonDTB findPokemon (int id, String dtbName){
        DTBGetData sqlData = new DTBGetData();
        sqlData.getDataFromSQL(id,dtbName);     //We get data from our database and fill this data into a pokemon

        return sqlData.getPokemonDTB();       //We return the pokemon from the DTBGetData instance
    }
}
