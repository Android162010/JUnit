import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MoneyTest {
	private static Money m1 ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m1= new Money("yen",2.0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		m1=null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoney() {
		
		assertNotNull(m1);
	}

	@Test
	public void testCheckTypesOfCurrency() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTypeOfCurrency() {
		String testString = "yen";
		String resultString =m1.getTypeOfCurrency();
		assertEquals(testString,resultString );
	}

	@Test
	public void testGetAmount() {
		double expectedAmount = 2.0;
		double resultAmount = m1.getAmount();
		assertEquals(expectedAmount,resultAmount,.0001 );
	}

}
