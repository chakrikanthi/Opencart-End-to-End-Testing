package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.PdctInstockOutstockPreorder;
import testBase.Baseclass;

public class TC_014_PdctInstockOutstockPreorderTest extends Baseclass
{
	@Test(groups= {"sanity","master"})
	
public void Verify_PdctInstockOutstockPreorder() {
	Homepage hm= new Homepage(driver);
	PdctInstockOutstockPreorder prdctstock= new PdctInstockOutstockPreorder(driver);
	prdctstock.searchbox("macbook");
	prdctstock.searchbtn();
	prdctstock.macBookpdct();
	String mcbookstatus=prdctstock.macInStockstatus();
	if(mcbookstatus.equals("Availability:In Stock"))
	{
		logger.info("test passed..");
		Assert.assertTrue(true);
	}
	else
	{
		logger.info("Test failed...");
		Assert.fail();
	}
	prdctstock.searchbox("iphone");
	prdctstock.searchbtn();
	prdctstock.iPhonepdct();
	String iphonestatus=prdctstock.iphoneOutOfStock();
	if(iphonestatus.equals("Availability:Out Of Stock"))
	{
		logger.info("test passed..");
		Assert.assertTrue(true);
	}
	else
	{
		logger.info("Test failed...");
		Assert.fail();
	}
	prdctstock.searchbox("samsung galaxy");
	prdctstock.searchbtn();
	prdctstock.samGalaxyTabpdct();
	String smsgalaxystatus=prdctstock.GalaxyPreOrder();
	if(smsgalaxystatus.equals("Availability:Pre-Order"))
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
