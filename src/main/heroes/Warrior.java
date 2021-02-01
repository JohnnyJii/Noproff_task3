package main.heroes;

import main.items.armor.*;
import main.items.weapons.*;

public abstract class Warrior extends Hero {

    Weapon equippedWeapon;
    Armor equippedArmor;
    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Warrior(Hero hero) {
        super(hero.getSpecies(),
                hero.getStr(),
                hero.getLevel(),
                hero.getLevel(),
                hero.getDex(),
                hero.getIntel(),
                Hero.getEquippedArmor(),
                Hero.getEquippedWeapon());

    }

    @Override
    public String toString(){
        return "Species: " + this.species + "\n Dexterity: " + this.dex +
                "\n Strength: " + this.str + "\n Health points: " + this.hp +
                "\n Intelligence: " + this.intel;
    }
}

