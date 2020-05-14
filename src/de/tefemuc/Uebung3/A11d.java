package de.tefemuc.Uebung3;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A11d {

    public static void main(String[] args){
        Random r = new Random();
        int rg = r.nextInt(10000) + 1;

        IntStream stream = IntStream.rangeClosed(2, rg / 2);
    		System.out.println(stream.filter(n -> rg % n == 0).count());
    	}
}
