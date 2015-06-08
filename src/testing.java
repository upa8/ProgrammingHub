import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class testing {
    public static void main(String[] args) throws IOException{ 
        ArrayList<Integer> list = new ArrayList<Integer>();
    	int N = 32000;
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i*i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
            	primes++;
            	list.add(i);
            }
        }
        Iterator itr = list.iterator();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            if (t > 0) System.out.println("");
        int  M = in.nextInt();
           int  S = in.nextInt();
		        while(itr.hasNext()) {
		           Integer element = (Integer) itr.next();
		           if(element >= M){
		        	   if(element <= S){
		        		   System.out.println(element);
		        	   }else{
		        		   break;
		        	   }
		           }
		        }

	    
        }
        
    }
}
