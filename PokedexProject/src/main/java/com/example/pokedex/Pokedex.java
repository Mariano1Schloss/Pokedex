package com.example.pokedex;


import com.example.pokedex.controllers.PokedexAPIController;
import com.example.pokedex.controllers.PokedexDTBController;
import com.example.pokedex.utilities.Generator;
import com.example.pokedex.utilities.OutputHtmlGenerator;
import com.example.pokedex.views.ViewPokemonAPI;
import com.example.pokedex.views.ViewerDTB;

public class Pokedex {

    public static void main(String[] args) {
        System.out.println("It's working !"+"number of arguments given : "+args.length);
        //If the user only enters one argument. We call the PokemonViewerAPI class that also calls the PokemonControllerAPI

        if (args.length ==1) {
            System.out.println("Vous avez fourni l'argument " + args[0]);
            ViewPokemonAPI view=new ViewPokemonAPI();
            PokedexAPIController controller=new PokedexAPIController();
            view.printPokemon(controller.findPokemon(Integer.parseInt(args[0])));
        }

        //If the user enters two arguments. We call the PokemonViewerSQL class that also calls the PokemonControllerSQL;

        if (args.length ==2) {
            System.out.println("Vous avez fourni l'argument " + args[0] +" et "+ args[1]);
            ViewerDTB.printPokemon(PokedexDTBController.findPokemon(Integer.parseInt(args[0]),args[1]));
        }

        /*
        com.example.pokedex.services.SQLLiteExample.run();

        com.example.pokedex.services.HTTPRequestExample.run();
        */



    }

    public String getName() {
        return "Hello";
    }
}
