package Library;

public class BitMagic {

	BitMagic() {

	}

	public boolean IsOpposite(int a, int b) {
		// Refference : https://www.youtube.com/watch?v=Z59REm2YKX0&list=PLTZbNwgO5ebrgkdJoiTU7FFuG8ThiQqmA&ab_channel=saurabhschool
		return ((a ^ b) < 0);
	}

	public int MaxNumber(int a, int b) {
		int x = 0;//(a ^ ((a ^ b) & !(a < b)));
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
		double decPart = Double.parseDouble(n.substring(n.indexOf('.'),
		        n.length()));
		String int_string = "";
		while ( intPart > 0 ) {
			int r = intPart % 2;
			intPart >>= 1;
			int_string = r + int_string;
		}
		StringBuffer dec_string = new StringBuffer();
		while ( decPart > 0 ) {
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
