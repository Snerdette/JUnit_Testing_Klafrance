package pdx_c13.monkeytesting;

import org.testng.annotations.Test;

public class notStringTest {

	notString nString = new notString();
	
	@Test
	public void HappyPath() {
		String not = "not";
		String result;
		
		result = nString.notString(not);
	}
	
	@Test
	public void SadPath(){
		String result;
		
		result = nString.notString("Happy Path");
	}
	
	@Test
	public void SadPath2(){
		String result;
		
		result = nString.notString("not Happy Path");
	}
	
	@Test
	public void SadPath3(){
		String result;
		
		result = nString.notString("HA");
	}

}
