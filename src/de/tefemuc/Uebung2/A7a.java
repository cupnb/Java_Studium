package de.tefemuc.Uebung2;

public class A7a {
    public static void main(String[] args){
        String str = "";

        for (String arg : args) {
            str = str + arg;
        }

        String[] s = str.split("([-])");

        for (String value : s) {
            if (!value.equals("")) {
                System.out.println(value);
            }
        }
    }
}
