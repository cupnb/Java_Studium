package de.tefemuc.Uebung1;

public class A2 {
    public static void a(){
        System.out.println("Aufgabe 2a");
        for(int i = 0; i < 10000; i++){
            System.out.print("a");
        }
        System.out.println("\n");
    }

    public static void newline(){
        System.out.println("Aufgabe 2b");
        System.out.println("\\n\n");
    }

    public static void randBool(){
        System.out.println("Aufgabe 2c");
        double r = Math.random();
        if (r < 0.5){
            System.out.println("0\n");
        } else {
            System.out.println("1\n");
        }
    }

    public static void randCount(){
        System.out.println("Aufgabe 2d");
        int count = 0;
        double r;
        while (!((r = Math.random()) < 0.1 || r > 0.9)){
            count++;
        }

        System.out.println("Anzahl der Zufallszahlen: " + count + "\n");
    }

    public static void rand099(){
        System.out.println("Aufgabe 2e");
        int count = 0;
        for (int i = 0; i < 1000000; i++){
            if (Math.random() > 0.99){
                count++;
            }
        }
        System.out.println("Anzahl der Zufallszahlen über 0.99: " + count + "\n");
    }


}
