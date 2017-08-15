

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.codechef.ChefAndTetris;

public class ChefAndTetrisTest {

	ChefAndTetris test;
	int n = 0;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new ChefAndTetris();
	}

	@After
	public void after() {
	}

	// Check single entry
	@Test
	public void test1() {

		System.out.println("Test 1");
		this.n = 1;
		long b[] = { 10 };
		long a[] = { 20 };
		long x = this.test.sol(this.n, b, a);
		System.out.println(x);
		assertEquals(30, x);
	}

	// Check two entry
	@Test
	public void test2() {
		System.out.println("Test 2");
		this.n = 2;
		long b[] = { 10, 10 };
		long a[] = { 20, 20 };
		long x = this.test.sol(this.n, b, a);
		System.out.println(x);
		assertEquals(30, x);
	}

	@Test
	public void test3() {

		System.out.println("Test 3");
		this.n = 4;
		long b[] = { 15, 7, 10, 10 };
		long a[] = { 6, 14, 21, 1 };
		long x = this.test.sol(this.n, b, a);
		System.out.println(x);
		assertEquals(21, x);
	}

	@Test
	public void test4() {
		System.out.println("Test 4");
		this.n = 3;
		long b[] = { 1, 100, 3 };
		long a[] = { 1, 2, 3 };
		long x = this.test.sol(this.n, b, a);
		System.out.println(x);
		assertEquals(-1, x);
	}

	@Test
	public void test5() {
		System.out.println("Test 5");
		this.n = 4;
		long b[] = { 3, 3, 3, 3 };
		long a[] = { 2, 2, 2, 2 };
		long x = this.test.sol(this.n, b, a);
		System.out.println(x);
		assertEquals(5, x);
	}

	@Test
	public void test6() {
		System.out.println("Test 6");
		this.n = 2;
		long b[] = { 17, 19 };
		long a[] = { 20, 15 };
		long x = this.test.sol(this.n, b, a);
		System.out.println("ans " + x);
		assertEquals(-1, x);
	}

	@Test
	public void test7() {
		System.out.println("Test 7");
		this.n = 17;
		long b[] = { 1, 4, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 5 };
		long a[] = { 2, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2 };
		long x = this.test.sol(this.n, b, a);
		System.out.println("ans " + x);
		assertEquals(2, x);
	}

}