package com.upa.codeRefactoring;

public class TestMedalWinner {

	public static void main(String[] args) {

		MedalFactory medalFactory = new MedalFactory();

		Athlete goldWinner = medalFactory.getMedal("GoldWinner", "Dave Thomas");
		Athlete silverWinner = medalFactory.getMedal("SilverWinner",
				"Mac McDonald");
		Athlete bronzeWinner = medalFactory.getMedal("BronzeWinner",
				"David Edgerton");

		// Athlete goldWinner2 = medalFactory.getMedal("GoldWinner", "Ray
		// Kroc");

		System.out.println("Gold Medal Winner: " + goldWinner.getAthleteName());
		System.out.println(
				"Silver Medal Winner: " + silverWinner.getAthleteName());
		System.out.println(
				"Bronze Medal Winner: " + bronzeWinner.getAthleteName());

		// Even though I tried to create a new Object of type GoldWinner
		// it was rejected and the original object remained

		// System.out
		// .println("Gold Medal Winner: " + goldWinner2.getAthleteName());

	}

}