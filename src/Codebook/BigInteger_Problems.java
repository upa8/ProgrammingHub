package Codebook;
/*
 * Author : Pratik Upacharya 
 * Question : Finding factorial of very large number 
 */

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class BigInteger_Problems {
	public static void main(String args[]) throws Exception{
		BigInteger fac = BigInteger.ONE; // :)
		for (int i = 2; i <= 25; i++)
			fac = fac.multiply(BigInteger.valueOf(i)); // wow :)
		System.out.println(fac);
	}
}
