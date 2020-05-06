package de.tefemuc.Uebung1;

import java.util.Random;

public class A4 {
    public static int myRandom(){
        Random rand = new Random();
        return rand.nextInt(10000) + 1;
    }

    public static int mySum(int bound){
        int sum = 0;
        for (int i = 3; i < bound; i += 2){
            sum += i;
        }
        return sum;
    }

    public static int myGt(int i){
        if (i % 2 == 0){
            return i / 2;
        } else {
            for (int j = (int) Math.ceil((double) i / 2.0); j > 0; j--){
                if (i % j == 0){
                    return j;
                }

            }
            return -1;
        }
    }


}
