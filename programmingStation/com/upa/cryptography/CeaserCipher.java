package com.upa.cryptography;

import com.upa.websites.Hackerrank.MyScanner;

public class CeaserCipher extends MyScanner {
	static StringBuilder incryptedText;
	static StringBuilder decryptedText;

	public static void main(String[] args) throws Exception {
		CeaserCipher in = new CeaserCipher();
		incryptedText = new StringBuilder();
		decryptedText = new StringBuilder();
		System.out.println("Enter the shift number");
		int shiftNumber = in.nextInt();

		System.out.println("Enter the number of words");
		int numberOfWords = in.nextInt();

		System.out.println("Enter the PlainText");

		while (numberOfWords > 0) {
			String PlainText = in.nextToken();
			in.incryptText(PlainText, shiftNumber);
			numberOfWords--;
		}

		System.out.println("Encrypted Text");
		System.out.println(incryptedText.toString());
		System.out.println("Decrypted Text");
		in.decryptText(incryptedText.toString());
		System.out.println(decryptedText.toString());
	}

	public void incryptText(String PlainText, int shiftNumber) {

		int lengthOfPlainText = PlainText.length();
		for (int i = 0; i < lengthOfPlainText; i++) {
			int a = PlainText.charAt(i);
			a = (a + shiftNumber);
			if (a > 122) {
				a = a % 123;
				a = a + 97;
			}
			this.incryptedText.append((char) a);
		}
	}

	public void decryptText(String incryptedText2) {

	}
}
