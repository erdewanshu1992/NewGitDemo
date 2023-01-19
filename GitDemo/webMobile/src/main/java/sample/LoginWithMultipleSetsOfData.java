package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithMultipleSetsOfData {



	@Test
	public void verifyLoginCredentials(String scenario, String username, String password) {
		
		
	}
	
	
	
	
	@DataProvider(name = "credentilas")
	public Object[][] getData() {
		
		return new Object[][] {
			{"bothcorrect","",""},
			{"bothwrong","",""},
			{"correctusername","",""},
			{"correctpassword","",""}
		};
	}
		
	}


