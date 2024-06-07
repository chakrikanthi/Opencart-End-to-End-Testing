package testCases;


import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import testBase.Baseclass;

public class TC_AFL_018VerifyingLogintoAffiliatedAccntwithoutregister extends Baseclass{
	@Test
	public void VerifyingLogintoAffiliatedAccntwithoutregister() throws InterruptedException {

		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		AA.affiliateEMaillogin("pavanoltraining@gmail.com");
		AA.affiliatepassword("test123");
		AA.affiliatedloginbtn();
        String Myacntpg=driver.getTitle();
        if(Myacntpg.equals("My Account")) {
        	System.out.println("User got successfully loged in");
        }
        else{
        	System.out.println("Warning: No match for E-Mail Address and/or Password.");
        }
}
}