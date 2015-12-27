package nothing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegers_Sum_And_Looping {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n, a, b, s, result, d;//= BigInteger.ONE;
		s = BigInteger.ZERO;
		d = BigInteger.ONE;
		String str = br.readLine();
		n = new BigInteger(str);
		boolean flag = true;
		for ( BigInteger bi = n ; bi.compareTo(BigInteger.ZERO) > 0 ; bi = bi
		        .subtract(BigInteger.ONE) ) {
			String strs = br.readLine();
			String[] numbers = strs.split(" ");

			//	StringTokenizer st = new StringTokenizer(strs);
			//		String first = //	st.nextToken();
			//		String second = //	st.nextToken();
			a = new BigInteger(numbers[0]);
			b = new BigInteger(numbers[1]);
			result = a.add(b);
			System.out.println(result);
			n.subtract(d);

		}

	}
}
