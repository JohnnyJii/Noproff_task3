package main;

import java.io.Serializable;
import main.Hero;
import main.items.armor.Armor;
import main.items.weapons.Weapon;

public class Hero implements Serializable {
    private static Weapon equippedWeapon;
    private static Armor equippedArmor;
    String species;
    int hp;
    int str;
    int dex;
    int intel;
    static int level;

    public Hero(String species, int heroStr, int str, int level, int dex, int intel, Armor equippedArmor, Weapon equippedWeapon) {
        this.species = species;
        this.str = str;
        this.level = level;
        this.intel = intel;
        this.dex = dex;
        equippedArmor = equippedArmor;
        equippedWeapon = equippedWeapon;
    }

    public static int dex() {
        int dex = 0;
        return dex;
    }

    public static int intel() {
        int intel = intel();
        return intel;
    }

    public Object str() {
        int str = (int) str();
        return str;
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

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
        dex = 0;
    }

    public int getIntel() {
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
}