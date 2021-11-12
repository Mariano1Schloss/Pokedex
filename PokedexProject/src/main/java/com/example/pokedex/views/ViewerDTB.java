package com.example.pokedex.views;

import com.example.pokedex.models.PokemonDTB;

public class ViewerDTB implements ViewPokemon{
    public static void printPokemon(PokemonDTB pokemon){
        String id = pokemon.getId() + "";
        String nom = pokemon.getName();
        String taille = pokemon.getSize() + "";
        String poids = pokemon.getWeight()+ "";
        String description =pokemon.getDescription()+"";
        System.out.println("====================");
        System.out.println("Pokemon # " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Taille :  # " + taille);
        System.out.println("Poids : " + poids);
        System.out.println("Description : "+ description);
        System.out.println("====================");

    }
}
