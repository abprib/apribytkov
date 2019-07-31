package Lessons.battleShips;

import java.util.Scanner;

class Game {
    Scanner sc = new Scanner(System.in);

    void start() {
        // System.out.print("Enter your name: ");
        // String playerName = new String(sc.next());
        clearScreen();
        Field humanField = new Field();
        Field aiField = new Field();
        humanField.createNewField();
        Human human = new Human();
        humanField.generateShips();
        System.out.println("Your board:");
        humanField.printField();
        // playerField.printField();
        aiField.createNewField();
        AI ai = new AI();
        System.out.println("Computer's board:");
        // aiField.printField();
        // clearConsole();
        aiField.generateShips();
        aiField.printField();
        for(int i = 0; i < 5; i++) {
            while (human.shoot(aiField, sc)) {
                clearScreen();
                humanField.printField();
                aiField.printField();
            }
            while (ai.shoot(humanField)) {
                clearScreen();
                humanField.printField();
                aiField.printField();
            }
        }
        humanField.printShips();
        aiField.printShips();



    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}