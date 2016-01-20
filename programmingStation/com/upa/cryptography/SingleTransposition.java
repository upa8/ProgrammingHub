package com.upa.cryptography;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SingleTransposition {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Single Transposition");
		// get plaintext
		System.out.println("Enter Plain Text");
		String plainText = br.readLine();
		System.out.println("Enter key");
		String singleTransKey = br.readLine();
		SingleTransposition in = new SingleTransposition();
		int sequence[] = { 1, 3, 4, 2, 0 };
		String firstCipherText = in.singleTraspositionCipher(plainText,
				singleTransKey, sequence);
		System.out.println(firstCipherText);

		System.out.println("Now double Tranposition");
		int seqence2[] = { 5, 4, 2, 3, 1, 0 };
		String doubleCipherKey = br.readLine();
		String secondCipherText = in.singleTraspositionCipher(firstCipherText,
				doubleCipherKey, seqence2);
		System.out.println(secondCipherText);

	}

	public String singleTraspositionCipher(String plainText,
			String singleTransKey, int sequence[]) {
		String ans = " ";

		int plainTextLength = plainText.length();
		// System.out.println("Plaintext length " + plainTextLength);
		// Get length of singleTransKey
		int singleTransKeyLength = singleTransKey.length();
		// System.out.println("Key length " + singleTransKeyLength);
		int coloumOfSingle = singleTransKeyLength;
		int x = plainTextLength % coloumOfSingle;
		int rowsOfSingle = (int) Math.ceil(plainTextLength / coloumOfSingle);
		if (x != 0) {
			rowsOfSingle = rowsOfSingle + 1;
		}
		// Enter the sequence
		// HardCoding

		// int sequence[] = { 1, 3, 4, 2, 0 };

		// System.out.println(rowsOfSingle);
		// System.out.println(coloumOfSingle);
		// Create array
		char singleArray[][] = new char[rowsOfSingle][coloumOfSingle];
		int count = 0;
		for (int i = 0; i < rowsOfSingle; i++) {
			for (int j = 0; j < coloumOfSingle; j++) {
				if (count == (plainTextLength)) {
					singleArray[i][j] = 0;

				} else {
					singleArray[i][j] = plainText.charAt(count);
					count++;
				}
			}
		}
		// now print the array
		for (int i = 0; i < rowsOfSingle; i++) {
			for (int j = 0; j < coloumOfSingle; j++) {
				System.out.print(singleArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("CipherText ");
		// System.out.println("Sequence Length " + sequence.length);
		StringBuilder singleTranspoCipherText = new StringBuilder();
		for (int i = 0; i < (sequence.length); i++) {
			int r = sequence[i];
			for (int j = 0; j < rowsOfSingle; j++) {
				if (singleArray[j][r] == 0) {
					continue;
				} else {
					// System.out.print(singleArray[j][r] + " ");
					singleTranspoCipherText.append(singleArray[j][r]);
				}

			}
		}
		int singleTranspoCipherTextLenght = singleTranspoCipherText.length();
		// System.out.println(singleTranspoCipherText.toString());
		return singleTranspoCipherText.toString();
	}

}
