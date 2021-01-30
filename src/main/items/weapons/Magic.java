package main.items.weapons;

import main.Hero;

public class Magic extends Weapon {

    String weaponName;
    int damageMagic;
    int intelMagic;

    public Magic(String weaponType, String weaponName, int damageMagic, int intelMagic) {
        super(weaponType);
        this.weaponName = weaponName;
        this.damageMagic = damageMagic;
        this.intelMagic = intelMagic;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
        weaponName = "Magic";
    }

    public void setDamageMagic(int damageMagic) {
        this.damageMagic = damageMagic;
        damageMagic = 25;
    }

    public void setIntelMagic(int intelMagic) {
        this.intelMagic = intelMagic;
        intelMagic = Hero.intel() * 3;
    }
}
