package de.tefemuc.Uebung3;

import java.util.Random;
import java.util.TreeSet;

public class A10d {
    public static void main(String[] args){
        Random r = new Random();
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = r.nextInt(101); i > 0; i--){
            set.add(Integer.valueOf(r.nextInt(1001)));
        }

        System.out.println((set.size() % 2 == 0) ? "Die Anzahl der Elemente ist gerade" : "Die Anzahl der Elemente ist ungerade");

        System.out.println((set.contains(Integer.valueOf(500))) ? "500 vorhanden" : "500 nicht vorhanden");

        System.out.println(set.stream().max(Integer::compare).get().toString());

    }
}
