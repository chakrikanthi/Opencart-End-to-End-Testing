package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_LF_006CheckingForgetPasswordlinkavailability extends Baseclass {
	@Test(groups= {"sanity","master"})
	public void CheckingForgetPasswordlinkavailability() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("chakri@gmail.com");
	    lp.forgottenPasswordlink();
		String forgetpaswordpage= driver.getTitle();
		if(forgetpaswordpage.equals("Forgot Your Password?")) {
			System.out.println("Forgotten Password link got clicked and you are in Forgot your Password? page");
		}

}
}