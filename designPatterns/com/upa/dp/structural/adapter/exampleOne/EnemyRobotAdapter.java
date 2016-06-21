package com.upa.dp.structural.adapter.exampleOne;

//The Adapter must provide an alternative action for
//the the methods that need to be used because
//EnemyAttacker was implemented.

//This adapter does this by containing an object
//of the same type as the Adaptee (EnemyRobot)
//All calls to EnemyAttacker methods are sent
//instead to methods used by EnemyRobot

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;

	public EnemyRobotAdapter(EnemyRobot newRobot) {

		this.theRobot = newRobot;

	}

	@Override
	public void fireWeapon() {

		this.theRobot.smashWithHands();

	}

	@Override
	public void driveForward() {

		this.theRobot.walkForward();

	}

	@Override
	public void assignDriver(String driverName) {

		this.theRobot.reactToHuman(driverName);

	}

}