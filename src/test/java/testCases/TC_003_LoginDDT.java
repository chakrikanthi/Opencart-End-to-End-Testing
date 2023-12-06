package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends Baseclass 
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
		//Home page object and entering data
			Homepage hp=new Homepage(driver);
			hp.clickMyAccount();
			hp.clicklogin(); //Login link under MyAccount
				
			//created object for Login page 
			Loginpage lp=new Loginpage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clicklogin(); //Login button
				
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountpageexist();
			
			if(exp.equalsIgnoreCase("Valid")) //validation
			{
				if(targetPage==true)
				{
				
					macc.clicklogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clicklogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
	
}




