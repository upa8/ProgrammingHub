package com.upa.dp.structural.adapter.exampleOne;

//This is the Adaptee. The Adapter sends method calls
//to objects that use the EnemyAttacker interface
//to the right methods defined in EnemyRobot

import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();

	public void smashWithHands() {

		int attackDamage = this.generator.nextInt(10) + 1;

		System.out.println("Enemy Robot Causes " + attackDamage
				+ " Damage With Its Hands");

	}

	public void walkForward() {

		int movement = this.generator.nextInt(5) + 1;

		System.out.println("Enemy Robot Walks Forward " + movement + " spaces");

	}

	public void reactToHuman(String driverName) {

		System.out.println("Enemy Robot Tramps on " + driverName);

	}

}