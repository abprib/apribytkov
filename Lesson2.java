package Lessons;

import java.util.Scanner;

public class Lesson2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        String name = "Andey";
        String wName = name + " Pribytkov";
        System.out.println(wName.charAt(0));
        System.out.println(wName.contains("drey"));
        System.out.println(wName.indexOf("drey"));
        System.out.println(wName.length());

        //Comparing Strings
        System.out.println("a equals b : " + ("a".equals("b")));
        System.out.println("a equals b : " + ("a".equalsIgnoreCase("b")));
        System.out.println(wName.compareTo("ABC"));
        System.out.println(wName.replace("ov", "off"));

        System.out.println(wName.substring(0,6));

        //Inhenced for loop
        for(String x: wName.split(" ")) System.out.println((x));

        //trim toUpperCase toLowerCase

        //String builders and buffers
        StringBuilder sb = new StringBuilder("I am the firestarter");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); //characters in builder. If empty = 16, then ^16
        sb.append(", Yeah!");
        System.out.println(sb.insert(9, "Big "));
        System.out.println(sb.replace(5,12, "small"));
        System.out.println(sb.subSequence(5,11));
        System.out.println(sb.delete(5,11));
        System.out.println(sb.charAt(9));
        System.out.println(sb.indexOf("Yeah!"));
    }
}
