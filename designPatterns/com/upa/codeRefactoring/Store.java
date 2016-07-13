package com.upa.codeRefactoring;

import java.util.ArrayList;

public class Store {

	public ArrayList<Product> theProducts = new ArrayList<Product>();

	public void addAProduct(Product newProduct) {

		this.theProducts.add(newProduct);

	}

	public void getCostOfProducts() {

		for (Product product : this.theProducts) {

			// You can also use an explaining variable for complicated
			// calculations
			// It may however be better to extract this code into a method
			// though
			// to separate it from the method

			// final is used to make sure the temp only has 1 value per
			// iteration
			// It is bad practice to assign different values to a temp

			final int numOfProducts = product.getQuantity();
			final String prodName = product.getName();
			final double cost = product.getTotalCost();

			final double costWithDiscount = product.getTotalCost()
					/ product.getQuantity();
			final double costWithoutDiscount = product.getPrice()
					+ product.getShippingCost();

			System.out.println("Total cost for " + numOfProducts + " "
					+ prodName + "s is $" + cost);

			System.out.println("Cost per product " + costWithDiscount);

			System.out.println("Savings per product "
					+ (costWithoutDiscount - costWithDiscount));

			System.out.println();

			/*
			 * BAD CODE 2 System.out.println("Total cost for " +
			 * product.getQuantity() + " " + product.getName() + "s is $" +
			 * product.getTotalCost());
			 * 
			 * System.out.println("Cost per product " + product.getTotalCost() /
			 * product.getQuantity());
			 * 
			 * System.out.println("Savings per product " + ((product.getPrice()
			 * + product.getShippingCost()) - (product.getTotalCost() /
			 * product.getQuantity())) + "\n");
			 */

		}

	}

	public static void main(String[] args) {

		Store cornerStore = new Store();

		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 52));

		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 26));

		cornerStore.addAProduct(new Product("Pizza", 10.00, 1.00, 10));

		cornerStore.getCostOfProducts();

	}

	// BAD CODE 3
	// Why Is it Bad to Assign Many Values to a Temp?

	/*
	 * double temp = totalCost / numberOfProducts;
	 * 
	 * temp = temp + shipping;
	 * 
	 * // temp may be the product price + shipping - discount // but will this
	 * make sense a year from now?
	 * 
	 * temp = temp - discount;
	 */

	// BAD CODE 4
	// Don't assign values to parameters either
	/*
	 * public double getTotPrice(double quantity, double price, double
	 * shippingCost, double discount) {
	 * 
	 * price = price + shippingCost; price = price * quantity; return price -
	 * discount;
	 * 
	 * }
	 */

}