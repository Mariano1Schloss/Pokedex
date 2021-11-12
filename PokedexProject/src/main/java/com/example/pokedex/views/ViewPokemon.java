package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;

//This interface will be used depending if we want to print informations from a API's pokemon or a Database pokemon
public interface ViewPokemon {
    public static void printPokemon(Pokemon pokemon){};
}
