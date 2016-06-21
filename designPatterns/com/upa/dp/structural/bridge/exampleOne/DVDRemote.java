package com.upa.dp.structural.bridge.exampleOne;

//Refined Abstraction

//If I decide I want to further extend the remote I can

public class DVDRemote extends RemoteButton {

	private boolean play = true;

	public DVDRemote(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {

		this.play = !this.play;

		System.out.println("DVD is Playing: " + this.play);

	}

}