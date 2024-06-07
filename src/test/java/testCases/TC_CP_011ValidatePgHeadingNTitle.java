package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_CP_011ValidatePgHeadingNTitle extends Baseclass{
	@Test
	public void ValidatePgHeadingNTitle() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");	

		MyAccountPage macc=new MyAccountPage(driver);
		macc.changepasswordfromRIGHTcolumnside();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
