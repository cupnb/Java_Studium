package de.tefemuc.Uebung3;

import java.util.Random;
import java.util.stream.IntStream;

public class A11b {

    public static void main(String[] args){
        Random r = new Random();
        IntStream s = r.ints(500);
        s
                .limit(10)
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
