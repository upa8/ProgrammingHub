package com.upa.dp.strategy;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;

	// Instead of using an interface in a traditional way
	// we use an instance variable that is a subclass
	// of the Flys interface.

	// Animal doesn't care what flyingType does, it just
	// knows the behavior is available to its subclasses

	// This is known as Composition : Instead of inheriting
	// an ability through inheritance the class is composed
	// with Objects with the right ability

	// Composition allows you to change the capabilities of
	// objects at run time!

	public Flys flyingType;

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return this.name;
	}

	public void setHeight(double newHeight) {
		this.height = newHeight;
	}

	public double getHeight() {
		return this.height;
	}

	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			this.weight = newWeight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}

	public double getWeight() {
		return this.weight;
	}

	public void setFavFood(String newFavFood) {
		this.favFood = newFavFood;
	}

	public String getFavFood() {
		return this.favFood;
	}

	public void setSpeed(double newSpeed) {
		this.speed = newSpeed;
	}

	public double getSpeed() {
		return this.speed;
	}

	public void setSound(String newSound) {
		this.sound = newSound;
	}

	public String getSound() {
		return this.sound;
	}

	/*
	 * BAD You don't want to add methods to the super class. You need to
	 * separate what is different between subclasses and the super class public
	 * void fly(){
	 * 
	 * System.out.println("I'm flying");
	 * 
	 * }
	 */

	// Animal pushes off the responsibility for flying to flyingType

	public String tryToFly() {

		return this.flyingType.fly();

	}

	// If you want to be able to change the flyingType dynamically
	// add the following method

	public void setFlyingAbility(Flys newFlyType) {

		this.flyingType = newFlyType;

	}

}