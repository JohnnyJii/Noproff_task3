package main.heroes;

import main.Hero;

public class Mage extends Hero {

    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Mage(String species, int dex, int hp, int intel, int str, String name) {
        super(name);
        this.species=species;
        this.dex=dex;
        this.hp=hp;
        this.intel=intel;
        this.str=str;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
        species = "Mage";
    }

    @Override
    public void setDex(int dex) {
        this.dex = dex;
        dex = 3;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
        hp = 100;
    }

    @Override
    public void setIntel(int intel) {
        this.intel = intel;
        intel = 5;
    }

    @Override
    public void setStr(int str) {
        this.str = str;
        str = 2;
    }
}

