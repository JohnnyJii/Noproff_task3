package main.heroes;

import main.items.armor.*;
import main.items.weapons.*;

public abstract class Ranger extends Hero {

    Weapon equippedWeapon;
    Armor equippedArmor;
    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Ranger(String species, Armor equippedArmor, Weapon equippedWeapon) {
        super(species, equippedArmor, equippedWeapon);

    }

    @Override
    public String toString() {
        return "Species: " + this.species + "\n Dexterity: " + this.dex +
                "\n Strength: " + this.str + "\n Health points: " + this.hp +
                "\n Intelligence: " + this.intel;
    }
}
/*
    //Setters
    public void setSpecies(String species) {
        this.species = species;
        species = "Ranger";
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public int getDex() {
        return dex;
    }

    @Override
    public void setDex(int dex) {
        this.dex = dex;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getIntel() {
        return intel;
    }

    @Override
    public void setIntel(int intel) {
        this.intel = intel;
    }

    @Override
    public int getStr() {
        return str;
    }

    @Override
    public void setStr(int str) {
        this.str = str;
    }
}
*/

