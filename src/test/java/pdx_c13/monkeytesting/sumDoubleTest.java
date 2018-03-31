package pdx_c13.monkeytesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class sumDoubleTest {
	
	sumDouble sDouble = new sumDouble();
	int result = 0;
	
	@Test
	public void HappyPathEqual() {
		int input1 = 5;
		int input2 = 5;
		int expectedResult = 20;
		int actualResult = sDouble.sumDouble(input1, input2);
		
		assertEquals(expectedResult, actualResult);
 
	}
	@Test
	public void SadPathNotEqual() {
		int input1 = 5;
		int input2 = 45;
		int expectedResult = 20;
		int actualResult = sDouble.sumDouble(input1, input2);
		
		assertNotEquals(expectedResult, actualResult);

	}
	
	@Test
	public void SadPath(){
		
		int input1 = 5;
		int input2 = 45;
		int expectedResult = 50;
		int actualResult = (input1 + input2);
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void SadPathBroken(){
		
		int input1 = 80;
		int input2 = 45;
		int expectedResult = 100;
		int actualResult = (input1 + input2);
		
		assertNotEquals(expectedResult, actualResult);
		
	}


}
