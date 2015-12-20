package nothing;

import java.util.Scanner;

public class Chintu_And_Restaurant {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		String S = Input.next();
		int N = Input.nextInt();
		for ( int k = 0 ; k < N ; k++ ) {
			int i = Input.nextInt();
			int j = Input.nextInt();
			if (S.charAt(i - 1) == S.charAt(j - 1)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");

			}
		}

	}

}
