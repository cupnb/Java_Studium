package de.tefemuc.Uebung2;

import java.util.Random;

public class A6a {
	
	public static void main(String args[]) {
		Random r = new Random();
		char c = (char) r.nextInt(266);
		System.out.println(Character.getName(c) + " " + c);
		if (Character.isLowerCase(c)) {
			System.out.println(Character.toUpperCase(c) + "\n");
		}
	}

}
