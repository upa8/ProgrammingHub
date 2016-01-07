package com.upa.codebook.stack;
/*
 * Java Program to Implement Stack
   Reference = http://www.sanfoundry.com/java-program-implement-stack/
 */

import java.util.NoSuchElementException;
import java.util.Scanner;

/*  Class arrayStack  */
class arrayStack {
	protected int arr[];
	protected int top, size, len;

	/* Constructor for arrayStack */
	public arrayStack(int n) {
		this.size = n;
		this.len = 0;
		this.arr = new int[this.size];
		this.top = -1;
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return this.top == -1;
	}

	/* Function to check if stack is full */
	public boolean isFull() {
		return this.top == (this.size - 1);
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return this.len;
	}

	/* Function to check the top element of the stack */
	public int peek() {
		if (this.isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return this.arr[this.top];
	}

	/* Function to add an element to the stack */
	public void push(int i) {
		if ((this.top + 1) >= this.size) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		if ((this.top + 1) < this.size) {
			this.arr[++this.top] = i;
		}
		this.len++;
	}

	/* Function to delete an element from the stack */
	public int pop() {
		if (this.isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		this.len--;
		return this.arr[this.top--];
	}

	/* Function to display the status of the stack */
	public void display() {
		System.out.print("\nStack = ");
		if (this.len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
}

/* Class StackImplement */
public class StackImplement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Stack Test\n");
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt();
		/* Creating object of class arrayStack */
		arrayStack stk = new arrayStack(n);
		/* Perform Stack Operations */
		char ch;
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			System.out.println("6. size");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				try {
					stk.push(scan.nextInt());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Popped Element = " + stk.pop());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element = " + stk.peek());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty status = " + stk.isEmpty());
				break;
			case 5:
				System.out.println("Full status = " + stk.isFull());
				break;
			case 6:
				System.out.println("Size = " + stk.getSize());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* display stack */
			stk.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

		} while ((ch == 'Y') || (ch == 'y'));
	}
}