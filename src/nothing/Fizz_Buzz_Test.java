package nothing;

import java.util.Scanner;

public class Fizz_Buzz_Test {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		long n = 1;//Input.nextLong();
		while ( n <= 100 ) {
			if (((n % 3) == 0) && ((n % 5) == 0)) {
				System.out.println("FizzBuzz");

			} else {
				if ((n % 3) == 0) {
					System.out.println("Fizz");

				} else {
					if ((n % 5) == 0) {
						System.out.println("Buzz");

					} else {
						System.out.println(n);
					}
				}
			}
			n++;
		}
	}
}