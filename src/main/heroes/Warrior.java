package main.heroes;

import main.items.armor.*;
import main.items.weapons.*;

public class Warrior extends Hero {
    public final static int WARRIOR_HEALTH = 150;
    public final static int WARRIOR_STRENGTH = 10;
    public final static int WARRIOR_DEX = 3;
    public final static int WARRIOR_INTEL = 1;

    public final static int WARRIOR_ADD_LEVEL_HP = 30;
    public final static int WARRIOR_ADD_LEVEL_STR = 5;
    public final static int WARRIOR_ADD_LEVEL_DEX = 2;
    public final static int WARRIOR_ADD_LEVEL_INT = 1;
    public Warrior(String species, Armor equippedArmor, Weapon equippedWeapon) {
        super(species, equippedArmor, equippedWeapon);
        this.str = WARRIOR_STRENGTH; //do this to all heroes
        this.hp = WARRIOR_HEALTH;
        this.dex = WARRIOR_DEX;
        this.intel = WARRIOR_INTEL;
        this.level = 1;

    }
}

