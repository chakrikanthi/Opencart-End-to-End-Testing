package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Logout;
import testBase.Baseclass;

public class TC_LG_002LogoutfromRightColumnoption extends Baseclass{
	@Test(groups= {"sanity","master"})
	public void LogoutfromRightColumnoption() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi1@gmail.com");
        lp.setPassword("kanthi123");
        lp.clicklogin();
      
                	
		Logout lo= new Logout(driver);
		lo.setmyAccount();
		lo.logoutfromrightcolumn();
		System.out.println("You are in page:"+driver.getTitle());
		lo.continuebtnafterlogout();
		System.out.println("Last page is:"+driver.getTitle());

}
}