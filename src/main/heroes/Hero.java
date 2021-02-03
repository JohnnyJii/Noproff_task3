package main.heroes;

import java.io.Serializable;
import java.util.logging.Level;

import main.items.armor.Armor;
import main.items.weapons.Weapon;

public abstract class Hero {
    private static Weapon equippedWeapon;
    private static Armor equippedArmor;
    private String species;
    private static int hp;
    private static int str;
    private static int dex;
    private static int intel;
    private static int level;

    public Hero(String species, String heroStr, int str, int level, int dex, int intel, Armor equippedArmor, Weapon equippedWeapon) {
        this.species = species;
        this.str = str;
        this.level = level;
        this.intel = intel;
        this.dex = dex;
        this.equippedArmor = equippedArmor;
        this.equippedWeapon = equippedWeapon;
    }

    public static int dex() {
        return dex;
    }

    private void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public static Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public static Armor getEquippedArmor() {
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

    /*public int getStr() {
        return str;
    } */

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public static int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public static int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    protected abstract String getStr();

    public abstract Object str();
}