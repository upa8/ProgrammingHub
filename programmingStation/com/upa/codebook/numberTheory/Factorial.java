package com.upa.codebook.numberTheory;

import java.math.BigInteger;
import java.util.ArrayList;

public class Factorial {

	public static void main(String[] args) {
		ArrayList<BigInteger> fact = new ArrayList<BigInteger>();
		BigInteger fac = BigInteger.ONE;
		for (int i = 1; i <= 18; i++) {
			fac = fac.multiply(BigInteger.valueOf(i)); // it is in the library!
			fact.add(fac);
		}
		System.out.println(fac);
	}

}
