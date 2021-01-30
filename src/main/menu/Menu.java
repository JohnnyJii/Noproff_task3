package main.menu;

import main.Hero;
import main.heroes.HeroTypeMaker;

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
                System.out.println("\n Please make a selection: ");
                choice = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid selection!");
            }
        }
        return choice;
    }

    public void mage() {
        HeroTypeMaker mageMaker = new HeroTypeMaker();
        Hero mageHero = new Hero("NAme2", "species", 150, 10, 90);
        System.out.print("\n You chose Mage! \n here are your stats");
        System.out.println(mageHero);
    }

    public void ranger() {
        HeroTypeMaker rangerMaker = new HeroTypeMaker();
        Hero rangerHero = new Hero(" Name3", "species", 150, 10, 90);
        System.out.println("\nYou chose Ranger!");
        System.out.println("here are your stats:");
        System.out.println(rangerHero);
    }

    public void warrior() {
        HeroTypeMaker warriorMaker = new HeroTypeMaker();
        Hero warriorHero = new Hero("NAme2", "species", 150, 10, 90);
        System.out.print("\n You chose Warrior! \n here are your stats");
        System.out.println(warriorHero);
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                quit = true;
                System.out.println("See ya!!!");
                break;
            case 1:
                warrior();
                quit = true;
                break;
            case 2:
                mage();
                quit = true;
                break;
            case 3:
                ranger();
                quit = true;
                break;
            default:
                System.out.println("System error!!!");
        }
    }
}
