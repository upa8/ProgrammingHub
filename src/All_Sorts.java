
public class All_Sorts {
	public static void main(String[] args){
		// Worst case
		int a[] = {9,8,7,6,5,4,3,2,1};
		// Best Case
	   //int a[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0 ; i<a.length ; i++){
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		// Bubble Sort 
				//Bubble_Sort(a);
				//System.out.println("\n");
		// Improved Bubble Sort 
				//Improved_Bubble_Sort(a);
		//Selection Sort 
				Selection_Sort(a);
		

		
		
		for(int i = 0 ; i<a.length ; i++){
			System.out.print(a[i]);

			System.out.print(" ");
	
		}
	
	}

	private static void Selection_Sort(int[] a) {
		// TODO Auto-generated method stub
		int count_comparisions=0 ;
		
		for(int i = 0 ; i < a.length - 1; i ++){
			int min = i;
			for(int j = i + 1 ; j < a.length ; j++){
				if(a[j]<a[min]){
					min = j;
				}
				count_comparisions++;
			}
			int temp = a[i];
			a[i]     = a[min];
			a[min]=temp;
		}
		System.out.println(count_comparisions);
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

		System.out.println("Comparisons "+count_comparisions);
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
		System.out.println("Comparisons "+count_comparisions);
		
	}
}
