package nothing;

public class Odd_Occurence {

	public static void main(String args[]) {
		int a[] = { 1, 1, 2, 2, 4, 5, 5 };
		int b = a.length;

		for ( int i = 0 ; i < b ; ) {
			if (a[i] == a[i + 1]) {

				i = i + 2;

			} else {

				i = i + 1;

				System.out.println(a[i - 1]);

			}

		}
	}
}
