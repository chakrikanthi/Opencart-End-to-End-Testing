package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;


import pageObjects.PrdctwithnwithoutTaxnRewardpoints;
import pageObjects.SearchboxandIcon;
import testBase.Baseclass;

public class TC_015_PrdctwithnwithoutTaxnRewardpointsTEST extends Baseclass {
	@Test(groups={"regression","master"})
	public void verify_PrdctwithnwithoutTaxnRewardpoints()
	{
	
		SearchboxandIcon scbic= new SearchboxandIcon(driver);
		scbic.searchbox("HP LP");
		scbic.searchIcon();
		scbic.hPLP3065();
		PrdctwithnwithoutTaxnRewardpoints prwtnrewds= new PrdctwithnwithoutTaxnRewardpoints(driver);
	    String pctwtax= prwtnrewds.Pricewithtax122();
	    if(pctwtax.equals("$122.00"))
		{
			logger.info("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
	    
		String pdtextax= prwtnrewds.PriceexTax100();
		if (pdtextax.equals("Ex Tax:$100.00"))
		{	
			logger.info("test passed..");
		Assert.assertTrue(true);
	   }
	   else
	   {
		logger.info("Test failed...");
		Assert.fail();
	   }
		String pricerewards= prwtnrewds.priceInRewardPoints400();
		if (pricerewards.equals("Price in reward points:400"))
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
