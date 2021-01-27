package main;

import java.util.ArrayList;
import java.util.List;
import main.updaters.LevelObserver;
import main.heros.HeroType;

public class Hero {
    public int health;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int mana;
    public String species;
    public String name;
    public double experience;
    public double levelUp;
    public int level;
    private HeroType type;
    private List<LevelObserver> levelObservers = new ArrayList<>();

    public void addLevelObserver(LevelObserver levelObserver) {
        levelObservers.add(levelObserver);
    }

    public void removeLevelObserver(LevelObserver levelObserver) {
        levelObservers.remove(levelObserver);
    }

    public void updateLevelObserver() {
        for (var levelObserver:levelObservers) {
            String word = type.play();
            levelObserver.listen(word);
        }
    }

    public Hero() {
        this.health = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.intelligence = 0;
        this.mana = 0;
        this.species = "";
        this.name = "";
        this.experience = 0.0;
        this.levelUp = 0.0;
        this.level = 0;
    }

    public Hero(String name, String species, int health, int mana, double levelUp) {
        this.name = name;
        this.species = species;
        this.health = health;
        this.mana = mana;
        this.levelUp = levelUp;
        this.level = 1;
        this.experience = 0;
    }

    public String word() {
        updateLevelObserver();
        return type.play();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
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
                "\n Health: " + this.health + "\n Mana: " + this.mana +
                "\n Level: " + this.level + "\n Experience: " + this.experience +
                "\n Level up: " + this.levelUp;
    }
}
