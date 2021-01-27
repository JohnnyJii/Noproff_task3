package main.settings;

public class HeroSettings {
    private static HeroSettings heroSettings = null;

    private int warriorHp = 150;
    private int warriorStr = 10;
    private int warriorDex = 3;
    private int warriorInt = 1;

    public static HeroSettings getInstance() {
        if(heroSettings == null) {
            heroSettings = new HeroSettings();
        }
        return heroSettings;
    }

    public int getWarriorHp() {
        return warriorHp;
    }

    public void setWarriorHp(int warriorHp) {
        this.warriorHp = warriorHp;
    }

    public int getWarriorStr() {
        return warriorStr;
    }

    public void setWarriorStr(int warriorStr) {
        this.warriorStr = warriorStr;
    }

    public int getWarriorDex() {
        return warriorDex;
    }

    public void setWarriorDex(int warriorDex) {
        this.warriorDex = warriorDex;
    }

    public int getWarriorInt() {
        return warriorInt;
    }

    public void setWarriorInt(int warriorInt) {
        this.warriorInt = warriorInt;
    }

}
