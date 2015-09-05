package Codechef;

import java.io.PrintWriter;

public class CoockingMachine extends MyScanner{
	
	public static void main(String args[]) throws Exception{
		CoockingMachine in = new CoockingMachine();
		PrintWriter out = new PrintWriter(System.out);
		int t = in.nextInt();
		int count = 0;
		while(t>0){
			count++;
			long operations = 0;
			long a = in.nextLong();
			long b = in.nextLong();
			if(a == b){
				//System.out.println(operations);
			}
			if(a < b){
			    
				while(b%a !=0){
					a /=2;
					operations++;
				}
				
				while(b!=a){
					a *=2;
					operations++;
				}	
			}
			if(a>b){
				while(a>b){
					a /=2;
					operations++;
				}
				while(b%a !=0){
					a /=2;
					operations++;
				}
				while(b!=a){
					a *=2;
					operations++;
				}	
				
			}
		//	out.println(operations);
			System.out.println(operations);
			t--;
		}
	}

}
