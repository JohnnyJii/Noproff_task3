package main.heroes;

import main.Hero;

public class Ranger extends Hero {
    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Ranger(String species, int dex, int hp, int intel, int str, String name) {
        super(name);
        this.species = species;
        this.dex = dex;
        this.hp = hp;
        this.intel = intel;
        this.str = str;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
        species = "Ranger";
    }

    @Override
    public void setDex(int dex) {
        this.dex = dex;
        dex = 10;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
        hp = 120;
    }

    @Override
    public void setIntel(int intel) {
        this.intel = intel;
        intel = 2;
    }

    @Override
    public void setStr(int str) {
        this.str = str;
        str = 5;
    }
}
