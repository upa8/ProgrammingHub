package nothing;

/*
 * Author : Pratik Upacharya . 
 * Problem : 
 * Implementation of all the sorting algorithms and their analysis using java language . 
 * 
 */

public class All_Sorts {
	public static void main(String[] args) {
		// Worst case
		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// Best Case
		// int a[] = {1,2,3,4,5,6,7,9,8};

		for ( int i = 0 ; i < a.length ; i++ ) {
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
		//	Selection_Sort(a);
		// Insertion Sort 
		//		Insertion_Sort(a);
		//Merge Sort 
		//			Merge_Sort(a);
		// Quick sort 
		//				Quick_Sort(a, 0 , a.length - 1 );
		//Heap Sort 
		//	Heap_Sort();

		for ( int i = 0 ; i < a.length ; i++ ) {
			System.out.print(a[i]);

			System.out.print(" ");

		}

	}

	private static void Quick_Sort(int[] a, int first, int last) {
		// TODO Auto-generated method stub
		if (last > first) {
			int pivot = partion(a, first, last);
			Quick_Sort(a, first, pivot - 1);
			Quick_Sort(a, pivot + 1, last);

		}

	}

	private static int partion(int[] a, int first, int last) {
		// TODO Auto-generated method stub
		int pivot = a[first];
		int low = first + 1;
		int high = last;
		while ( high > low ) {
			while ( (low <= high) && (a[low] <= pivot) ) {
				low++;
			}
			while ( (low <= high) && (a[high] >= pivot) ) {
				high--;
			}
			if (high > low) {
				int temp = a[high];
				a[high] = a[low];
				a[low] = temp;
			}
		}

		while ( (high > first) && (a[high] >= pivot) ) {
			high--;
		}
		if (pivot > a[high]) {
			a[first] = a[high];
			a[high] = pivot;
			return high;
		} else {
			return first;
		}

	}

	public static void Merge_Sort(int[] a) {
		// TODO Auto-generated method stub
		if (a.length > 1) {
			int[] temp11 = new int[a.length / 2];
			System.arraycopy(a, 0, temp11, 0, a.length / 2);
			Merge_Sort(temp11);
			int second_length = a.length - (a.length / 2);
			int[] temp22 = new int[second_length];
			System.arraycopy(a, a.length / 2, temp22, 0, second_length);
			Merge_Sort(temp22);
			int merger_array[] = merge(temp11, temp22);
			System.arraycopy(merger_array, 0, a, 0, merger_array.length);
		}
	}

	private static int[] merge(int[] temp1, int[] temp2) {
		// TODO Auto-generated method stub

		int temp[] = new int[temp1.length + temp2.length];
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		while ( (current1 < temp1.length) && (current2 < temp2.length) ) {
			if (temp1[current1] < temp2[current2]) {
				temp[current3++] = temp1[current1++];
			} else {
				temp[current3++] = temp2[current2++];
			}
		}
		while ( current1 < temp1.length ) {
			temp[current3++] = temp1[current1++];
		}
		while ( current2 < temp2.length ) {
			temp[current3++] = temp2[current2++];
		}

		return temp;
	}

	private static void Insertion_Sort(int[] array) {
		// TODO Auto-generated method stub

		int n = array.length;
		for ( int j = 1 ; j < n ; j++ ) {
			int key = array[j];
			int i = j - 1;
			while ( (i > -1) && (array[i] > key) ) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}

	}

	private static void Selection_Sort(int[] a) {
		// TODO Auto-generated method stub
		int count_comparisions = 0;

		for ( int i = 0 ; i < (a.length - 1) ; i++ ) {
			int min = i;
			for ( int j = i + 1 ; j < a.length ; j++ ) {
				if (a[j] < a[min]) {
					min = j;
				}
				count_comparisions++;
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println(count_comparisions);
	}

	public static void Improved_Bubble_Sort(int[] m) {
		// TODO Auto-generated method stub
		int swapped = 1;
		int count_comparisions = 0;

		for ( int i = (m.length - 1) ; (i >= 0) && (swapped == 1) ; i-- ) {
			swapped = 0;

			for ( int j = 0 ; j < (i - 1) ; j++ ) {
				if (m[j] > m[j + 1]) {
					//swap 
					int temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
					swapped = 1;

				}
				count_comparisions++;
			}

		}

		System.out.println("Comparisons " + count_comparisions);
	}

	public static void Bubble_Sort(int[] m) {
		// TODO Auto-generated method stub

		int count_comparisions = 0;
		for ( int i = (m.length - 1) ; i >= 0 ; i-- ) {

			for ( int j = 0 ; j < (i - 1) ; j++ ) {
				if (m[j] > m[j + 1]) {
					//swap 
					int temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;

				}

				count_comparisions++;
			}
		}
		System.out.println("Comparisons " + count_comparisions);

	}
}
