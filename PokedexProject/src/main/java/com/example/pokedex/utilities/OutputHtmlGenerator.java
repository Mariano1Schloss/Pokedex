package com.example.pokedex.utilities;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonDTB;

public class OutputHtmlGenerator  implements OutputHtmlGeneratorInterface{
    public  String generateHtml(PokemonDTB pokemon){
        String Newligne=System.getProperty("line.separator");
        String Pokemon="Pokemon #"+pokemon.getId();
        String name= "Name : "+pokemon.getName();
        String id="Id : "+pokemon.getId();
        String size = "Size : "+pokemon.getSize();
        String weight = "Weight : "+pokemon.getWeight();
        String description="Description : "+pokemon.getDescription();
        return ("<h1>"+name+"</h1>"+Newligne+"<ul>"+Newligne+"<li>"+id+"</li>"+Newligne+"<li>"+size+"</li>"+Newligne+"<li>"+weight+"</li>"+Newligne+"<li>"+description+"</li>"+Newligne+"</ul>");

    }
}
