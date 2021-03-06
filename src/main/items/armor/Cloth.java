package main.items.armor;

public class Cloth implements Armors {

    String armorCloth;
    int hpCloth;
    int intCloth;
    int dexCloth;

    public Cloth(String armorName){
        this.armorCloth = armorCloth;
        this.hpCloth = hpCloth;
        this.intCloth = intCloth;
        this.dexCloth = dexCloth;
    }

    public void setArmorCloth(String armorCloth) {
        this.armorCloth = armorCloth;
         armorCloth = "ClothArmor";
    }

    public void setHpCloth(int hpCloth) {
        this.hpCloth = hpCloth;
        hpCloth = 10;
    }

    public void setIntCloth(int intCloth) {
        this.intCloth = intCloth;
        intCloth = 3;
    }

    public void setDexCloth(int dexCloth) {
        this.dexCloth = dexCloth;
        dexCloth = 1;
    }

    @Override
    public void useArmor() {
        this.armorCloth = armorCloth;
    }
}
