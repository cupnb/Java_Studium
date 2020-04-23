package de.tefemuc.Uebung2;

public class A3 {

    public static void a(String[] args){
        System.out.println("Aufgabe 3a");
        System.out.println("Anzahl der Parameter: " + args.length);
    }

    public static void b(String[] args){
        System.out.println("Aufgabe 3b");
        if (args.length == 0){
            System.out.println("Keine Parameter!");
            return;
        }
        System.out.println(args[0].charAt(args[0].length() - 1) + "\n");
    }

    public static void c(String[] args){
        System.out.println("Aufgabe 3c");
        if (args.length != 1){
            System.err.println("Fehler\n");
            return;
        }
        int index = args[0].indexOf('x');

        if (index == -1){
            System.out.println("Kein 'x' im Parameter gefunden!\n");
            return;
        }
        System.out.println("Das erste 'x' befindet sich an Position: " + (index + 1) + "\n");

    }

    public static void d(String[] args){
        System.out.println("Aufgabe 3d");

        if (args.length != 2){
            System.err.println("Fehler\n");
            return;
        }

        if (args[0].equals(args[1])){
            System.out.println("Parameter sind gleich!\n");
        } else {
            System.out.println("Parameter sind unterschiedlich!\n");
        }
    }

    public static void e(String[] args){
        System.out.println("Aufgabe 3e");

        if (args.length != 1){
            System.err.println("Fehler\n");
            return;
        }

        if (args[0].matches("\\b\\d{5}\\b")){
            System.out.println("Fünfstellige Zahl\n");
        } else {
            System.out.println("Keine fünfstellige Zahl\n");
        }
    }
}
