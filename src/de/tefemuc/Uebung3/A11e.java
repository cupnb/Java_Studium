package de.tefemuc.Uebung3;

import java.util.stream.IntStream;

public class A11e {

    public static void main(String[] args){

        IntStream s = IntStream.range(1, 20);
        System.out.println(s.filter(n -> (n % 2 != 0)).sum());
    }
}
