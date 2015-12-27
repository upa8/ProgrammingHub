package Codechef;

import java.util.TreeSet;

class PlaneDiv extends MyScanner {

	public static void main(String[] args) throws Exception {
		int t;
		PlaneDiv in = new PlaneDiv();
		t = in.nextInt();
		while ( t > 0 ) {
			int N;
			N = in.nextInt();
			TreeSet<String> numSet = new TreeSet<String>();
			for ( int i = 0 ; i < N ; i++ ) {
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();
				if (a < 0) {
					a = Math.abs(a);
					b = -b;
					c = -c;
				} else if (a == 0) {
					if (b < 0) {
						b = Math.abs(b);
						c = -c;
					}
				}
				int gcdab;
				if ((a == 0) || (b == 0)) {
					gcdab = (b == 0) ? Math.abs(a) : Math.abs(b);
				} else {
					gcdab = (int) findGCD(Math.abs(a), Math.abs(b));
				}
				numSet.add(new String((a / gcdab) + "" + (b / gcdab) + ":"
				        + ((c * 1.00000000) / gcdab)));
			}
			// Now Check the consecutive 
			String Previous = "";
			int nCount = 0;
			int fCount = 0;
			for ( String str : numSet ) {
				str = str.substring(0, str.indexOf(":"));
				if (str.equals(Previous)) {
					nCount++;
				} else {
					Previous = str;
					nCount = 1;
				}
				if (nCount > fCount) {
					fCount = nCount;
				}

			}
			System.out.println(fCount);
			t--;
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
