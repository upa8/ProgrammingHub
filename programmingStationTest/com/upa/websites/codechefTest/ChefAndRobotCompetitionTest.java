package com.upa.websites.codechefTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.codechef.ChefAndRobotCompetition;

public class ChefAndRobotCompetitionTest {
	ChefAndRobotCompetition test;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new ChefAndRobotCompetition();
	}

	@After
	public void after() {
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
		int n = 4;
		int m = 4;
		int k1 = 1;
		int k2 = 1;
		char[][] a = { { 'S', 'W', 'W', 'E' }, { '0', 'W', 'W', '0' },
				{ '0', 'W', 'W', '0' }, { '0', '0', '0', '0' }, };
		int x = this.test.sol(n, m, k1, k2, a);
		System.out.println("ans " + x);
		assertEquals(9, x);
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		int n = 4;
		int m = 4;
		int k1 = 2;
		int k2 = 3;
		char[][] a = { { 'S', 'W', 'W', 'E' }, { '0', 'W', 'W', '0' },
				{ '0', 'W', 'W', '0' }, { '0', '0', '0', '0' }, };
		int x = this.test.sol(n, m, k1, k2, a);
		System.out.println("ans " + x);
		assertEquals(1, x);
	}

	@Test
	public void test3() {
		System.out.println("Test 3");
		int n = 4;
		int m = 4;
		int k1 = 3;
		int k2 = 3;
		char[][] a = { { 'S', 'W', 'W', 'E' }, { '0', 'W', 'W', '0' },
				{ '0', 'W', 'W', '0' }, { '0', '0', '0', '0' }, };
		int x = this.test.sol(n, m, k1, k2, a);
		System.out.println("ans " + x);
		assertEquals(1, x);
	}
}
