package de.tefemuc.Uebung2;

import java.util.Random;

public class A6c {

	public static void main(String[] args) {
		double a = Math.random();

		Random rg = new Random();
		int n = rg.nextInt(999) + 1;

		double x = Math.pow(a, n);

		if(x < Double.MIN_NORMAL)
			System.out.println("Zahl nicht normalisiert darstellbar \n");
		else
			System.out.println("x^n= " + x);

		Double erg = 1.0 / Double.valueOf(x);
		System.out.println("Is 1/x Not a Number? " +  erg.isNaN());
		System.out.println("Is 1/x infinite? " + erg.isInfinite());
		Double d = Double.valueOf(x);
		System.out.println(d.toString());
		Double e = 1.0 / d;
		System.out.println(e.intValue());

	}

}
