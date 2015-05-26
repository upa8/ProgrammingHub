/*
 * Pratik Upachary
 * Finf all the permutations of a string 
 *Complexity : o(n2);
 *Solution is recursive with bracktracking approach . 
 *
 *Problem : http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 **/
 class PrintStringCombi {
 
	static char s[] = { 'a', 'b', 'c' };
 
	/* Function to swap values at two pointers */
	static void swap(int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
 
	static void permute(int i) {
		int j;
		if (i == s.length - 1)
			System.out.println(s);
		else {
			for (j = i; j < s.length; j++) {
				swap(i, j);
				permute(i + 1);
				swap(i, j); // backtrack
			}
		}
	}
 
	/* Driver program to test above functions */
	public static void main(String[] args) {
		permute(0);
	}
}