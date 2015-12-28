package com.upa.dp.observer;

import java.util.ArrayList;

//Uses the Subject interface to update all Observers

public class StockGrabber implements Subject {

	private final ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {

		// Creates an ArrayList to hold all observers

		this.observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver) {

		// Adds a new observer to the ArrayList

		this.observers.add(newObserver);

	}

	public void unregister(Observer deleteObserver) {

		// Get the index of the observer to delete

		int observerIndex = this.observers.indexOf(deleteObserver);

		// Print out message (Have to increment index to match)

		System.out.println("Observer " + (observerIndex + 1) + " deleted");

		// Removes observer from the ArrayList

		this.observers.remove(observerIndex);

	}

	@Override
	public void notifyObserver() {

		// Cycle through all observers and notifies them of
		// price changes

		for (Observer observer : this.observers) {

			observer.update(this.ibmPrice, this.aaplPrice, this.googPrice);

		}
	}

	// Change prices for all stocks and notifies observers of changes

	public void setIBMPrice(double newIBMPrice) {

		this.ibmPrice = newIBMPrice;

		this.notifyObserver();

	}

	public void setAAPLPrice(double newAAPLPrice) {

		this.aaplPrice = newAAPLPrice;

		this.notifyObserver();

	}

	public void setGOOGPrice(double newGOOGPrice) {

		this.googPrice = newGOOGPrice;

		this.notifyObserver();

	}

}