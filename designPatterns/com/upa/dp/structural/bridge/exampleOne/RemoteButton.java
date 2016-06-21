package com.upa.dp.structural.bridge.exampleOne;

//Abstraction

//This is an abstract class that will represent numerous
//ways to work with each device

public abstract class RemoteButton {

	// A reference to a generic device using aggregation

	private final EntertainmentDevice theDevice;

	public RemoteButton(EntertainmentDevice newDevice) {

		this.theDevice = newDevice;

	}

	public void buttonFivePressed() {

		this.theDevice.buttonFivePressed();

	}

	public void buttonSixPressed() {

		this.theDevice.buttonSixPressed();

	}

	public void deviceFeedback() {

		this.theDevice.deviceFeedback();

	}

	public abstract void buttonNinePressed();

}