package de.tefemuc.Uebung3;

import java.util.Random;
import java.lang.Integer;

public class A6b {

	public static void main(String[] args) {
		Random rg = new Random();
		int rnd = rg.nextInt(Integer.MAX_VALUE) - (Integer.MAX_VALUE)/2;
		System.out.println("Zahl: " + rnd);
		System.out.println("Zahl in Binär: " + String.format("%32s",
				Integer.toBinaryString(rnd)).replaceAll(" ", "0") + "\nZahl in Oktal: " + Integer.toOctalString(rnd) +
				"\nZahl in Hex: " + Integer.toHexString(rnd) + "\nZahl in Dez: " + (long) rnd);
		System.out.println(Integer.bitCount(rnd));
		System.out.println(Integer.numberOfLeadingZeros(rnd));
		System.out.println(Integer.reverse(rnd));
	}

}
