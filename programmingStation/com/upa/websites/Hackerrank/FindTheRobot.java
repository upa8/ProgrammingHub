package com.upa.websites.Hackerrank;

public class FindTheRobot extends MyScanner {
	
	public static void main(String args[]) throws Exception{
		FindTheRobot in = new FindTheRobot();
		int t = in.nextInt();
		
		while(t>0){
			long n = in.nextLong();
			 int x =0;
			 int y =0;
			long i =1;
			int unit=1;
			while( n > 0){
				System.out.print(" i " + i);
				long m = i%4;

				System.out.print(" m "  + i);
				if(m == 1){
					x = x + unit;
				}
				if(m == 2){
					y = y + unit;			
				}
				if(m == 3){
					x = x - unit;
				}
				if(m == 0){
					y = y - unit;
				}
				System.out.println(" x "+x + " y " + y);
				unit++;
				i++;
				n--;
			}
			System.out.println(x +" "+y);
			t--;
		}
	}

	
}
