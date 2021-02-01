package main.menu;

import main.heroes.*;
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

    private static void askName() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        System.out.println("Give name: ");
        String name = sc.nextLine();
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
        Warrior warrior = new Warrior(null) {
            @Override
            protected String getStr() {
                return toString();
            }

            @Override
            public Object str() {
                return null;
            }
        };
        warrior.toString();
    }

    public void mage() {
        Mage mage = new Mage(null) {
            @Override
            protected String getStr() {
                return null;
            }

            @Override
            public Object str() {
                return null;
            }
        };
        mage.toString();
    }

    public void ranger() {
        Ranger ranger = new Ranger(null) {
            @Override
            protected String getStr() {
                return null;
            }

            @Override
            public Object str() {
                return null;
            }
        };
        ranger.toString();
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
