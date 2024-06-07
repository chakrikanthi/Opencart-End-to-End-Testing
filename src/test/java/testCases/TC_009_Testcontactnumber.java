package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;


import pageObjects.contactnumber;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_009_Testcontactnumber extends Baseclass{
	@Test(dataProvider="contactnumberData",dataProviderClass=DataProviders.class)
	public void Verify_Testcontactnumber (String Name, String email, String Text) throws InterruptedException {
		contactnumber ctnum= new contactnumber(driver);
		ctnum.testcallcontact();
		
		
		ctnum.setName(Name);
		Thread.sleep(3000);
		ctnum.setEMail(email);		
		Thread.sleep(1000);
		ctnum.enquiryTEXT(Text);
		ctnum.submit();
		Thread.sleep(1000);
		String confmsg= ctnum.getcontactUsmessage();
		if(confmsg.equals("Contact Us"))
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
	
	

}
