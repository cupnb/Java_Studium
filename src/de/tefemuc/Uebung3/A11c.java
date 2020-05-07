package de.tefemuc.Uebung3;

import java.util.Random;
import java.util.stream.IntStream;

public class A11c {

    public static void main(String[] args){
        Random r = new Random();
        IntStream s = IntStream.generate(() -> r.nextInt(100));

        s
                .limit(10)
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
