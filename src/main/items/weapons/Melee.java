package main.items.weapons;

import main.heroes.Hero;

abstract public class Melee implements Weapons {

    String weaponName;
    int damageMelee;
    int meleeStr;

    public Melee(String weaponType, String weaponName, int damageMelee, int meleeStr){

        this.weaponName = weaponName;
        this.damageMelee = damageMelee;
        this.meleeStr = meleeStr;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
        weaponName = "Melee";
    }

    public void setDamageMelee(int damageMelee) {
        this.damageMelee = damageMelee;
        damageMelee = 15;
    }

    public void setMeleeStr(int meleeStr, Hero hero) {
        this.meleeStr = meleeStr;
        meleeStr = (int) hero.str();
        double meleeStrength = meleeStr * 1.5;
    }

    @Override
    public void useWeapon() {

    }
}
