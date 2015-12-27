package com.upa.basicExampleTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.upa.basicExample.JunitExamples;

public class JunitExampleTest {

	JunitExamples sampleTest;

	// This method runs before every test case
	@Before
	public void before() {
		this.sampleTest = new JunitExamples();
	}

	// This method runs after every test case
	@After
	public void after() {

	}

	/*
	 * // This method runs only once before initialization of class
	 *
	 * @BeforeClass public static void BeforeClass() {
	 *
	 * }
	 *
	 * //This method runs only once after initialization of class
	 *
	 * @AfterClass public static void AfterClass() {
	 *
	 * }
	 *
	 */

	// Test cases starts from here
	// This is test 1
	@Test
	public void test1() {
		assertTrue(this.sampleTest.strinChecking("Pratik"));
	}

	// This is test 2
	@Test
	public void test2() {
		// Additional Assert Examples
		assertEquals("Pratik", "Pratik");

		// assertArrayEquals(Array1, Array2);
	}

	@Test(expected = NullPointerException.class)
	public void test3() {
		int[] numbers = {}; // This test will fail , so change it to null
		// int [] numners = null; // This is expected here
		Arrays.sort(numbers);

	}

	// TimeOut Test
	// Time out here 2 miliseconds
	// So test will fail if it takes more than 2 miliseconds
	@Test(timeout = 2)
	public void test4() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {

		}
	}

}
