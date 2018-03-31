package pdx_c13.monkeytesting;

public class AdderTest {

	Adder adder = new Adder();
	
	public void addPositiveNumbersTest(){
		int number1 = 3;
		int number2 = 5;
		int result = 0;
		
		result = adder.addition(number1, number2);
	}


}
