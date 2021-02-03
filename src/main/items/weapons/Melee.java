package main.items.weapons;

import main.heroes.Hero;

public class Melee extends Weapon {

    String weaponName;
    int damageMelee;
    int meleeStr;

    public Melee(String weaponType, String weaponName, int damageMelee, int meleeStr){
        super(weaponType);
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
        meleeStr = hero.getStr();
        double meleeStrength = meleeStr * 1.5;
    }

    public void useWeapon() {

    }
}
