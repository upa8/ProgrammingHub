package Testing;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeSet;

class Test extends MyScanner {

	public static void main(String[] args) throws Exception {
		int T;
		Test in = new Test();
		PrintWriter out = new PrintWriter(System.out);
		T = in.nextInt();

		while ( T-- > 0 ) {
			int N;
			N = in.nextInt();
			TreeSet<String> x = new TreeSet<String>();
			int previous = 0;
			for ( int i = 0 ; i < N ; i++ ) {
				int A, B, C, gcdab;
				A = in.nextInt();
				B = in.nextInt();
				C = in.nextInt();
				if (A < 0) {
					A = Math.abs(A);
					B = -B;
					C = -C;
				} else if (A == 0) {
					if (B < 0) {
						B = Math.abs(B);
						C = -C;
					}

				}
				if ((A == 0) || (B == 0)) {
					gcdab = (B == 0) ? Math.abs(A) : Math.abs(B);
				} else {
					gcdab = (int) findGCD(Math.abs(A), Math.abs(B));
				}

				x.add(new String((A / gcdab) + "" + (B / gcdab) + ","
				        + ((C * 1.00000000) / gcdab)));
				System.out.println(new String((A / gcdab) + "" + (B / gcdab)
				        + "," + ((C * 1.00000000) / gcdab)));
				int num = ((A / gcdab) * 10) + (B / gcdab);

			}

			ArrayList<String> st = new ArrayList<String>();
			System.out.println("Arraylist st");
			for ( String str : x ) {
				st.add(str.substring(0, str.indexOf(",")));
				System.out.println(str.substring(0, str.indexOf(",")));
			}

			int maxcount = 0, tempcount = 0;

			String tempstring = st.get(0);
			System.out.println(tempstring);
			System.out.println("In loop");

			for ( String string : st ) {
				System.out.println("String from st" + string);
				System.out.println("String from temp" + tempstring);
				System.out.println("maxcount" + maxcount);
				System.out.println("tempcount" + tempcount);
				if (tempstring.equals(string)) {
					tempcount++;
				} else {
					tempstring = string;
					tempcount = 1;
				}
				if (tempcount > maxcount) {
					maxcount = tempcount;
				}

			}

			out.println(maxcount);
		}

		out.flush();
		out.close();

	}

	private static int gcd(int n, int m) {
		if (m == 0) {
			return n;
		} else {
			return (gcd(m, n % m));
		}
	}

	private static long findGCD(long number1, long number2) {
		long t;
		while ( number2 != 0 ) {
			t = number2;
			number2 = number1 % number2;
			number1 = t;
		}
		return number1;

	}

}
