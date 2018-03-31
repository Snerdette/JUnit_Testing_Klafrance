package pdx_c13.monkeytesting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DividerTest {

	Divider divider = new Divider();
	
	@Test
	public void happyDividerTest(){
		
		double number1 = 10d;
		double number2 = 2d;
		double expectedResult = 5d;
		
		double actualResult = divider.divideDoubles(number1, number2);
		
		assertEquals(expectedResult, actualResult, 0);
	}
}
