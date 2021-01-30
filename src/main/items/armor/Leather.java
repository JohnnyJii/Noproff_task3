package main.items.armor;

public class Leather extends  Armor {

    String leatherArmor;
    int hpLeather;
    int dexLeather;
    int strLeather;
    double headLeather;
    double bodyLeather;
    double legsLeather;

    public Leather(String armorName){
        super(armorName);
        this.leatherArmor = leatherArmor;
        this.hpLeather = hpLeather;
        this.dexLeather = dexLeather;
        this.strLeather = strLeather;
    }

    public void setLeatherArmor(String leatherArmor) {
        this.leatherArmor = this.leatherArmor;
        this.leatherArmor = "Leather";
    }

    public void setHpLeather(int hpLeather) {
        this.hpLeather = hpLeather;
        hpLeather = 20;
    }

    public void setDexLeather(int dexLeather) {
        this.dexLeather = dexLeather;
        dexLeather = 3;
    }

    public void setStrLeather(int strLeather) {
        this.strLeather = strLeather;
        strLeather = 1;
    }
}
