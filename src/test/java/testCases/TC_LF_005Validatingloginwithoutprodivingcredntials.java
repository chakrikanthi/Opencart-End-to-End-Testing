package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_LF_005Validatingloginwithoutprodivingcredntials  extends Baseclass{
	@Test(groups= {"sanity","master"})
	public void Validatingloginwithoutprodivingcredntials() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kk@gmail.com");
		lp.setPassword("gkjghjkhjlkl");
		lp.clicklogin();
		
		boolean warningstatus= lp.loginwarningmsgisdisplayed();
		if(warningstatus== true) {
			System.out.println("User can't login because of invalid credtials..warning message is displayed as: "+lp.loginwarningmsggettext());
		}

}
}