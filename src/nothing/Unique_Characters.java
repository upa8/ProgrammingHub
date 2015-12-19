import java.util.Scanner;

/*
 * Question : 
   Implement an algorithm to determine if a string has all unique characters What if 
   you can not use additional data structures?
   Complexity for this solution is :
   Time complexity = O(n)
   Space complexity = 0(n)
   
  
*/



public class Unique_Characters {
	static String Str = "Somethingg";
	Scanner Input = new Scanner(System.in);
	public static void main(String args[]){
	Unique_Characters Object = new Unique_Characters();
	Object.uniqueCharacters(Str);
		
	}
	private void uniqueCharacters(String str) {
		// TODO Auto-generated method stub
		
	
		boolean Bit_Array[] = new boolean[256];
		for(int i = 0 ; i<str.length(); i++){
			int val = str.charAt(i);
			if(Bit_Array[val]){
				System.out.println("String Dont have unique characters !");
			}
			Bit_Array[val] = true;
		}
		
		
	}


}
