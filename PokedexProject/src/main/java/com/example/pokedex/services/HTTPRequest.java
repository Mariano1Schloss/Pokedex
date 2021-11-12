package com.example.pokedex.services;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


import java.io.IOException;
/*
*This class send a http request to the remote API https://pokeapi.co/api/v2/pokemon/
* to get informations from a pokemon with a specified id into a jsonResponse String
 */

public class HTTPRequest {
    private int id;

    //Constructor

    public HTTPRequest(int id) {
        this.id = id;
    }

    public String request(){
        String jsonResponse = "";
        try {

            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/"+this.id);
            request.addHeader("content-type", "application/json");
            HttpResponse result = httpClient.execute(request);
            jsonResponse = EntityUtils.toString(result.getEntity(), "UTF-8");


        }catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResponse;
    }

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
