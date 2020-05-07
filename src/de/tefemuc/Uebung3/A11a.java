package de.tefemuc.Uebung3;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class A11a {

    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = r.nextInt(101); i > 0; i--){
            list.add(Integer.valueOf(r.nextInt(10000) + 1));
        }

        list.removeIf(n -> (n % 2 != 0));

        list.forEach(n -> print(n));
    }

    private static void print(int n){
        if (n > 900) System.out.println(n);
    }

}
