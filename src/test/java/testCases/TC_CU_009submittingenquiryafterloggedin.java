package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_CU_009submittingenquiryafterloggedin  extends Baseclass{
	@Test
	public void submittingenquiryafterloggedin()  {


		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		
		ContactUs contUs= new ContactUs(driver);
		contUs.phoneicon();
		
		System.out.println("Name in your name text field id:"+contUs.yourNamegettingText());
		System.out.println("Email id in Email test field is: " +contUs.gettingeMailAddress()) ;
		contUs.enquirytextbox("This is test text message after logged into your account");
		contUs.submitbtn();
		System.out.println("Currently you are in page: "+driver.getTitle());
		System.out.println("Current URL is: "+driver.getCurrentUrl());

}
}