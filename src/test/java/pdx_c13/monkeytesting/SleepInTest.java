package pdx_c13.monkeytesting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class SleepInTest {

	SleepIn snooze = new SleepIn();
	
	@Test
	public void HappyPathWandVSleep() {
		assertTrue(snooze.sleepIn(true, true));
	}
	
	
	@Test
	public void SadPathVSleep(){
		assertTrue(snooze.sleepIn(false, true));
	}
	
	@Test
	public void SadPathWSleep(){
		assertFalse(snooze.sleepIn(true,  false));
	}
	
	@Test
	public void SadPathNoSleepIn(){
		assertTrue(snooze.sleepIn(false,  false));
	}
}
