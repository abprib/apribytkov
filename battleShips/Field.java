package Lessons.battleShips;

import java.util.ArrayList;

class Field {
    int fieldSize = 10;
    //First number of decks, second - amount of ships of that type
    int[][] shipTypesAmount = {{1, 4}, {2, 3}, {3, 2}, {4, 1}};
    char[][] field = new char[fieldSize][fieldSize];
    ArrayList<Ship> ships = new ArrayList<>();

    void createNewField() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                this.field[i][j] = '.';
            }
        }
    }

    void generateShips() {
        for (int i = 0; i < shipTypesAmount.length; i++) {
            for (int j = 0; j < shipTypesAmount[i][1]; j++) {
                Ship ship = new Ship();
                ship.setFieldSize(fieldSize);
                ship.setDecks(shipTypesAmount[i][0]);
                generateNewShip(ship);
                placeOnField(ship);
            }
        }
    }

    //Randomly generate ships
    void generateNewShip(Ship ship) {
        int x;
        int y;
        int direction;
        boolean isGood = false;
        while (!isGood) {
            isGood = false;
            do {
                direction = magic(2);
                x = magic(fieldSize);
                y = magic(fieldSize);
                if (isEmpty(x, y)) isGood = true;
            } while (!isGood);
            switch (direction) {
                case 0: {
                    //test if all cells are empty in this direction
                    for (int i = 1; i < ship.decks; i++) {
                        if (isEmptyAround(x + i, y)) {
                            isGood = true;
                        } else {
                            isGood = false;
                            break;
                        }
                    }
                    if (isGood) {
                        for (int i = 0; i < ship.decks; i++) {
                            ship.addDeck(x + i, y);
                        }
                    }
                }
                break;
                case 1: {
                    for (int i = 1; i < ship.decks; i++) {
                        if (isEmptyAround(x, y + i)) {
                            isGood = true;
                        } else {
                            isGood = false;
                            break;
                        }
                    }
                    if (isGood) {
                        for (int i = 0; i < ship.decks; i++) {
                            ship.addDeck(x, y + i);
                        }
                    }
                }
                break;
            }//switch
        }
    }

    boolean makeDamage(int x, int y) {
        boolean b = false;
        for (Ship s : ships)
            for (Deck d : s.decksList) {
                if ((d.getX() == x) && (d.getY() == y)) {
                    d.setCondition('X');
                    b = true;
                    field[x][y] = 'X';
                } else {
                    field[x][y] = '*';
                }
            }
        return b;
    }

    //Randomizer
    int magic(int interval) {
        return (int) (Math.random() * interval);
    }

    void placeOnField(Ship ship) {
        for (int i = 0; i < ship.decks; i++) {
            field[ship.decksList.get(i).x][ship.decksList.get(i).y] =
                    ship.decksList.get(i).condition;
        }
        ships.add(ship);
    }

    void printField() {
        System.out.print("  ");
        for (int i = 0; i < fieldSize; i++) {
            System.out.print((char) (i + 65) + " ");
        }
        System.out.println("");
        for (int i = 0; i < fieldSize; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
    }

    void printShips() {
        for (int i = 0; i < ships.size(); i++) {
            System.out.print("#" + i + "." + ships.get(i).decks + "-decker: ");
            for (int j = 0; j < ships.get(i).decksList.size(); j++) {
                System.out.print(ships.get(i).decksList.get(j).condition);
            }
            System.out.println(" ");
        }
    }

    boolean isEmpty(int x, int y) {
        boolean b = true;
        try {
            if (field[x][y] != '.') b = false;
        } catch (Exception ex) {
            b = false;
        }
        return b;
    }

    boolean isEmptyAround(int x, int y) {
        boolean b = true;
        for (int i = -1; i < 2; i++)
            for (int j = -1; j < 2; j++)
                if (!isEmpty(x + i, y + j)) {
                    b = false;
                    return b;
                }
        return b;
    }
}