package com.example.pokedex;


public class Pokedex {

    public static void main(String[] args) {
        System.out.println("It's working !");
        if (args.length > 0) {
            System.out.println("Vous avez fourni l'argument " + args[0]);
        }
        //com.example.pokedex.SQLLiteExample.run();
        com.example.pokedex.HTTPRequestExample.run();
        ViewPokemonAPI view=new ViewPokemonAPI();
        PokedexAPIController controller=new PokedexAPIController();
        view.printPokemon(controller.findPokemon(10));
    }

    public String getName() {
        return "Hello";
    }
}
