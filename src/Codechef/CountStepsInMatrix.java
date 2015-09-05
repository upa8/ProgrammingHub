package Codechef;

public class CountStepsInMatrix extends MyScanner{
	public static void main(String args[]) throws Exception{
			CountStepsInMatrix in  = new CountStepsInMatrix();
			int t = in.nextInt();
			while(t>0){
				int n = in.nextInt();
				int a[][] = new int[n][n];
				for(int i = 0 ; i < n ; i ++){
					for(int j = 0 ; j < n ; j++){
						a[i][j] = Integer.parseInt(in.nextToken());
						System.out.print(a[i][j] + " ");
					}
					//System.out.println();
					
				}
				//Find Number of step to reach all the vertices
				
				t--;
			}
		
	}

}
