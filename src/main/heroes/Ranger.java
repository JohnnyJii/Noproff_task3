package main.heroes;

import main.Hero;

public class Ranger extends Hero {

    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Ranger(Hero hero) {
        super(hero.getSpecies(), hero.getStr(), hero.getLevel(),
                hero.getLevel(), hero.getDex(), hero.getIntel(),
                Hero.getEquippedArmor(), Hero.getEquippedWeapon());
    }

    //Setters
    public void setSpecies(String species) {
        this.species = species;
        species = "Ranger";
    }

    public String getSpecies() {
        return species;
    }

    public int getDex() {
        return dex;
    }

    public int getHp() {
        return hp;
    }

    public int getIntel() {
        return intel;
    }

    public int getStr() {
        return str;
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

