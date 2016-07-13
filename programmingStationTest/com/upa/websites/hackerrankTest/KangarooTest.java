package com.upa.websites.hackerrankTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.hackerrank.Kangaroo;

public class KangarooTest {

	Kangaroo test;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new Kangaroo();
	}

	@After
	public void after() {
	}

	@Test
	public void test1() {
		assertEquals("YES", this.test.solution(0, 3, 4, 2));
	}

	@Test
	public void test2() {
		assertEquals("NO", this.test.solution(0, 2, 5, 3));
	}

	@Test
	public void test3() {
		assertEquals("YES", this.test.solution(0, 2, 0, 2));
	}

	@Test
	public void test4() {
		assertEquals("NO", this.test.solution(0, 3, 0, 1));
	}

	@Test
	public void test5() {
		assertEquals("NO", this.test.solution(0, 1, 1, 1));
	}

	@Test
	public void test6() {
		assertEquals("NO", this.test.solution(0, 3, 1, 1));
	}

}
