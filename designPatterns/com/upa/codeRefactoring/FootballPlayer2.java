package com.upa.codeRefactoring;

//Demonstrate chain constructors
//Code Refactoring

public class FootballPlayer2 {

	private String playerName = "";
	private String college = "";
	private double fortyYardDash = 0.0;
	private int repsBenchPress = 0;
	private double sixtyYardDash = 0.0;

	public String getPlayerName() {
		return this.playerName;
	}

	public String getCollege() {
		return this.college;
	}

	public double get40YdDash() {
		return this.fortyYardDash;
	}

	public int getRepsBenchPress() {
		return this.repsBenchPress;
	}

	public double get60YdDash() {
		return this.sixtyYardDash;
	}

	// Too much duplication in constructors
	/*
	 * public FootballPlayer2(String playerName, String college, double
	 * fortyYardDash, double sixtyYardDash){
	 * 
	 * this.playerName = playerName; this.college = college; this.fortyYardDash
	 * = fortyYardDash; this.sixtyYardDash = sixtyYardDash;
	 * 
	 * }
	 * 
	 * public FootballPlayer2(String playerName, String college, double
	 * fortyYardDash, int repsBenchPress){
	 * 
	 * this.playerName = playerName; this.college = college; this.fortyYardDash
	 * = fortyYardDash; this.repsBenchPress = repsBenchPress;
	 * 
	 * }
	 * 
	 * public FootballPlayer2(String playerName, String college, double
	 * fortyYardDash, int repsBenchPress, double sixtyYardDash){
	 * 
	 * this.playerName = playerName; this.college = college; this.fortyYardDash
	 * = fortyYardDash; this.repsBenchPress = repsBenchPress; this.sixtyYardDash
	 * = sixtyYardDash;
	 * 
	 * }
	 */

	// Create a general catch all constructor

	public FootballPlayer2(String playerName, String college,
			double fortyYardDash, int repsBenchPress, double sixtyYardDash) {

		this.playerName = playerName;
		this.college = college;
		this.fortyYardDash = fortyYardDash;
		this.repsBenchPress = repsBenchPress;
		this.sixtyYardDash = sixtyYardDash;

	}

	public FootballPlayer2(String playerName, String college,
			double fortyYardDash, int repsBenchPress) {

		this(playerName, college, fortyYardDash, repsBenchPress, 0.0);

	}

	public FootballPlayer2(String playerName, String college,
			double fortyYardDash, double sixtyYardDash) {

		this(playerName, college, fortyYardDash, 0, sixtyYardDash);

	}

	public static void main(String[] args) {

		FootballPlayer2 jamellFleming = new FootballPlayer2("Jamell Fleming",
				"Oklahoma", 4.53, 10.75);

		System.out.println(jamellFleming.getPlayerName());
		System.out.println(jamellFleming.getCollege());
		System.out.println(jamellFleming.get40YdDash());
		System.out.println(jamellFleming.getRepsBenchPress());
		System.out.println(jamellFleming.get60YdDash());

	}

}