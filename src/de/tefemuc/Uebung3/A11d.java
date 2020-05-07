package de.tefemuc.Uebung3;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A11d {

    public static void main(String[] args){
        Random r = new Random();
        int n = r.nextInt(10000) + 1;
        System.out.println(n);

        IntStream s = buildDivStream(n);

        s.forEach(x -> System.out.println(x));
    }

    private static IntStream buildDivStream(int n){
        IntStream.Builder b = IntStream.builder();
        int div = n / 2;
        while (div != 0){
            if (n % div == 0){
                b.accept(div);
            }
            div--;
        }

        return b.build();
    }
}
