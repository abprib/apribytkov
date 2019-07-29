package Lessons.tipToeGame;

import java.util.Scanner;

class Game {

    Field field = new Field();
    boolean gameOver = false;

    public void newGame(char xo, Scanner sc) {
        int x;
        int y;
        char aiXO = 'x';
        boolean b = false;
        field.initField();
        field.drawField();
        if (xo == 'x') aiXO = 'o';
        while (!gameOver) {
            while (!b) {
                System.out.println("Enter coordinates (x,y): " );
                x = sc.nextInt();
                y = sc.nextInt();
                if(x >= 0 && x <= 2 && y >= 0 && y <= 2) {
                    if (isEmpty(x, y)) {
                        b = true;
                        makeTurn(x, y, xo);
                    } else System.out.println("Cell is not empty.");
                    } else System.out.println(("Press 0 or 1 or 3!"));
            }
            if (!gameOver) aiMakeTurn(aiXO);
            b = false;
        }
    }

     void makeTurn(int x, int y, char xo) {
        field.changeCell(x, y, xo);
        field.drawField();
        if (isWon(xo)) gameOver = true;
    }

    void aiMakeTurn(char aiXO) {
        boolean empty = false;
        int x = 0;
        int y = 0;
        if(isEmpty(1,1)){
            x = 1;
            y = 1;
        } else {
            while (!empty) {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
                empty = isEmpty(x, y);
            }
        }
        makeTurn(x, y, aiXO);
    }

    boolean isEmpty(int x, int y) {
        return field.cells[x][y] == '.';
    }

    boolean isWon(char xo) {
        for (int i = 0; i < 3; i++) {
            if (((field.cells[i][0] == xo) && (field.cells[i][1] == xo) && (field.cells[i][2] == xo))
                    || ((field.cells[0][i] == xo) && (field.cells[1][i] == xo) & (field.cells[2][i] == xo))
                    || ((field.cells[0][0] == xo) && (field.cells[1][1] == xo) & (field.cells[2][2] == xo))
                    || ((field.cells[2][0] == xo) && (field.cells[1][1] == xo) & (field.cells[0][2] == xo))) {
                System.out.println(xo + "'s won!");
                gameOver = true;
                break;
            }
        }
        return gameOver;
    }
}