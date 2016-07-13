package com.upa.codeRefactoring;

public class Product {

	private String name = "";
	private double price = 0.0;
	private double shippingCost = 0.0;
	private int quantity = 0;

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double getShippingCost() {
		return this.shippingCost;
	}

	public int getQuantity() {
		return this.quantity;
	}

	Product(String name, double price, double shippingCost, int quantity) {

		this.name = name;
		this.price = price;
		this.shippingCost = shippingCost;
		this.quantity = quantity;

	}

	public double getTotalCost() {

		double quantityDiscount = 0.0;

		// If your expressions become complicated it may make more sense to save
		// them in temporary variables (Explaining Variables)

		final boolean over50Products = (this.quantity > 50)
				|| ((this.quantity * this.price) > 500);
		final boolean over25Products = (this.quantity > 25)
				|| ((this.quantity * this.price) > 100);
		final boolean over10Products = (this.quantity >= 10)
				|| ((this.quantity * this.price) > 50);

		if (over50Products) {

			quantityDiscount = .10;

		} else if (over25Products) {

			quantityDiscount = .07;

		} else if (over10Products) {

			quantityDiscount = .05;

		}

		/*
		 * BAD CODE 1 if((quantity > 50) || ((quantity * price) > 500)) {
		 * 
		 * quantityDiscount = .10;
		 * 
		 * } else if((quantity > 25) || ((quantity * price) > 100)) {
		 * 
		 * quantityDiscount = .07;
		 * 
		 * } else if((quantity >= 10) || ((quantity * price) > 50)) {
		 * 
		 * quantityDiscount = .05;
		 * 
		 * }
		 */

		double discount = ((this.quantity - 1) * quantityDiscount) * this.price;

		return ((this.quantity * this.price)
				+ (this.quantity * this.shippingCost)) - discount;

	}

}