package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Samsunggalxytab;
import pageObjects.SearchboxandIcon;
import pageObjects.Validatingthereviewtab;
import testBase.Baseclass;

public class TC_22_validateRevmandatoryfieldswarnmsg extends Baseclass {
	@Test
	public void verify_mandatoryfieldwarnmsg()
	{
		SearchboxandIcon srcbox= new SearchboxandIcon(driver);
		srcbox.searchbox("samsung galaxy");
		srcbox.searchIcon();
		srcbox.samsungGalaxyTab10();
		Validatingthereviewtab valrevtab= new Validatingthereviewtab(driver);
		valrevtab.Reviewlink();
		valrevtab.continuebtn();
		String mandatorywrnmsg= valrevtab.mandatoryfieldsnotfilled();
		if(mandatorywrnmsg.equals("Warning: Please select a review rating!"))
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
