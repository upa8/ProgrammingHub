package Classical_Algorithms;

public class Binary_Search {
	public static void main(String [] args){
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The position is " + Binary_Search(a,1));
	}

	public static int Binary_Search(int[] a, int i) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = a.length -1;
		while(high >= low){
			
			int mid =( high + low )/2;			
			{
					if(i < a[mid]){
						high = mid - 1;
					}else{
						if(i == a[mid])
							return mid;
						else
							low = mid +1;
					}
			}
		}	
		return -1;
	}

}
