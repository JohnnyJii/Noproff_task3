package main.heroes;

public class HeroTypeMaker {
    public HeroType getType(String type) {
        if (type.equalsIgnoreCase("Mage")) {
            return new Mage();
        }

        if (type.equalsIgnoreCase("Warrior")) {
            return new Warrior();
        }

        if (type.equalsIgnoreCase("Ranger")) {
            return new Ranger();
        }
        return null;
    }
}
