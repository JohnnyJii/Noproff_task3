package main.menu;

import main.heroes.*;
import main.items.armor.Armor;
import main.items.armor.Plate;
import main.items.weapons.Melee;
import main.items.weapons.Weapon;

import java.util.Scanner;

public class Menu {
    boolean quit;

    public void runMenu() {
        while(!quit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printMenu() {
        System.out.println("\n Who do you want to be?");
        System.out.println("1) Warrior");
        System.out.println("2) Mage");
        System.out.println("3) Ranger");
        System.out.println("0) Quit");
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice >=5) {
            try {
                System.out.println("Please make a selection: ");
                choice = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid selection!");
            }
        }
        return choice;
    }

    public void warrior() {
        Armor myArmor  = new Plate("Plate");
        Weapon myWeapon = new Melee("Sword", "Atlas", 5, 5);
        Warrior myWarrior = new Warrior("Warrior", myArmor, myWeapon);
        System.out.println(myWarrior.toString());
    }

    public void mage() {

    }

    public void ranger() {

    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                quit = true;
                System.out.println("See ya!!!");
                break;
            case 1:
                System.out.print("basic stats for Warrior are: ");
                warrior();
                quit = true;
                break;
            case 2:
                System.out.print("Mage basic stats are: ");
                mage();
                quit = true;
                break;
            case 3:
                System.out.println("Basic stats for Ranger are: ");
                ranger();
                quit = true;
                break;
            default:
                System.out.println("System error!!!");
        }
    }
}
