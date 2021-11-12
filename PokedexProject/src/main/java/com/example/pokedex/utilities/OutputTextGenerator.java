package com.example.pokedex.utilities;

import com.example.pokedex.models.Pokemon;

public class OutputTextGenerator implements OutputTextGeneratorInterface{
    public  String generateText(Pokemon pokemon){

        String delimitator="=============================";
        String Pokemon="Pokemon #"+pokemon.getId();
        String name= "Name : "+pokemon.getName();
        String size = "Size : "+pokemon.getSize();
        String weight = "Weight : "+pokemon.getWeight();
        String Newligne=System.getProperty("line.separator");
        return (delimitator+Newligne+Pokemon+Newligne+name+Newligne+size+Newligne+weight+Newligne+delimitator);
    }
}
