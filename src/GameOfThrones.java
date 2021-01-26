import java.util.Scanner;
import main.heros.*;

public class GameOfThrones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give your hero name: ");
        String heroName = sc.nextLine();

        Hero hero1 = new Hero();
            hero1.setName(heroName);
            hero1.setSpecies(""); // make a new scanner variable for species
            hero1.setHealth(100);
            hero1.setMana(10);
            hero1.setLevel(10);
            hero1.levelUp = -1;

        System.out.println(hero1);

    }
}
