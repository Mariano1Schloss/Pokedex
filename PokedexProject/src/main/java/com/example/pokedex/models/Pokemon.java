package com.example.pokedex.models;
//This class defines a pokemon
public class Pokemon {

    //attributes

    private int weight;
    private int id;
    private int size;
    private String name;

    //constructors
    public Pokemon(int weight, int id, int size, String name) {
        this.weight = weight;
        this.id = id;
        this.size = size;
        this.name = name;
    }

    public Pokemon(){
        this.id=1;
        this.name="bulbasaur";
        this.size=7;
        this.weight=69;
    }
    //getters and setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
