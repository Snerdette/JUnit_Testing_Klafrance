package pdx_c13.monkeytesting;

public class MonkeyTrouble {

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
			return true;
		}
		else
			return false;
	}
}
