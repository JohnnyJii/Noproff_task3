package main.heroes;

import main.Hero;
import main.items.armor.*;
import main.items.weapons.*;

public class Mage extends Hero {

    Weapon equippedWeapon;
    Armor equippedArmor;
    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Mage(Hero hero) {
        super(hero.getSpecies(), hero.getStr(), getLevel(),
                hero.getLevel(), hero.getDex(), hero.getIntel()
                , hero.getEquippedArmor(), hero.getEquippedWeapon());
        String species ="";
        int dex = 0;
        int hp = 0;
        int intel = 0;
        int str = 0;
    }

    @Override
    public String toString(){
        return "Species: " + this.species + "\n Dexterity: " + this.dex +
                "\n Strength: " + this.str + "\n Health points: " + this.hp +
                "\n Intelligence: " + this.intel;
    }



    @Override
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    /*
    public int calculateAttack() {
        if(this.getEquippedWeapon() instanceof Magic) {
            return this.getIntel();
        } else {
            return 0;
        }
    }

    public int calculateDefense() {
        if(this.getEquippedArmor() instanceof Cloth) {
            return this.getDex();
        } else {
            return 0;
        }
    }

     */

}
