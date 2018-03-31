package pdx_c13.monkeytesting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class MonkeyTest {

	MonkeyTrouble mTrouble = new MonkeyTrouble();
	
	@Test
	public void HappyPathAllSmile(){
		assertTrue(mTrouble.monkeyTrouble(true, true));
	}
	
	@Test
	public void SadPathBSmile(){
		assertFalse(mTrouble.monkeyTrouble(false, true));
	}
	
	@Test
	public void SadPathASmile(){
		assertFalse(mTrouble.monkeyTrouble(true, false));
	}
	
	@Test
	public void HappyPathNoSmile(){
		assertTrue(mTrouble.monkeyTrouble(false, false));
	}

}