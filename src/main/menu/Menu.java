package main.menu;

import main.Hero;

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

    }

    public void ranger() {

    }

    public void warrior() {

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
