package de.tefemuc.Uebung3;

import java.util.Random;

public class A6 {
    public static void a(){
        Random r = new Random();
        char c = (char) r.nextInt(266);
        System.out.println(Character.getName(c) + " " + c);
        if (Character.isLowerCase(c)){
            System.out.println(Character.toUpperCase(c) + "\n");
        }
    }

    public static void b(){
        Random r = new Random();

        int rand = r.nextInt();

        System.out.println(rand);
        System.out.println(String.format("%32s",
                Integer.toBinaryString(rand)).replaceAll(" ", "0"));
        System.out.println(Integer.toOctalString(rand));
        System.out.println(Integer.toHexString(rand));
        System.out.println(Integer.bitCount(rand));
        System.out.println(Integer.numberOfLeadingZeros(rand));
        System.out.println(Integer.reverse(rand));
    }

    public static void c(){
        Random r = new Random();
        double a = Math.random();
        double n = r.nextInt(1000);
        double x = Math.pow(a, n);

        if (x > -Double.MIN_NORMAL && x < Double.MIN_NORMAL){
            System.out.println("Die Zahl ist nicht normalisierbar");
        } else {
            System.out.println("Die Zahl ist normalisierbar");
        }

        double y = 1.0 / x;
        Double yBox = Double.valueOf(y);
        if (yBox.isNaN()){
            System.out.println("Zahl ist NaN");
        } else {
            System.out.println("Zahl ist nicht NaN");
        }

        if (yBox.isInfinite()){
            System.out.println("Zahl ist inf");
        } else {
            System.out.println("Zahl ist nicht inf");
        }

        Double d = Double.valueOf(x);
        Double e = yBox;

        System.out.println(e.intValue());
    }
}
