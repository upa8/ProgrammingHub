

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.upa.websites.codechef.PolyEval;

public class PolyEvalTest {

	PolyEval test;

	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void before() {
		this.test = new PolyEval();
	}

	@After
	public void after() {
	}

	@Test
	public void test1() {
		int n = 2;
		long a[] = { 1, 2, 3 };
		for (int i = 1; i <= 10; i++) {
			long x = i;
			long y = this.test.sol(n, a, x);
			System.out.println("Test 1 x =" + i + " : " + y);

		}
		assertEquals(0, 0);
	}
}