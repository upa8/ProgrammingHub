import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Prom_Night {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());		
		for(int i = 0 ; i < T ; i ++){
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(y>=x && (x<10000) && (y< 10000)){
				String MALE = br.readLine();
				String FEMALE = br.readLine();
				// add all the values into an array for male
				String[] Male_Hieghts = MALE.split(" ");
				
				ArrayList<Integer> Male_Array = new ArrayList<Integer>(); 
				
			//	int[] Male_Array = new int[10000];
				int m = 0;
				for (String token : Male_Hieghts){
				//	Male_Array[m++] = Integer.parseInt(token); 
					Male_Array.add(Integer.parseInt(token));
				}
				//Similar for female
				String[] FeMale_Hieghts = FEMALE.split(" ");
				ArrayList<Integer> FeMale_Array = new ArrayList<Integer>(); 
				
				//int[] FeMale_Array = new int[10000];

				int k = 0;
				for (String tokens : FeMale_Hieghts){
			//		FeMale_Array[k++] = Integer.parseInt(tokens); 
					FeMale_Array.add(Integer.parseInt(tokens));
					
				}
				Collections.sort(Male_Array);
				Collections.sort(FeMale_Array);
				//Arrays.sort(Male_Array);
				//Arrays.sort(FeMale_Array);
				int s = Male_Array.size() ;
	//			System.out.println(Male_Array.get(s-1)+ " " + FeMale_Array.get(s-1));
				
		
				if(Male_Array.get(s-1)>=FeMale_Array.get(s-1)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
					
				}
				
			}else{
				System.out.println("NO");
			}
			
					
		}
	}
}