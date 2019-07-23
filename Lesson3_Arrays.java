package Lessons;

import java.util.*;
import java.util.stream.IntStream;

public class Lesson3_Arrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int[] a1 = new int[10];
        a1[0] = 1;
        Arrays.fill(a1,2);
        System.out.println(a1[0]);
        System.out.println((a1.length));
        String[] a2 = {"uno", "dos"};
        //Generate an array
        int[] unoDos10 = IntStream.rangeClosed(1,10).toArray();

        //Inhenced loop
        for(int x: unoDos10) System.out.println(x);

        System.out.println(Arrays.binarySearch(unoDos10,9)); //Returns index

        //Multidimentional arrays
        int a3[][] = new int[2][2];
        String[][] a4 = {{"00", "10"},{"01","11"}};

        System.out.println(a4[1][1]);

        int a6[] = {1,2,3};
        int a7[] = Arrays.copyOf(a6,3);
        System.out.println(Arrays.equals(a6,a7));
        int a8[] = {3,2,1};
        Arrays.sort(a8);
        System.out.println((Arrays.toString(a8)));

        //Array List
        ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue");
        //Generate Array
        ArrayList<Integer> aL2 = new ArrayList<>();
        aL2.add(1);
        aL2.add(2);
        aL2.add(3);
        aL2.add(4);
        for(Integer x: aL2) System.out.print(x);
        System.out.println(aL2.get(1));
        aL2.set(1,5);
        aL2.remove(3);
        //aL2.clear(a2);

        Iterator it = aL2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Linked List
        LinkedList<Integer> iL1 = new LinkedList<Integer>();
        iL1.add(1);
        iL1.add(2);
        iL1.add(3);
        iL1.addAll(Arrays.asList(1,2,3,4));
        iL1.addFirst(0);
        iL1.addLast(1);
        System.out.println(iL1.contains(4));
        System.out.println(iL1.indexOf(4));
        iL1.set(0,2); //replace
        System.out.println(iL1.get(0));
        iL1.remove(1);
        System.out.println(iL1.size());
        Object[] a9 = iL1.toArray();
        for(Integer x: iL1) System.out.println((x));



    }
}
