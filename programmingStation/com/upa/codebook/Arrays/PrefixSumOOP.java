package com.upa.codebook.arrays;

import java.io.IOException;

public class PrefixSumOOP {

	int[] numberArray;

	public PrefixSumOOP(int numbers) {
		this.numberArray = new int[numbers];
	}

	public void buildPrefixArray() {
		System.out.println(this.numberArray.length);
		for (int i = 1; i < this.numberArray.length; i++) {
			// Here we can take input from user
			// this.numberArray = in.readInt() + this.numberArray[i-1];
			this.numberArray[i] = i + this.numberArray[i - 1];

		}
	}

	public int getSumBetween(int number1, int number2) {
		return (this.numberArray[number2] - this.numberArray[number1]);
	}

	public void printArray() {
		for (int i = 0; i < this.numberArray.length; i++) {
			System.out.print(this.numberArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		PrefixSumOOP in = new PrefixSumOOP(10);
		in.printArray();
		in.buildPrefixArray();
		in.printArray();
		System.out.println(in.getSumBetween(1, 9));
	}
}