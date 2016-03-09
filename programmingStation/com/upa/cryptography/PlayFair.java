package com.upa.cryptography;

import java.util.Scanner;

public class PlayFair {

	private String KeyWord = new String();
	private String Key = new String();
	private final char matrix_arr[][] = new char[5][5];

	public void setKey(String k) {

		String K_adjust = new String();
		boolean flag = false;

		K_adjust = K_adjust + k.charAt(0);

		for (int i = 1; i < k.length(); i++) {

			for (int j = 0; j < K_adjust.length(); j++) {

				if (k.charAt(i) == K_adjust.charAt(j)) {
					flag = true;
				}
			}

			if (flag == false) {
				K_adjust = K_adjust + k.charAt(i);
			}
			flag = false;
		}

		this.KeyWord = K_adjust;
	}

	public void KeyGen() {

		boolean flag = true;
		char current;

		this.Key = this.KeyWord;

		for (int i = 0; i < 26; i++) {

			current = (char) (i + 97);

			if (current == 'j') {
				continue;
			}

			for (int j = 0; j < this.KeyWord.length(); j++) {

				if (current == this.KeyWord.charAt(j)) {

					flag = false;
					break;
				}
			}

			if (flag) {
				this.Key = this.Key + current;
			}

			flag = true;
		}

		System.out.println(this.Key);
		this.matrix();

	}

	private void matrix() {
		int counter = 0;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				this.matrix_arr[i][j] = this.Key.charAt(counter);
				System.out.printf("%s ", this.matrix_arr[i][j]);

				counter++;
			}

			System.out.println("\n");
		}
	}

	private String format(String old_text) {

		int i = 0;
		int j = 0;
		int len = 0;
		String text = new String();
		len = old_text.length();

		for (int tmp = 0; tmp < len; tmp++) {
			if (old_text.charAt(tmp) == 'j') {
				text = text + 'i';
			} else {
				text = text + old_text.charAt(tmp);
			}
		}

		len = text.length();

		if ((len % 2) != 0) {
			text = text + 'x';
		}

		for (i = 0; i < (len - 1); i = i + 2) {

			if (text.charAt(i + 1) == text.charAt(i)) {

				text = text.substring(0, i + 1) + 'x' + text.substring(i + 1);
			} else {
			}
		}
		len = text.length();
		if (text.charAt(len - 1) == text.charAt(len - 2)) {

			text = text.substring(0, len - 2) + 'x' + text.substring(len - 2)
					+ 'x';
		}
		return text;
	}

	private String[] Divid2Pairs(String new_string) {
		String Original = this.format(new_string);

		int size = Original.length();

		if ((size % 2) != 0) {
			size++;
			Original = Original + 'x';
		}

		String x[] = new String[size / 2];

		int counter = 0;

		for (int i = 0; i < (size / 2); i++) {
			x[i] = Original.substring(counter, counter + 2);
			System.out.println(x[i]);
			counter = counter + 2;
		}

		return x;
	}

	public int[] GetDiminsions(char letter) {

		int[] key = new int[2];

		if (letter == 'j') {
			letter = 'i';
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (this.matrix_arr[i][j] == letter) {

					key[0] = i;
					key[1] = j;
					break;
				}
			}

		}

		return key;
	}

	public String Encript(String Source) {

		String src_arr[] = this.Divid2Pairs(Source);

		String Code = new String();

		char one;
		char two;

		int part1[] = new int[2];
		int part2[] = new int[2];

		// start on pair by pair
		for (int i = 0; i < src_arr.length; i++) {
			one = src_arr[i].charAt(0);
			two = src_arr[i].charAt(1);

			part1 = this.GetDiminsions(one);
			part2 = this.GetDiminsions(two);

			if (part1[0] == part2[0]) {

				if (part1[1] < 4) {
					part1[1]++;
				} else {
					part1[1] = 0;
				}

				if (part2[1] < 4) {
					part2[1]++;
				} else {
					part2[1] = 0;
				}

			} else if (part1[1] == part2[1]) {
				if (part1[0] < 4) {
					part1[0]++;
				} else {
					part1[0] = 0;
				}

				if (part2[0] < 4) {
					part2[0]++;
				} else {
					part2[0] = 0;
				}
			} else {
				int temp = part1[1];
				part1[1] = part2[1];
				part2[1] = temp;
			}

			Code = Code + this.matrix_arr[part1[0]][part1[1]]
					+ this.matrix_arr[part2[0]][part2[1]];
		}
		System.out.println(Code);
		return Code;
	}

	public String Decript(String Code) {

		String Original = new String();

		String src_arr[] = this.Divid2Pairs(Code);

		char one;
		char two;

		int part1[] = new int[2];
		int part2[] = new int[2];

		for (int i = 0; i < src_arr.length; i++) {
			one = src_arr[i].charAt(0);
			two = src_arr[i].charAt(1);

			part1 = this.GetDiminsions(one);
			part2 = this.GetDiminsions(two);

			if (part1[0] == part2[0]) {

				if (part1[1] > 0) {
					part1[1]--;
				} else {
					part1[1] = 4;
				}

				if (part2[1] > 0) {
					part2[1]--;
				} else {
					part2[1] = 4;
				}
			}

			else if (part1[1] == part2[1]) {
				if (part1[0] > 0) {
					part1[0]--;
				} else {
					part1[0] = 4;
				}

				if (part2[0] > 0) {
					part2[0]--;
				} else {
					part2[0] = 4;
				}
			} else {
				int temp = part1[1];
				part1[1] = part2[1];
				part2[1] = temp;
			}

			Original = Original + this.matrix_arr[part1[0]][part1[1]]
					+ this.matrix_arr[part2[0]][part2[1]];
		}

		System.out.println(Original);
		return Original;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayFair x = new PlayFair();

		Scanner sc = new Scanner(System.in);

		System.out.println("Keyword:");
		String keyword = sc.next();
		x.setKey(keyword);
		x.KeyGen();

		System.out.println("To Encrypt enter 1 \nTo Decript enter 2\n");
		int choosen_value = sc.nextInt();

		if (choosen_value == 1) {
			System.out.println("Enter a  word to encrypt:");
			String key_input = sc.next();
			String Encripted = x.Encript(key_input);
		} else if (choosen_value == 2) {
			System.out.println("Enter a  word to decrypt:");
			String decripted = sc.next();

			x.Decript(decripted);
		} else {
			System.out.println("Enter a word to encrypt & decrypt:");
			String key_input = sc.next();

			String Encripted = x.Encript(key_input);
			x.Decript(Encripted);
		}
	}
}
/*
 * OUTPUT:
 *
 * Enter a keyword: rcoem rcoemabdfghiklnpqstuvwxyz r c o e m
 *
 * a b d f g
 *
 * h i k l n
 *
 * p q s t u
 *
 * v w x y z
 *
 * To Encrypt enter 1 To Decript enter 2
 *
 * 1 Enter a word to encrypt: aliceinchains al ic ei nc ha in sx fhqbclimphkhxo
 */