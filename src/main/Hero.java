package main;

import java.util.ArrayList;
import java.util.List;
import main.updaters.LevelObserver;

abstract public class Hero {
    int hp;
    int str;
    int dex;
    public static int intel;
    int mana;
    String name;
    String species;
    double experience;
    double levelUp;
    int level;
    private List<LevelObserver> levelObservers = new ArrayList<>();

    public static int intel() {
        return 0;
    }

    public static int str() {
        return 0;
    }

    public static int dex() {
        return 0;
    }

    public void addLevelObserver(LevelObserver levelObserver) {
        levelObservers.add(levelObserver);
    }

    public void removeLevelObserver(LevelObserver levelObserver) {
        levelObservers.remove(levelObserver);
    }


    public Hero(String name) {
        this.hp = 0;
        this.str = 0;
        this.dex = 0;
        this.intel= 0;
        this.mana = 0;
        this.species = "";
        this.name = "";
        this.experience = 0.0;
        this.levelUp = 0.0;
        this.level = 0;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void gainExperience(double exp) {
        this.experience += exp;
        if(this.experience > this.levelUp) {
            this.gainLevel();
        }
    }

    public double getProgress() {
        return (this.experience/this.levelUp) * 100.0;
    }

    public void gainLevel() {
        this.experience = 0;
        this.level += 1;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n Species: " + this.species +
                "\n Health: " + this.hp + "\n Mana: " + this.mana +
                "\n Level: " + this.level + "\n Experience: " + this.experience +
                "\n Level up: " + this.levelUp;
    }
}