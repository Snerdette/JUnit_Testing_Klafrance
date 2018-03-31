package pdx_c13.monkeytesting;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

public class ZipCodeValidatorTest {

	ZipCodeValidator zipValid = new ZipCodeValidator();
	
	@Test
	public void happyPathZipLength() {

		assertTrue(zipValid.validateZipCode("55555"));
		
	}
	
	@Test
	public void HappyPathLong(){
		assertFalse(zipValid.validateZipCode("100001"));

	}
	
	@Test
	public void HappyPathLength(){
		assertTrue(zipValid.validateZipCode("99999"));
	}
	
	@Test
	public void SadPathAlphabet(){
		assertFalse(zipValid.validateZipCode("ABCDEFGHIJK"));

	}
	@Test
	public void HappyPathZeros(){
		assertTrue(zipValid.validateZipCode("00005"));

	}
	
	@Test
	public void SadPathZipSpecial(){
		assertFalse(zipValid.validateZipCode("#@$@#$^"));
	}
	
	@Test
	public void SadPathZip(){
		assertFalse(zipValid.validateZipCode(""));
		
	}
	
	@Test
	public void SadPathZipNull(){
		assertFalse(zipValid.validateZipCode(null));
		
	}
	
	
	

}
