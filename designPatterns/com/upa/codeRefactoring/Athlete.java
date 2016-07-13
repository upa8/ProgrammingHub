package com.upa.codeRefactoring;

//Create a Factory that creates singletons

import java.lang.reflect.Method;

public class Athlete {

	private String athleteName = "";

	public String getAthleteName() {
		return this.athleteName;
	}

	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	public static Athlete getInstance() {
		return null;
	}

}

class GoldWinner extends Athlete {

	// Set to null to signify that an instance of
	// type GoldWinner doesn't exist

	private static GoldWinner goldAthlete = null;

	// Constructor is set to private to keep other
	// classes from creating an instance of GoldWinner

	private GoldWinner(String athleteName) {

		this.setAthleteName(athleteName);

	}

	// Creates 1 instance of GoldWinner (Simple Singleton)

	public static GoldWinner getInstance(String athleteName) {

		// If an instance of GoldWinner doesn't exist
		// create one

		if (goldAthlete == null) {

			goldAthlete = new GoldWinner(athleteName);

		}

		return goldAthlete;

	}

}

class SilverWinner extends Athlete {

	private static SilverWinner silverAthlete = null;

	private SilverWinner(String athleteName) {

		this.setAthleteName(athleteName);

	}

	public static SilverWinner getInstance(String athleteName) {

		if (silverAthlete == null) {

			silverAthlete = new SilverWinner(athleteName);

		}

		return silverAthlete;

	}

}

class BronzeWinner extends Athlete {

	private static BronzeWinner bronzeAthlete = null;

	private BronzeWinner(String athleteName) {

		this.setAthleteName(athleteName);

	}

	public static BronzeWinner getInstance(String athleteName) {

		if (bronzeAthlete == null) {

			bronzeAthlete = new BronzeWinner(athleteName);

		}

		return bronzeAthlete;

	}

}

class MedalFactory {

	public Athlete getMedal(String medalType, String athleteName) {

		try {

			// Define the type of the parameter that will be passed
			// to the method I create below

			Class[] athleteNameParameter = new Class[] { String.class };

			// forName returns a class object with the String that is
			// passed to it. getMethod returns the method provided
			// the second parameter defines the type of parameter passed
			// to the method

			Method getInstanceMethod = Class.forName(medalType)
					.getMethod("getInstance", athleteNameParameter);

			// Create an array with the parameter values that will be
			// passed to the method getInstance

			Object[] params = new Object[] { new String(athleteName) };

			// Pass the parameters to method getInstance and return
			// a subclass of type Athlete

			return (Athlete) getInstanceMethod.invoke(null, params);

		}

		catch (Exception e) {

			throw new IllegalArgumentException("Invalid Medal Type");

		}

	}

}
