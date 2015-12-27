package Codechef;

/*
 * Author : Pratik Upacharya
 * Question : https://www.codechef.com/DEC15/problems/CHEFST
 * Editorial : https://discuss.codechef.com/questions/77629/chefst-editorial
 * Solutions :
 *
 * Solution 1:
 *
 * Logic :
 *	Find minimum of n1 and n2 . Take sum of all the integers from 1 to m .
 *	Call it as checkSum . If checkSum is less than minimum of n1 and n2 then
 *	directly subtract checks break the loop and display n1+n2 .
 *	If minimum of n1 and n2 is not greater than checkSum then go to else logic.
 *
 *Solution 2 :
 *	Editorial :
 *	https://discuss.codechef.com/questions/77629/chefst-editorial
 *
 *
 */
public class ChefAndStones extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChefAndStones in = new ChefAndStones();
		int t = in.nextInt();
		in.solution2(t, in);
		// in.solution1(t, in);

	}

	private void solution2(int t, ChefAndStones in) throws Exception {
		// TODO Auto-generated method stub
		while (t > 0) {
			long n1 = in.nextLong();
			long n2 = in.nextLong();
			long m = in.nextLong();
			long checkSum = (m * (m + 1)) / 2;
			long answ = (n1 + n2)
					- (2 * (Math.min(checkSum, Math.min(n1, n2))));
			System.out.println(answ);
		}
	}

	public static void solution1(int t, ChefAndStones in) throws Exception {
		while (t > 0) {
			long n1 = in.nextLong();
			long n2 = in.nextLong();
			long m = in.nextLong();
			// Check both are same or not
			while (m > 0) {
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