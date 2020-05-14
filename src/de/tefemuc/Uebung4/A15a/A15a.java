package de.tefemuc.Uebung4.A15a;

public class A15a {

    public static void main(String args[]){
        Task  task1 = new Task("Laufen");
        task1.setPriority(2);
        System.out.println(task1.toString());

        Task task2 = new Task("Übungsblatt", 5);
        System.out.println(task2.toString());

        Task task3 = new Task("Einkaufen", 0);
        System.out.println(task3.toString());

        Task task4 = new Task("einkaufen", 3);

        System.out.println(task3.equals(task4));
    }
}
