package de.tefemuc.Uebung1;

public class example_min_number {
    static int b = 6;
    public static void main(String args[])
    {
        int a = 11;
        int min = m(a, b);
        System.out.println("Minimum Value = " + min);
    }
    public static int m(int n1, int n2)
    {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}