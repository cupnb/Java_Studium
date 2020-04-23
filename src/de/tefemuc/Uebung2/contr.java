package de.tefemuc.Uebung2;

public class contr {
    public static void main(String[] args){
        A2.a();
        A2.newline();
        A2.randBool();
        A2.randCount();
        A2.rand099();

        String[] arg = {"Hallo", "Welt"};
        A3.a(arg);
        A3.b(arg);

        A3.c(arg);

        arg = new String[] {"Hello"};
        A3.c(arg);

        arg[0] = "Yxlophon";
        A3.c(arg);

        arg = new String[] {"Hello", "Hello"};
        A3.d(arg);

        arg[0] = "Hello";
        arg[1] = "Hell";
        A3.d(arg);

        arg = new String[] {"18750"};
        A3.e(arg);

        arg[0] = "187SFN";
        A3.e(arg);

        int r = A4.myRandom();
        System.out.println("Die Summe der ungeraden Zahlen zwischen 1 und " + r + " ist: " + A4.mySum(r) + "\n");
        System.out.println("Der groesste Teiler von " + r + " ist: " + A4.myGt(r));
    }
}
