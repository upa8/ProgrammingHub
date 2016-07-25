package com.upa.websites.hackerearthTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.hackerEarth.CmBitShilAndRoundNumbers;

public class CmBitShilAndRoundNumbersTest {

	CmBitShilAndRoundNumbers test;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new CmBitShilAndRoundNumbers();
	}

	@After
	public void after() {
	}

	@Test
	public void test1() {
		System.out.println(this.test.roundNumberCheck(-999999990));
		System.out.println(this.test
				.roundNumberCheck(Long.valueOf("-999999999999986703")));

		System.out.println(this.test
				.roundNumberCheck(Long.valueOf("-999999999999978240")));

	}
}