package Lessons.battleShips;

public class AI extends Player{
    boolean shoot(Field field){
        return field.makeDamage(magic(field.fieldSize),magic(field.fieldSize));
    }
    //Randomizer
    int magic(int interval){
        return (int)(Math.random()*interval);
    }
}
