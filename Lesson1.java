package Lessons;

import java.util.*;
import java.util.stream.IntStream;

public class Lesson1 {

    static Scanner sc = new Scanner(System.in);

    final double pi = 3.14; //constant

    public static void main(String[] args){
        //public - any class has access to it
        //static - function that belongs to the class

        System.out.println("Hello World");

        //Max and Min values of data types

        System.out.println("Byte: " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println("Char: " + Character.MAX_VALUE + " " + Character.MIN_VALUE);
        System.out.println("Int: " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println("Float: " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE + " " + Double.MIN_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE + " " + Long.MIN_VALUE);

        //\n \t \b \r \f

        //Numerous data types
        float fl = 1.111111111111F;
        System.out.println("Float fl: " + fl);
        double dbl = 1.1111111111111;
        System.out.println("Double dbl: " + dbl);
        double thousand = 1e+3;
        System.out.println("1000=" + thousand);
        long BNum = 10_292_2928;

        //Casting
        int smInt = 10;
        long smLong = smInt;

        double cDbl = 1.234;
        int cInt = (int) cDbl;
        System.out.println(cInt);

        long bigLong = 232323033L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        String favNum = Double.toString(1.618);
        //Parsing  Byte.parseByte
        int strInt = Integer.parseInt("10");

        //Increment the number a++ , ++a, a += 10
        // Numerous math functions
        System.out.println("abs(-1) = "+Math.abs(-1));
        System.out.println("ceil(4.25) = "+Math.ceil(4.25));
        System.out.println("floor(4.25) = "+Math.floor(4.25));
        System.out.println("round(4.25) = "+Math.round(4.25));
        System.out.println("max(4,5) = "+Math.max(4,5));
        System.out.println("min(4,5) = "+Math.min(4,5));
        System.out.println("exp(1) = "+Math.exp(1));
        System.out.println("log(1) = "+Math.log(1));
        System.out.println("log10(1) = "+Math.log10(1));
        System.out.println("pow(2,2) = "+Math.pow(2,2));
        System.out.println("sqrt(4) = "+Math.sqrt(4));
        System.out.println("cbrt(4) = "+Math.cbrt(4));
        System.out.println("hypot(5,5) = "+Math.hypot(5,5));
        System.out.println("PI = "+Math.PI);

        //Random number
        int Nmin = 5;
        int Nmax = 30;
        int Nrandom = Nmin + (int)(Math.random() * ((Nmax - Nmin) + 1));
        System.out.println(Nrandom);







    }
}
