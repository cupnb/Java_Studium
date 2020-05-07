package de.tefemuc.Uebung3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class A10a {

    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = r.nextInt(101); i > 0; i--){
            list.add(Integer.valueOf(r.nextInt(1001)));
        }
        System.out.println((list.size() % 2 == 0) ? "Anzahl der Elemente ist gerade!" : list.get((list.size() / 2)).toString());

        Integer t = Integer.valueOf(500);
        System.out.println((list.contains(t)) ? list.indexOf(t) : "500 nicht vorhanden");

        Iterator<Integer> it = list.iterator();

        int max = 0, current;
        while (it.hasNext()) {
            current = it.next().intValue();
            max = Math.max(current, max);
        }
        System.out.println(max);

    }
}
