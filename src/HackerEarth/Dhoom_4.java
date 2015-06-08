package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Question : https://www.hackerearth.com/tracks/pledge-2015-easy/dhoom-4/
 * 
 * Author : Pratik Upacharya
 */
public class Dhoom_4 {
	public static void main(String [] args) throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		String First_Line = Br.readLine();
		StringTokenizer st = new StringTokenizer(First_Line);
		int Sampant_Key = Integer.parseInt(st.nextToken());
		int Lock_Key = Integer.parseInt(st.nextToken());
		String Number_Of_Keys = Br.readLine();
		int[] Key_Array = new int[Integer.parseInt(Number_Of_Keys)+1];
		String Third_Line = Br.readLine();
		StringTokenizer st1 = new StringTokenizer(Third_Line);
		int tokens = st1.countTokens();
		for(int j =0 ; j<tokens ; j++){
			Key_Array[j] = Integer.parseInt(st1.nextToken());	
		}
		
		int start = 0;
		

		
	} 

}
