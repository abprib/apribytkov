package Lessons.tipToeGame;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean allRight = false;
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        char xo = ' ';
        while(!allRight) {
            System.out.print("What do you choose, X or O? ");
            xo = sc.next().toLowerCase().charAt(0);
            if(xo == 'o' || xo == 'x') allRight = true;
        }
        System.out.println("Play with " + xo);
        game.newGame(xo, sc);
        sc.close();
    }
}