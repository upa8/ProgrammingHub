package nothing;

import java.util.Scanner;

public class The_Best_Internet_Browser {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int Tc = Input.nextInt();
		for ( int i = 0 ; i < Tc ; i++ ) {
			String Website_Name = Input.next();
			int Total = Website_Name.length();
			Website_Name = Website_Name.substring(4, Total);
			int count = 0;
			for ( int j = 0 ; j < (Total - 4) ; j++ ) {
				if ((Website_Name.charAt(j) == 'a')
				        || (Website_Name.charAt(j) == 'e')
				        || (Website_Name.charAt(j) == 'i')
				        || (Website_Name.charAt(j) == 'o')
				        || (Website_Name.charAt(j) == 'u')) {
					count++;
				}

			}
			System.out.print((Total - count - 3) + "/" + Total);

		}

	}

}
