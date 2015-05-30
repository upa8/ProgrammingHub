import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class testing {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n,k,b,s,result,d  ;//= BigInteger.ONE;
		s = BigInteger.ZERO;
		d = BigInteger.ONE;
		String str = br.readLine();
		String[] numbers = str.split(" ");
		n = new BigInteger(numbers[0]);
		k = new BigInteger(numbers[1]);
		for (BigInteger bi = n; bi.compareTo(BigInteger.ZERO) > 0; bi = bi.subtract(BigInteger.ONE)){
			String strs = br.readLine();
		  	b =   new BigInteger(strs);
			
		  	a = new BigInteger(numbers[0]);
			b = new BigInteger(numbers[1]);
			result = a.add(b);
			System.out.println(result);
			n.subtract(d);
		
	        
	    }
		
		
		
	
	}
}
