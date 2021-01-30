package main.items.weapons;

import main.Hero;

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

    public void setMeleeStr(int meleeStr) {
        this.meleeStr = meleeStr;
        meleeStr = (int) (Hero.str() * 1.5);
    }

}
