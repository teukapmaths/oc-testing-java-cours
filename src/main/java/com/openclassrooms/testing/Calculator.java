package com.openclassrooms.testing;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public void longCalculation() {
		try {
			// Attendre 2 secondes
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Set<Integer> digitsSet(int number) {
		/*String stringNumber = number + "";
		Set<Integer> listNumber = new HashSet<>();
		for (int i = 0; i < stringNumber.length(); i++) {
			listNumber.add(Integer.parseInt(String.valueOf(stringNumber.charAt(i))));
		}
		return listNumber;*/

		Set<Integer> listNumber = new HashSet<>();
		int div;
		int rest = number;
		int digit;
		while (rest > 0) {
			div = rest / 10;
			digit = rest - div * 10;
			listNumber.add(digit);
			rest = div;
		}

		return listNumber;
	}
}
