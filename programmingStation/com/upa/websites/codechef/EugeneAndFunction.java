package com.upa.websites.codechef;

/*
 * Author : Pratik Upacharya 
 * Question : https://www.codechef.com/NOV15/problems/KFUNC 
 * 
 * Logic : Observe the series 
 */

public class EugeneAndFunction extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EugeneAndFunction in = new EugeneAndFunction();
		int t = in.nextInt();
		while ( t > 0 ) {
			long firstNumber = in.nextLong();
			long diff = in.nextLong();
			long left = in.nextLong();
			long right = in.nextLong();
			int counter = 0;
			long tempSum = 0;
			long counterSum = 0;
			long sum = 0;
			// Get number of elements to sum 
			long num = (right - left) + 1;
			// reduce the first number 
			firstNumber = firstNumber % 9;
			if (firstNumber == 0) {
				firstNumber = 9;
			}
			// now reduce the difference 
			diff = diff % 9;
			if (diff != 0) {
				if ((diff == 3) || (diff == 6)) {
					counter = 3; // 9/3
				} else {
					//	if (diff == 9) {
					//counter = 1;
					//} else {
					counter = 9;
					//}
				}

				for ( int i = 0 ; i < counter ; i++ ) {
					tempSum = (firstNumber + (((left + i) - 1) * diff)) % 9;
					if (tempSum == 0) {
						tempSum = 9;
					}
					counterSum = counterSum + tempSum;
				}

				sum = counterSum * (num / counter);
				// now go to left side 
				long leftCounter = num % counter;

				for ( int i = 0 ; i < leftCounter ; i++ ) {
					tempSum = (firstNumber + (((left + i) - 1) * diff)) % 9;
					if (tempSum == 0) {
						tempSum = 9;
					}
					sum = sum + tempSum;
				}
			} else {
				tempSum = firstNumber % 9;
				if (tempSum == 0) {
					tempSum = 9;
				}
				sum = tempSum * num;
			}

			System.out.println(sum);
			t--;
		}
	}
}

/*
int t = in.nextInt();
while ( t > 0 ) {
	long series[] = new long[9];
	long a1 = in.nextLong();
	long d = in.nextLong();
	long l = in.nextLong();
	long r = in.nextLong();
	long sum = 0;
	for ( long i = 0 ; i < 9 ; i++ ) {
		//get the number of series 
		long num = a1 + (d * (i));
		long k = (num - 1) / 9;
		series[(int) i] = (num - (k * 9));
		//System.out.println(series[(int) i]);
		//	System.out.println(series.length);
	}

	sum = ((r - l) / 9) * 45;//((Math.abs(r - l)) / 9) * 45;

	if ((l % 9) != (r % 9)) {

		if ((l % 9) < (r % 9)) {
			for ( long i = l % 9 ; i <= (r % 9) ; i++ ) {
				sum += series[(int) (i - 1)];
			}
		} else {
			for ( long i = l % 9 ; i <= 9 ; i++ ) {
				sum += series[(int) (i - 1)];
			}
			for ( long i = 0 ; i <= (r % 9) ; i++ ) {
				sum += series[(int) (i - 1)];
			}
		}
	}

	// Solution 2

	/* Solution 1 which is not efficient 
	long firstR = a1 + (d * (l - 1));
	for ( long i = l ; i <= r ; i++ ) {
		long k = (firstR - 1) / 9;
		sum = sum + (firstR - (k * 9));
		firstR = firstR + d;
	}
	*/
/*		
			System.out.println(sum);
			t--;
		}
	}
}
*/