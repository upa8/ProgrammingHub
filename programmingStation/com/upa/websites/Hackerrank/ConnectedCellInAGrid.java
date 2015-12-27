package com.upa.websites.Hackerrank;

public class ConnectedCellInAGrid extends MyScanner{
	
	public static void main(String args[]) throws Exception{
		
		ConnectedCellInAGrid  in = new ConnectedCellInAGrid();
		int m  = in.nextInt();
		int n  = in.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0 ; i< m ; i ++){
			for(int j = 0 ; j < n ; j ++){
				a[i][j] = Integer.parseInt(in.nextToken());
			}
		}
		for(int i = 0 ; i< m ; i ++){
			for(int j = 0 ; j < n ; j ++){
				System.out.print(a[i][j] +" ");
			}
				System.out.println();
		}
	}
}
