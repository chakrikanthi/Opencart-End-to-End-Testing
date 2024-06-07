package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_CP_009validatebackbuttoninchangepswdpg extends Baseclass {
	@Test
	public void validatebackbuttoninchangepswdpg() {
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
		macc.changepasswordfield1("kanthi123");
		macc.passwordConfirmfield2("kanthi123");
		driver.navigate().back();
		System.out.println("Back Arrow got clicked");
		MyAccountPage macc1=new MyAccountPage(driver);
		System.out.println(driver.getTitle());
		macc1.changeurPasswordfromleftcolumn();
		System.out.println(driver.getTitle());
}}
