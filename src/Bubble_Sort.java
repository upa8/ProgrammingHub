import java.util.Arrays;
/*
 * Author : Pratik Upacharya 
 * Program : Bubble Sort 
 * Addition : Improve the complexity of best case of bubble sort to O(n) . 
 * 
 */

public class Bubble_Sort {
	public static void main(String args[]){
		int a[] = {1,23,56,7,131,413,32,4,43};
		for(int i = 0 ; i<a.length ; i++){
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		Bubble_Sort(a);

		System.out.println("\n");
		//Arrays.sort(a);
		Improved_Bubble_Sort(a);
		for(int i = 0 ; i<a.length ; i++){
			System.out.print(a[i]);

			System.out.print(" ");
	
		}
		
	
		
		
	}

	public static void Improved_Bubble_Sort(int[] m) {
		// TODO Auto-generated method stub
		int swapped = 1;
		int count_comparisions=0 ;
		
		for (int i = (m.length - 1) ; i >= 0 && swapped == 1 ;i--  ){
		swapped = 0;
			
			for (int j = 0 ;  j < i - 1 ; j ++){
				if(m[j]>m[j+1]){
					//swap 
					int temp = m[j];
					m[j]=m[j+1];
					m[j+1] = temp;
					swapped = 1;
					
				}
				count_comparisions++;
			}
			
		}

		System.out.println("Comparisons"+count_comparisions);
	}
	public static void Bubble_Sort(int[] m) {
		// TODO Auto-generated method stub

		int count_comparisions=0 ;
		for (int i = (m.length - 1) ; i >= 0  ;i--  ){
		
			for (int j = 0 ;  j < i - 1 ; j ++){
				if(m[j]>m[j+1]){
					//swap 
					int temp = m[j];
					m[j]=m[j+1];
					m[j+1] = temp;
					
					
				}

				count_comparisions++;
			}
		}
		System.out.println("Comparisons"+count_comparisions);
		
	}
}
