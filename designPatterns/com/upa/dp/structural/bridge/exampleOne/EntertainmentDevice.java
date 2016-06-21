package com.upa.dp.structural.bridge.exampleOne;

//Implementor
//With the Bridge Design Pattern you create 2 layers of abstraction
//In this example I'll have an abstract class representing
//different types of devices. I also have an abstract class
//that will represent different types of remote controls

//This allows me to use an infinite variety of devices and remotes

abstract class EntertainmentDevice {

	public int deviceState;

	public int maxSetting;

	public int volumeLevel = 0;

	public abstract void buttonFivePressed();

	public abstract void buttonSixPressed();

	public void deviceFeedback() {

		if ((this.deviceState > this.maxSetting) || (this.deviceState < 0)) {
			this.deviceState = 0;
		}

		System.out.println("On Channel " + this.deviceState);

	}

	public void buttonSevenPressed() {

		this.volumeLevel++;

		System.out.println("Volume at: " + this.volumeLevel);

	}

	public void buttonEightPressed() {

		this.volumeLevel--;

		System.out.println("Volume at: " + this.volumeLevel);

	}

}