package Codechef;

/*
 * Author : Pratik Upacharya 
 * Question : https://www.codechef.com/DEC15/problems/CHEFST
 */
public class ChefAndStones extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChefAndStones in = new ChefAndStones();
		int t = in.nextInt();
		while ( t > 0 ) {
			long n1 = in.nextLong();
			long n2 = in.nextLong();
			long m = in.nextLong();
			// Check both are same or not 
			while ( m > 0 ) {
				long min = Math.min(n1, n2);
				long check = (m * (m + 1)) / 2;
				if (min >= check) {
					n1 = n1 - check;
					n2 = n2 - check;
					break;
				} else {
					if (min >= m) {
						if (((n1 - m) >= 0) && ((n2 - m) >= 0)) {
							n1 = n1 - m;
							n2 = n2 - m;
							m = m - 1;
						} else {
							break;
						}
					} else {
						if (((n1 - min) >= 0) && ((n2 - min) >= 0)) {
							n1 = n1 - min;
							n2 = n2 - min;
							m = min - 1;
						} else {
							break;
						}
					}
				}
			}

			System.out.println(n1 + n2);
			t--;
		}
	}
}