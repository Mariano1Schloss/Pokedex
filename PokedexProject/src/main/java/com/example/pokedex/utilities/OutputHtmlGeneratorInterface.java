package com.example.pokedex.utilities;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonDTB;

public interface OutputHtmlGeneratorInterface extends OutputGeneratorInterface {
    public  String generateHtml(PokemonDTB pokemon);

}
