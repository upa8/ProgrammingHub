package com.upa.dp.strategy;

public class Dog extends Animal {

	public void digHole() {

		System.out.println("Dug a hole");

	}

	public Dog() {

		super();

		this.setSound("Bark");

		// We set the Flys interface polymorphically
		// This sets the behavior as a non-flying Animal

		this.flyingType = new CantFly();

	}

	/*
	 * BAD You could override the fly method, but we are breaking the rule that
	 * we need to abstract what is different to the subclasses
	 * 
	 * public void fly(){
	 * 
	 * System.out.println("I can't fly");
	 * 
	 * }
	 */

}