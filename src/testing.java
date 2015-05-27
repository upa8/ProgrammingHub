import java.math.BigInteger;
import java.util.Scanner;


public class testing {
	public static void main(String args[]){
		Scanner Input = new Scanner(System.in);
		int n = Input.nextInt();
		for (int i = 0 ; i< n ;i++){
			int num = Input.nextInt();
			if(num == 0 ){
				System.out.println(0);
			}else{
				if(num == 1 ){
					System.out.println(1);
				}else{
					BigInteger a,m ;//= BigInteger.ONE;
					a = BigInteger.valueOf(num) ;
					int fact = 1;
					for(int t = 1 ; t < num ; t ++){
						m = BigInteger.valueOf(t);
						a = a.multiply(m);
					}
					System.out.println(a);
											
				}
				
			}
		
						
		}
	}


}
