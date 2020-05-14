package de.tefemuc.Uebung3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class A11g {

    public static void main(String[] args){
        Stream<String> t = Arrays.stream(args);
        Stream.Builder<String> s = Stream.builder();

        t.forEach(n -> s.accept(n.toUpperCase().replaceAll("[0-9]", "")));
        t = s.build();
        t
                .filter(n -> !n.isEmpty()).forEach(n -> System.out.println(n));
    }
}
