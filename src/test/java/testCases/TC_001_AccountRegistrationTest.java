package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;

import pageObjects.Homepage;
import testBase.Baseclass;

public class TC_001_AccountRegistrationTest extends Baseclass {
	

	@Test(groups={"regression","master"})
	public void verify_Account_Registration() throws InterruptedException 
	{
		logger.info("!****TC_001_AccountRegistrationTest***!");
		logger.debug("Application log started...");
		
		try
		{
		Homepage hp= new Homepage(driver);  //Create Object for Homepage
		Thread.sleep(2300);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount...");
		hp.clickRegister();
		logger.info("Clicked on Register link...");
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver); //Create Object for Accountregistrationpage
		regpage.setfirstname(randomstring().toUpperCase());
		logger.info("Entered First name...");
		regpage.setlastname(randomstring().toUpperCase());
		logger.info("Entered Last name...");
		regpage.setEmail(randomstring()+"@gmail.com");
		logger.info("Entered Email id...");
		regpage.settelephone(randomNumber());
		logger.info("Entered Phone number...");
		String password= randomAlphaNumeric();
		Thread.sleep(2000);
		regpage.setpassword(password);
		regpage.setconfirmpassword(password);
		logger.info("Entered Password...");
		
		regpage.setchkdpolicy();
		logger.info("checked privacy policy...");
		regpage.clickcontinue();
		logger.info("Clicked Continue button...");
		
		String confmsg= regpage.getConfirmationMsg();
		logger.info("Validating expected message");
		if(confmsg.equals("Your Account Has Been Created!"))//here we are intentionally failling the tc for taking screen shot ..actul value is "Your Account Has Been Created!"
		{
			logger.info("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
		}
		catch(Exception e)//this catch block will be executed when error occurs
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}
		
		logger.debug("application log ended......");
		logger.info("**** finished TC_001_AccountRegistrationTest  *****");
	}


}
//after running/executing  the test...refresh the log folder and see the result of the test
//try to make test fail and run the test and refresh the log folder and see the log file info
