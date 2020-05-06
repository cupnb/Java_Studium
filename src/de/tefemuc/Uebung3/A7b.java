package de.tefemuc.Uebung3;

public class A7b {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder();
        for (String value : args){
            s = s.insert(0, value);
        }
        s = s.reverse();
        System.out.println(s.toString().replace('-', '_'));
    }
}
