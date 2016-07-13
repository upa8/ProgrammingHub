package com.upa.codeRefactoring;

//Demonstrate the Creation Method replacement of Constructors
//Code Refactoring

public class FootballPlayer {

	private final double passerRating; // Specific to QBs
	private final int rushingYards; // Specific to RBs & QBs
	private final int receivingYards; // Specific to RBs & WRs
	private final int totalTackles; // Specific to DEF
	private final int interceptions; // Specific to DEF
	private final int fieldGoals; // Specific to Kickers
	private final double avgPunt; // Specific to Punters
	private final double avgKickoffReturn; // Specific to Special Teams
	private final double avgPuntReturn; // Specific to Special Teams

	/*
	 * 
	 * FootballPlayer(double passerRating, int rushingYards){
	 * 
	 * this.passerRating = passerRating; this.rushingYards = rushingYards;
	 * 
	 * }
	 * 
	 * FootballPlayer(int rushingYards){
	 * 
	 * this.rushingYards = rushingYards;
	 * 
	 * }
	 * 
	 * Can't do this because the signature must be different
	 * 
	 * FootballPlayer(int receivingYards){
	 * 
	 * this.receivingYards = receivingYards;
	 * 
	 * }
	 */

	private FootballPlayer(double passerRating, int rushingYards,
			int receivingYards, int totalTackles, int interceptions,
			int fieldGoals, double avgPunt, double avgKickoffReturn,
			double avgPuntReturn) {

		this.passerRating = passerRating;
		this.rushingYards = rushingYards;
		this.receivingYards = receivingYards;
		this.totalTackles = totalTackles;
		this.interceptions = interceptions;
		this.fieldGoals = fieldGoals;
		this.avgPunt = avgPunt;
		this.avgKickoffReturn = avgKickoffReturn;
		this.avgPuntReturn = avgPuntReturn;

	}

	public double getPasserRating() {
		return this.passerRating;
	}

	public static FootballPlayer createQB(double passerRating,
			int rushingYards) {

		return new FootballPlayer(passerRating, rushingYards, 0, 0, 0, 0, 0.0,
				0.0, 0.0);

	}

	public static FootballPlayer createWR(int rushingYards,
			int receivingYards) {

		return new FootballPlayer(0, rushingYards, receivingYards, 0, 0, 0, 0.0,
				0.0, 0.0);

	}

	public static FootballPlayer createKicker(int fieldGoals, double avgPunt) {

		return new FootballPlayer(0, 0, 0, 0, 0, 38, 37.8, 0.0, 0.0);

	}

	public static void main(String[] args) {

		// The creation methods
		// Explain what type of player is being made
		// Are easier to understand (especially the attributes)

		FootballPlayer aaronRodgers = FootballPlayer.createQB(108.0, 259);

		FootballPlayer calvinJohnson = FootballPlayer.createWR(11, 1964);

		FootballPlayer sebastianJanikowski = FootballPlayer.createKicker(31,
				33.0);

		System.out.println("Aaron Rodgers Passer Rating: "
				+ aaronRodgers.getPasserRating());

	}

}