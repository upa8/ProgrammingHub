package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class CoinChangeProblem extends MyScanner {

	public static void main(String args[]) throws Exception {

		CoinChangeProblem in = new CoinChangeProblem();
		int n = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = in.nextInt();
		}

		System.out.println(in.numberOfSolutions(n, coins));
	}

	public long numberOfSolutions(int total, int coins[]) {
		long temp[][] = new long[coins.length + 1][total + 1];
		for (int i = 0; i <= coins.length; i++) {
			temp[i][0] = 1;
		}
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= total; j++) {
				if (coins[i - 1] > j) {
					temp[i][j] = temp[i - 1][j];
				} else {
					temp[i][j] = temp[i][j - coins[i - 1]] + temp[i - 1][j];
				}
			}
		}
		return temp[coins.length][total];
	}

	public int numberOfSolutionsOnSpace(int total, int arr[]){

        int temp[] = new int[total+1];

        temp[0] = 1;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j <= total ; j++){
                if(j >= arr[i]){
                    temp[j] += temp[j-arr[i]];
                }
            }
        }
        return temp[total];
    }

}
