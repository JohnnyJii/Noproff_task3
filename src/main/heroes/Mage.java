package main.heroes;

import main.items.armor.*;
import main.items.weapons.*;

public abstract class Mage extends Hero {

    Weapon equippedWeapon;
    Armor equippedArmor;
    String species;
    int dex;
    int hp;
    int intel;
    int str;

    public Mage(String species, Armor equippedArmor, Weapon equippedWeapon) {
        super(species, equippedArmor, equippedWeapon);
    }

    @Override
    public String toString(){
        return "Species: " + this.species + "\n Dexterity: " + this.dex +
                "\n Strength: " + this.str + "\n Health points: " + this.hp +
                "\n Intelligence: " + this.intel;
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
