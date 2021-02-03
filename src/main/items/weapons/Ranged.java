package main.items.weapons;

import main.heroes.Hero;

public class Ranged implements Weapons {

    String weaponName;
    int rangedDamage;
    int rangedDex;

    public Ranged(String weaponType, String weaponName, int rangedDamage, int rangedDex) {

        this.weaponName = weaponName;
        this.rangedDamage = rangedDamage;
        this.rangedDex = rangedDex;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
        weaponName = "Ranged";
    }

    public void setRangedDamage(int rangedDamage) {
        this.rangedDamage = rangedDamage;
        rangedDamage = 5;
    }

    public void setRangedDex(int rangedDex) {
        this.rangedDex = rangedDex;

    }

    @Override
    public void useWeapon() {

    }
}
