package de.tefemuc.Uebung3;

public class A8 {
    public A8(){ //Sozusagend die main Methode
        double[][] d = myMatrixRandom(4, 5);
        myMatrixPrint(d);
        myMatrixPrint(myMatrixSwap(d, 2, 4));
    }

    private static double[][] myMatrixRandom(int x, int y){

        double[][] d = new double[y][x];

        for (double[] row : d){
            for (int i = 0; i < row.length; i++){
                row[i] = Math.random();
            }
        }

        return d;
    }

    private static void myMatrixPrint(double[][] d){
        for (double[] row : d){
            for (double val : row){
                System.out.print(String.format("%.20f", val) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static double[][] myMatrixSwap(double[][] d, int rowNum1, int rowNum2){
        rowNum1--;
        rowNum2--;

        double[] temp = d[rowNum1];
        d[rowNum1] = d[rowNum2];
        d[rowNum2] = temp;
        return d;
    }



}
