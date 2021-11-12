package com.example.pokedex.services;

import com.example.pokedex.models.Pokemon;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/*
*this class turn the information got by HTTPRequest into a Pokemon instance
 */
public class HTTPResponse {
    private String jsonResponse;

    private Pokemon pokemon;
    //Constructor
    public HTTPResponse(String jsonResponse, Pokemon pokemon) {
        this.jsonResponse = jsonResponse;
        this.pokemon = pokemon;
    }
    public void parse(String jsonResponse){
        try{
            JSONParser parser = new JSONParser();
            Object resultObject = parser.parse(jsonResponse);
            if (resultObject instanceof JSONObject) {
                JSONObject obj =(JSONObject)resultObject;
                int id=Math.toIntExact((Long)obj.get("id"));
                int size=Math.toIntExact((Long)obj.get("height"));
                int weight=Math.toIntExact((Long)obj.get("weight"));
                String name=obj.get("name").toString();
                pokemon.setId(id);
                pokemon.setName(name);
                pokemon.setWeight(weight);
                pokemon.setSize(size);
            } else {
                System.err.println("Error, we expected a JSON Object from the API");
            }
        }catch (ParseException e) {
            System.err.println("Could not parse the response given by the API as JSON");
            System.err.println("Response body is :");
            System.err.println(jsonResponse);
            e.printStackTrace();
        }
    }
    //Getters
    public String getJsonResponse() {
        return jsonResponse;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}
