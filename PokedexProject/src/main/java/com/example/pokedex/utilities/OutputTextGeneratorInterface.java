package com.example.pokedex.utilities;

import com.example.pokedex.models.Pokemon;

public interface OutputTextGeneratorInterface extends OutputGeneratorInterface {
    public String generateText(Pokemon pokemon);

}
