package TrainingUsaco;

public class YourRideIsHere extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		YourRideIsHere in = new YourRideIsHere();

		String a = in.nextToken();
		String b = in.nextToken();
		int lengthOfStringA = a.length();
		int lengthOfStringB = b.length();
		long stringAProduct = 1;
		long stringBProduct = 1;
		for ( int i = 0 ; i < lengthOfStringA ; i++ ) {
			stringAProduct *= (a.charAt(i) - 64);
		}
		for ( int i = 0 ; i < lengthOfStringB ; i++ ) {
			stringBProduct *= (b.charAt(i) - 64);
		}
		System.out.println("a: " + stringAProduct + " b: " + stringBProduct);

		long groupA = stringAProduct % 47;
		long groupB = stringBProduct % 47;
		System.out.print("a: " + groupA + " b: " + groupB);

		if (groupA == groupB) {
			System.out.println("GO");
		} else {
			System.out.println("STAY");
		}

	}
}
