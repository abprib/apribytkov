package Lessons.battleShips;

import java.util.Scanner;

public class Human extends Player {
    boolean shoot(Field field, Scanner sc){
        System.out.println("Fire!!!");
        int y = sc.next().charAt(0) - 65;
        int x = sc.nextInt();
        return field.makeDamage(x ,y);
    }

}
