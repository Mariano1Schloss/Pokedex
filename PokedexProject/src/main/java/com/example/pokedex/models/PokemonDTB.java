package com.example.pokedex.models;
/*that class inherits from Pokemon Class.
*It is used to describe pokemons from the database , which have a String description
 */
public class PokemonDTB extends Pokemon {
    private String description;

    //Constructors
    public PokemonDTB(int weight, int id, int size, String name, String description) {
        super(weight, id, size, name);
        this.description = description;
    }

    public PokemonDTB() {
        this.setId(1);
        this.setName("bulbasaur");
        this.setSize(7);
        this.setWeight(69);
        this.description="Il a une étrange graine plantée sur son dos. Elle grandit avec lui depuis la naissance.";
    }

    //Getter and Setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
