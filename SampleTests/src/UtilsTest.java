import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class UtilsTest {
	//Must make this static so its availble to other methods
	private static Utils u1 ;
	private static Utils u2 ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		u1= new Utils(4,2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		u1 = null;
		
	}
//Gets Executed Before every test method 
//used when two or more tests operate on the same object
//This is where you can set up your fixture(expected data) for each test cass
	
	
	@Before
	public void setUp() throws Exception {
		u2 = new Utils(9,3);
	}
//This can be used to release any allocated resources
	@After
	public void tearDown() throws Exception {
		u2 = null;
	}

	@Test
	public void testUtils() {
		fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		int[] vec = {1,1,1};
		int num = Utils.sum(vec); 
		assertTrue(num ==3);
	}

	@Test
	public void testMultiply() {
		int[] vec = {4,3,2};
		int num = Utils.multiply(vec);
		assertTrue(num == 24);
	}

	@Test
	public void testDivide() {
		double temp = 2;
		double result = u1.divide();
		assertEquals(temp, result,0.0);
		
	}

	@Test
	public void testToStringDouble() {
		String expected = "2.0";
		String result = u1.toString();	
		assertEquals(expected, result);
		}
	
	


//This throws an error when it is tested, theres a difference between this and Failures
	@Test
	public void testDivideByZero() {
		fail("Not yet implemented");
	}




	@Test
	public void testCreateArray() {
		int[] expectedArray ={1,3,5,7};
		int[]resultArray = u2.createArray();
		assertArrayEquals(expectedArray,resultArray);
		
	}

}
