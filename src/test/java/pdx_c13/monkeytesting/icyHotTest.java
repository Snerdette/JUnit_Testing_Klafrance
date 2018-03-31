package pdx_c13.monkeytesting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class icyHotTest {

	icyHot ih = new icyHot();
	
	
	@Test
	public void HappyPathOptionA() {
		int temp1 = -101;
		int temp2 = 101;
		
		assertTrue(ih.icyHot(temp1, temp2));
	}
	
	@Test
	public void SadPathOptionB() {
		int temp1 = 150;
		int temp2 = -5;
		
		assertTrue(ih.icyHot(temp1, temp2));
	}

	@Test
	public void SadPathSame() {
		int temp1 = 1;
		int temp2 = 1;
		
		assertFalse(ih.icyHot(temp1, temp2));
	} 
	
	@Test
	public void SadPathBothOver100() {
		int temp1 = 150;
		int temp2 = 150;
		
		assertFalse(ih.icyHot(temp1, temp2));
	}
	
	@Test
	public void SadPath2580() {
		int temp1 = 0;
		int temp2 = 100;
		
		assertFalse(ih.icyHot(temp1, temp2));
	}
	@Test
	public void SadPath3() {
		int temp1 = 150;
		int temp2 = -5;
		
		assertTrue(ih.icyHot(temp1, temp2));
	}
	@Test
	public void SadPath4() {
		int temp1 = -5;
		int temp2 = -150;
		
		assertFalse(ih.icyHot(temp1, temp2));
	}
}
