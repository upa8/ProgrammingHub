package com.upa.dp.basic;
/*
 * Video Tutorial :
 *		http://www.newthinktank.com/2012/08/design-patterns-video-tutorial/
 *
 *
 */

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;

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

	// A private method can only be accessed by other public methods
	// that are in the same class

	private void bePrivate() {
		System.out.println("I'm a private method");
	}

	public static void main(String[] args) {

		Animal dog = new Animal();

		dog.setName("Grover");

		System.out.println(dog.getName());

	}

}