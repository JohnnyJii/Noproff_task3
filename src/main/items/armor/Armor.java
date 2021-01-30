package main.items.armor;

public class Armor {

    String armorName;
    double headArmor;
    double bodyArmor;
    double legArmor;

    public Armor(String armorName){
        this.armorName = armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public void setHeadArmor(double headArmor) {
        this.headArmor = headArmor;
        headArmor = 0.8;
    }

    public void setBodyArmor(double bodyArmor) {
        this.bodyArmor = bodyArmor;
        bodyArmor = 1.0;
    }

    public void setLegArmor(double legArmor) {
        this.legArmor = legArmor;
        legArmor = 0.6;
    }
    public String getArmorName() {
        return armorName;
    }

    public double getHeadArmor() {
        return headArmor;
    }

    public double getBodyArmor() {
        return bodyArmor;
    }

    public double getLegArmor() {
        return legArmor;
    }

}
