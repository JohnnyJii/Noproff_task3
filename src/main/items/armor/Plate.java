package main.items.armor;

public class Plate extends Armor {

    String plateArmor;
    int hpPlate;
    int strPlate;
    int dexPlate;


    public Plate(String armorName){
        super(armorName);
        this.plateArmor=plateArmor;
        this.hpPlate=hpPlate;
        this.strPlate=strPlate;
        this.dexPlate=dexPlate;
    }

    public void setPlateArmor(String plateArmor) {
        this.plateArmor = plateArmor;
        plateArmor = "PlateArmor";
    }

    public void setHpPlate(int hpPlate) {
        this.hpPlate = hpPlate;
        hpPlate = 30;
    }

    public void setStrPlate(int strPlate) {
        this.strPlate = strPlate;
        strPlate = 3;
    }

    public void setDexPlate(int dexPlate) {
        this.dexPlate = dexPlate;
        dexPlate = 1;
    }
}
