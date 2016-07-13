package com.upa.websites.codechefTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.codechef.WorkChef;

public class WorkChefTest {

	WorkChef test;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new WorkChef();
	}

	@After
	public void after() {
	}

	@Test
	public void test1() {
		int q = 1;
		long l = 5;
		long r = 15;
		long k = 1;
		long x = this.test.sol(l, r, k);
		System.out.println(" Test 1 ans " + x);
		assertEquals(11, x);
	}

	@Test
	public void test2() {
		long l = 5;
		long r = 15;
		long k = 2;
		long x = this.test.sol(l, r, k);
		System.out.println(" Test 2 ans " + x);
		assertEquals(2, x);
	}

	@Test
	public void test3() {
		long l = 48;
		long r = 48;
		long k = 2;
		long x = this.test.sol(l, r, k);
		System.out.println(" Test 2 ans " + x);
		assertEquals(1, x);
	}

	@Test
	public void test4() {
		long l = 100;
		long r = 150;
		long k = 2;
		long x = this.test.sol(l, r, k);
		System.out.println(" Test 3 ans " + x);
		assertEquals(2, x);
	}
}
