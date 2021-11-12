package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;

public class ViewPokemonAPI implements ViewPokemon {
    public  void printPokemon(Pokemon pokemon){
        System.out.println("=============================");
        System.out.println("Pokemon #"+pokemon.getId());
        System.out.println("Name : "+pokemon.getName());
        System.out.println("Size : "+pokemon.getSize());
        System.out.println("Weight : "+pokemon.getWeight());
        System.out.println("=============================");
    }

}
