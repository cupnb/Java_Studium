package de.tefemuc.Uebung4.A14a;

import java.util.ArrayList;
import java.util.Random;

public class A14a {

    public static void main(String[] args){
        Random r = new Random();
        ArrayList<GeometricObject> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(new Circle(new Point(r.nextInt(99) + 1, r.nextInt(99) + 1), (r.nextInt(20) + 1)));
        }

        for (int i = 0; i < 10; i++){
            list.add(new Rectangle(new Point(r.nextInt(99) + 1, r.nextInt(99) + 1), (r.nextInt(20) + 1), (r.nextInt(20) + 1)));
        }

        list.stream()
                .forEach(n -> System.out.println(n.toString()));

        double max = list.stream()
                .mapToDouble(n -> n.getArea())
                .max().getAsDouble();

        System.out.println(max);
    }
}
