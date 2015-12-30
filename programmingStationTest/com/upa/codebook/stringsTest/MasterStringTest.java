package com.upa.codebook.stringsTest;

import org.junit.Assert;
import org.junit.Test;

import com.upa.codebook.strings.MasterString;

public class MasterStringTest {

	@Test
	public void test() {
		// MasterString test = new MasterString();
		// assertEquals("0 ", test.naiveStringMatching("a", "abc"));
		Assert.assertTrue(true);
	}

	@Test
	public void test1() {
		MasterString test = new MasterString();

		// assertEquals(str1, str2);
		Assert.assertEquals("Not equal", "1 4 ",
				test.naiveStringMatching("abc b", "b"));
	}

}
