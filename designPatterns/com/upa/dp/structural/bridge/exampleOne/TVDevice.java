package com.upa.dp.structural.bridge.exampleOne;

//Concrete Implementor

//Here is an implementation of the EntertainmentDevice
//abstract class. I'm specifying what makes it different
//from other devices

public class TVDevice extends EntertainmentDevice {

	public TVDevice(int newDeviceState, int newMaxSetting) {

		this.deviceState = newDeviceState;

		this.maxSetting = newMaxSetting;

	}

	@Override
	public void buttonFivePressed() {

		System.out.println("Channel Down");

		this.deviceState--;

	}

	@Override
	public void buttonSixPressed() {

		System.out.println("Channel Up");

		this.deviceState++;

	}

}