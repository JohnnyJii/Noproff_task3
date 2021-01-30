package main.heroes;

import main.Hero;
import main.items.armor.*;
import main.items.weapons.*;

public class Warrior extends Hero {

    Weapon equippedWeapon;
    Armor equippedArmor;
    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Warrior(Hero hero) {
        super(hero.getSpecies(), hero.getStr(), hero.getLevel(),
                hero.getLevel(), hero.getDex(), hero.getIntel(),
                hero.getEquippedArmor(), hero.getEquippedWeapon());

    }


    public void setSpecies(String species) {
        this.species = species;
        species = "Warrior";
    }

    public String getSpecies() {
        return species;
    }

    public void setDex(int dex) {
        this.dex = dex;
        dex = 3;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
        hp = 150;
    }

    @Override
    public void setIntel(int intel) {
        this.intel = intel;
        intel = 1;
    }

    @Override
    public void setStr(int str) {
        this.str = str;
        str = 10;
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

    public int calculateAttack() {
        if(this.getEquippedWeapon() instanceof Melee) {
            return this.getDex();
        } else {
            return 0;
        }
    }
    public int calculateDefense() {
        if(this.getEquippedArmor() instanceof Leather) {
            return this.getDex();
        } else {
            return 0;
        }
    }
}

