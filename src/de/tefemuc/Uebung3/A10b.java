package de.tefemuc.Uebung3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class A10b {

    public static void main(String[] args){
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = r.nextInt(101); i > 0; i--){
            list.add(Integer.valueOf(r.nextInt(1001)));
        }

        System.out.println((list.size() % 2 == 0) ? "Anzahl der Elemente ist gerade!" : list.get((list.size() / 2)).toString());

        Integer t = Integer.valueOf(500);
        if (list.contains(t)) {
            System.out.println(list.indexOf(t));
        } else System.out.println("500 nicht vorhanden");

        Iterator<Integer> it = list.iterator();

        int max = 0;

        for (Integer i : list){
            max = Math.max(i, max);
        }
        System.out.println(max);

    }
}
