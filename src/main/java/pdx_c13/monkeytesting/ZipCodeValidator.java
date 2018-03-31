package pdx_c13.monkeytesting;

public class ZipCodeValidator {

	
	public boolean validateZipCode(String zip) {

		int input;
		
		if(zip == null || zip.equals("")) {
			return false;
		}

		try {
			input = Integer.parseInt(zip);
			if (input < 100000)
				return true;

		} catch (Exception e) {
			return false;
		}

		return false;
	}
	
	
}
