package de.tefemuc.Uebung3;

import java.util.stream.IntStream;

public class A11f {

    public static void main(String[] args){
        IntStream s = IntStream.range(1, 10);

        System.out.println((s.reduce((x, y) -> x * y)).getAsInt());
    }
}
