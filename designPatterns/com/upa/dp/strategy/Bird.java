package com.upa.dp.strategy;

public class Bird extends Animal {

	// The constructor initializes all objects

	public Bird() {

		super();

		this.setSound("Tweet");

		// We set the Flys interface polymorphically
		// This sets the behavior as a non-flying Animal

		this.flyingType = new ItFlys();

	}

}