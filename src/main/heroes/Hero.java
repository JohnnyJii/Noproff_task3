package main.heroes;

import java.io.Serializable;
import java.util.logging.Level;

import main.items.armor.Armor;
import main.items.weapons.Weapon;

public abstract class Hero {
    protected Weapon equippedWeapon;
    protected Armor equippedArmor;
    protected String species;
    protected int hp;


    protected int str;
    protected int dex;
    protected int intel;
    protected int level;

    public Hero(String species, Armor equippedArmor, Weapon equippedWeapon) {
        this.species = species;
        this.equippedArmor = equippedArmor;
        this.equippedWeapon = equippedWeapon;
    }

    public int dex() {
        return dex;
    }

    private void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Armor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStr() {
        return str;
    }


    public String toString() {
        return "Species: " + this.species + "\n Dexterity: " + this.dex +
                "\n Strength: " + this.str + "\n Health points: " + this.hp +
                "\n Intelligence: " + this.intel;
    }

}