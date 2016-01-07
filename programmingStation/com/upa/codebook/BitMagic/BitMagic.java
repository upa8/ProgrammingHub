package com.upa.codebook.bitMagic;

public class BitMagic {

	BitMagic() {

	}

	public boolean IsOpposite(int a, int b) {
		// Refference :
		// https://www.youtube.com/watch?v=Z59REm2YKX0&list=PLTZbNwgO5ebrgkdJoiTU7FFuG8ThiQqmA&ab_channel=saurabhschool
		return ((a ^ b) < 0);
	}

	public int MaxNumber(int a, int b) {
		int x = 0;// (a ^ ((a ^ b) & !(a < b)));
		return x;

	}

	public int NextPowerOfTwo(int a) {
		a--;
		a |= a >> 1;
		a |= a >> 2;
		a |= a >> 4;
		a |= a >> 8;
		a |= a >> 16;
		a++;
		return a;
	}

	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; /* All 1’s */
		// 1’s through position j, then 0’s
		int left = max - ((1 << j) - 1);

		// 1’s after position i
		int right = ((1 << i) - 1);

		// 1’s, with 0s between i and j
		int mask = left | right;

		// Clear i through j, then put m in there
		return (n & mask) | (m << i);
	}

	public static String printBinary(String n) {
		int intPart = Integer.parseInt(n.substring(0, n.indexOf('.')));
		double decPart = Double
				.parseDouble(n.substring(n.indexOf('.'), n.length()));
		String int_string = "";
		while (intPart > 0) {
			int r = intPart % 2;
			intPart >>= 1;
			int_string = r + int_string;
		}
		StringBuffer dec_string = new StringBuffer();
		while (decPart > 0) {
			if (dec_string.length() > 32) {
				return "ERROR";
			}
			if (decPart == 1) {
				dec_string.append((int) decPart);
				break;
			}
			double r = decPart * 2;
			if (r >= 1) {
				dec_string.append(1);
				decPart = r - 1;
			} else {
				dec_string.append(0);
				decPart = r;
			}
		}
		return int_string + "." + dec_string.toString();
	}

}
// Bit Magic theory
/*
 * A = 32 ; A = A << 1 ; (Multiply A by 2^1 64 ) A = A >> 1 ; (Divide A by 2^1
 * 32) A = A >> 2 ; (Divide A by 2^2 which is 4 . So it will become 32/4)
 */

/*
 * To set/turn on thej-th item of the set, useS|=(1<<j). S = 34 (base 10) =
 * 100010 (base 2) j = 3, 1 << j = 001000 <- bit ‘1’ is shifted to left 3
 * times -------- OR (true if one of the bit is true) S = 42 (base 10) = 101010
 * (base 2) // this new value 42 is updated to S
 */
/*
 * 4. To check if thej-th item of the set is on (or off), use T=S&(1<<j).IfT=0,
 * then thej-th item of the set is off. If T!=0, then the j-th item of the set
 * is on. S = 42 (base 10) = 101010 (base 2) j = 3, 1 << j = 001000 <- bit
 * ‘1’ is shifted to left 3 times -------- AND (only true if both bits are
 * true) T = 8 (base 10) = 001000 (base 2) -> not zero, so the 3rd item is on S
 * = 42 (base 10) = 101010 (base 2) j = 2, 1 << j = 000100 <- bit ‘1’ is
 * shifted to left 2 times -------- AND T = 0 (base 10) = 000000 (base 2) ->
 * zero, so the 2rd item is off 3
 */

/*
 * 5. To clear/turn off thej-th item of the set, use 4 S&=∼(1<<j). S = 42
 * (base 10) = 101010 (base 2) j = 1, ~(1 << j) = 111101 <- ‘~’ is the
 * bitwise NOT operation -------- AND S = 40 (base 10) = 101000 (base 2) // this
 * new value 40 is updated to S 6. To toggle thej-th item of the set, useS ∧
 * =(1<<j). S = 40 (base 10) = 101000 (base 2) j = 2, (1 << j) = 000100 <- bit
 * ‘1’ is shifted to left 4 times -------- XOR (only true if both bits are
 * different) S = 44 (base 10) = 101100 (base 2) // this new value 44 is updated
 * to S
 */
/*
 * 7. To get the first bit that is on (from right), useT = (S & (-S)). S = 40
 * (base 10) = 000...000101000 (32 bits, base 2) -S = -40 (base 10) =
 * 111...111011000 (32 bits, base 2, two’s complement) ----------------- AND T
 * = 8 (base 10) = 000...000001000 (the 3rd bit from right is on) 8. To turn
 * onallbits in a set of sizen,useS=(1<<n) - 1. Example for n = 6 S + 1 = 64
 * (base 10) = 1000000 <- bit ‘1’ is shifted to left 6 times 1 --------- -S
 * = 63 (base 10) = 111111 (base 2) Many bit manipulation operations are written
 * as macros in our C/C++ example codes (but written as usual in our Java
 * example codes as Java does not support macro).
 */
