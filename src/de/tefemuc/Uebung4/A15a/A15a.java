package de.tefemuc.Uebung4.A15a;

public class A15a {

    public static void main(String args[]){
        A15aTask task1 = new A15aTask("Laufen");
        task1.setPriority(2);
        System.out.println(task1.toString());

        A15aTask task2 = new A15aTask("Übungsblatt", 5);
        System.out.println(task2.toString());

        A15aTask task3 = new A15aTask("Einkaufen", 0);
        System.out.println(task3.toString());

        A15aTask task4 = new A15aTask("einkaufen", 3);

        System.out.println(task3.equals(task4));
    }
}
