package com.example.pokedex;

import com.example.pokedex.controllers.PokedexDTBController;
import com.example.pokedex.models.PokemonDTB;
import org.junit.Assert;
import org.junit.Test;

import com.example.pokedex.Pokedex;

import com.example.pokedex.models.Pokemon;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class PokedexTest {

    @Test
    public void getPokemon() {
        PokemonDTB pokemon = null;

        try {
            pokemon = PokedexDTBController.findPokemon(2,"/Users/pokemondatabase.sqlite");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(2, pokemon.getId());
        Assert.assertEquals("Herbizarre", pokemon.getName());
        Assert.assertEquals(10, pokemon.getSize());
        Assert.assertEquals(130, pokemon.getWeight());
        Assert.assertEquals("Alors que son bulbe grossit, il semble perdre son habilité à se tenir sur ses pattes", pokemon.getDescription());



    }

}
