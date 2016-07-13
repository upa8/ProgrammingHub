package com.upa.websites.codechefTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayDeque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.codechef.ChefLandAndElectricity;

public class ChefLandAndElectricityTest {

	ChefLandAndElectricity test;
	String str = null;
	int n = 0;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new ChefLandAndElectricity();
	}

	@After
	public void after() {
	}

	@Test
	public void test1() {
		this.n = 2;
		this.str = "01";
		long xCordinate[] = { 1, 5 };
		assertEquals(4, this.test.sol(this.n, this.str, xCordinate));
	}

	@Test
	public void test2() {
		this.n = 2;
		this.str = "11";
		long xCordinate[] = { 1, 5 };
		assertEquals(0, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test3() {

		this.n = 3;
		this.str = "100";
		long xCordinate[] = { 1, 5, 6 };
		assertEquals(5, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test4() {
		this.n = 4;
		this.str = "1001";
		long xCordinate[] = { 1, 5, 6, 10 };
		assertEquals(5, this.test.sol(this.n, this.str, xCordinate));
	}

	@Test
	public void test5() {

		this.n = 5;
		this.str = "10011";
		long xCordinate[] = { 1, 5, 6, 10, 15 };
		assertEquals(5, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test6() {

		this.n = 10;
		this.str = "1001110001";
		long xCordinate[] = { 1, 5, 6, 10, 15, 20, 24, 27, 29, 35 };
		assertEquals(14, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test7() {

		this.n = 10;
		this.str = "1000000000";
		long xCordinate[] = { 1, 5, 6, 10, 15, 20, 24, 27, 29, 35 };
		assertEquals(34, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test8() {

		this.n = 10;
		this.str = "0000010000";
		long xCordinate[] = { 1, 5, 6, 10, 15, 20, 24, 27, 29, 35 };
		assertEquals(34, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test9() {

		this.n = 10;
		this.str = "1000000001";
		long xCordinate[] = { 1, 5, 6, 10, 15, 20, 24, 27, 29, 30 };
		long x = this.test.sol(this.n, this.str, xCordinate);
		System.out.println("ans 9 " + x);
		assertEquals(24, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test10() {

		this.n = 3;
		this.str = "101";
		long xCordinate[] = { 1, 5, 6 };
		long x = this.test.sol(this.n, this.str, xCordinate);
		System.out.println("ans 10 " + x);
		assertEquals(1, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test11() {

		this.n = 10;
		this.str = "1010101010";
		long xCordinate[] = { 1, 5, 6, 7, 10, 15, 16, 18, 20, 25 };
		long x = this.test.sol(this.n, this.str, xCordinate);
		System.out.println("ans 11 " + x);
		assertEquals(10, this.test.sol(this.n, this.str, xCordinate));

	}

	@Test
	public void test12() {
		int n = 4;
		int electricity[] = { 1, 0, 0, 1 };
		this.str = "1001";
		long xCordinate[] = { 1, 2, 25, 26 };
		long x = this.test.sol(n, this.str, xCordinate);
		System.out.println("ans12 " + x);
		assertEquals(2, x);

	}

	@Test
	public void test13() {
		int n = 1;
		this.str = "1";
		long xCordinate[] = { 5 };
		ArrayDeque<Integer> pq = new ArrayDeque<Integer>();
		pq.add(0);
		long x = this.test.sol(n, this.str, xCordinate);
		System.out.println("ans13 " + x);
		assertEquals(0, x);

	}

	@Test
	public void test14() {
		System.out.println("Test 14");
		int n = 7;
		this.str = "1000001";
		long xCordinate[] = { 1, 7, 12, 15, 29, 34, 40 };
		long x = this.test.sol(n, this.str, xCordinate);
		System.out.println("ans14 " + x);
		assertEquals(25, x);
	}

}
