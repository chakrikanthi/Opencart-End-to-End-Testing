package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_MA_002validatingmyaccountlogin extends Baseclass{

	@Test(groups= {"sanity","master"})
	public void validatingmyaccountlogin() 
	{
		logger.info("!*** Starting TC_002_LoginTest***!");
		logger.debug("Capturing application debug log info..");
		//suppose if any element is not diplaying or any issues to handle it we keep entire scrpit in try catch block 
		//driver.manage().deleteAllCookies();
		try {
		//Create object for Homepage and performing actions
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount in Homepage..");
		hp.clicklogin(); //Login link under MyAccount...this is from home page
		logger.info("Clicked on Login Button under MyAccount..");
		
		
		//Created an object for Loginpage and performing actions
		//Here we have to capture login info from config.properties file, As we created properties file in base class, we can refer object p
		Loginpage lp= new Loginpage(driver);
		logger.info("Entering valid email id..");
		lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
		logger.info("Entering valid password...");
		lp.setPassword(p.getProperty("password")); // same as above line
		lp.clicklogin();  //Login link button in login page...this is from login page
	    logger.info("clicked on login button...");	
	    //driver.switchTo().alert().accept();
	    Thread.sleep(2500);
	    
	    
	    MyAccountPage macc=new MyAccountPage(driver);
		
		boolean targetPage=macc.isMyAccountpageexist();
		
		System.out.println(targetPage);
		macc.clickmyAccount();
		macc.myAccountafterloggedin();
		Assert.assertEquals(targetPage, true,"Login failed"); // here target page compared with true..if the condition fails then error message will be displayed
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("User got logged in successfully");
		
		
	
}

	
}