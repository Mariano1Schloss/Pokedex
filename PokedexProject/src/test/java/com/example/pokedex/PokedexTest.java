package com.example.pokedex;

import org.junit.Assert;
import org.junit.Test;

import com.example.pokedex.Pokedex;

import static org.junit.Assert.*;

public class PokedexTest {

    @Test
    public void getName() {
        Pokedex pokedex = new Pokedex();
        Assert.assertEquals("Hello", pokedex.getName());
    }
}