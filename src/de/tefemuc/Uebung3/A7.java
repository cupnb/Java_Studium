package de.tefemuc.Uebung3;

public class A7 {
    public static void a(String[] args){

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

    public static void b(String[] args){
        StringBuilder s = new StringBuilder();
        for (String value : args){
            s = s.insert(0, value);
        }
        s = s.reverse();
        System.out.println(s.toString().replace('-', '_'));
    }
}
