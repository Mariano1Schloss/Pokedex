package com.example.pokedex.controllers;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.services.HTTPRequest;
import com.example.pokedex.services.HTTPResponse;
/*This interface implements the PokedexController interface
* This class takes in charge the calling of services functions
* to send the request and get the response for the API
*It returns the pokemon found
* */

public class PokedexAPIController implements PokedexController {
    public Pokemon findPokemon(int id){
        Pokemon pokemon= new Pokemon();
        HTTPRequest request = new HTTPRequest(id);
        HTTPResponse response= new HTTPResponse(request.request(), pokemon);
        response.parse(response.getJsonResponse());
        return pokemon;
    }
}
