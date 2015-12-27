package nothing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Prom_Night {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for ( int i = 0 ; i < T ; i++ ) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if ((y >= x) && (x < 10000) && (y < 10000)) {
				String MALE = br.readLine();
				String FEMALE = br.readLine();
				String[] Male_Hieghts = MALE.split(" ");
				String[] FeMale_Hieghts = FEMALE.split(" ");
				int m_size = Male_Hieghts.length;
				int f_size = FeMale_Hieghts.length;
				// System.out.println(m_size + " " + f_size);

				if ((m_size == x) && (f_size == y)) {
					ArrayList<Integer> Male_Array = new ArrayList<Integer>();
					int m = 0;
					for ( String token : Male_Hieghts ) {
						Male_Array.add(Integer.parseInt(token));
					}
					ArrayList<Integer> FeMale_Array = new ArrayList<Integer>();
					int k = 0;
					for ( String tokens : FeMale_Hieghts ) {
						FeMale_Array.add(Integer.parseInt(tokens));

					}
					Collections.sort(Male_Array);
					Collections.sort(FeMale_Array);
					// System.out.println(Male_Array);
					// System.out.println(FeMale_Array);
					int s = Male_Array.size();
					// System.out.println(Male_Array.get(3)+" "+ s);

					// System.out.println(FeMale_Array.get(s-1));

					boolean flag = true;
					for ( int w = 0 ; w < s ; w++ ) {
						if (Male_Array.get(w) > FeMale_Array.get(w)) {
							// System.out.println(Male_Array.get(w) + " C" +
							// FeMale_Array.get(w));
							// Male_Array.remove(w);

							// FeMale_Array.remove(w);
						} else {
							flag = false;
							break;
						}
					}

					if (flag) {
						System.out.println("YES");

					} else {
						System.out.println("NO");

					}

				} else {
					System.out.println("NO");

				}

			} else {
				System.out.println("NO");
			}

		}
	}
}