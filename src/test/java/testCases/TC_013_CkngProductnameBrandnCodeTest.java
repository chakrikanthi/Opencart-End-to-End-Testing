package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CkngProductnameBrandnCode;
import testBase.Baseclass;

public class TC_013_CkngProductnameBrandnCodeTest extends Baseclass{
	@Test(groups= {"sanity","master"})
	public void verify_CkngProductnameBrandnCodeTest()
	{
	
		CkngProductnameBrandnCode ckpdbrdcode= new CkngProductnameBrandnCode(driver);
		ckpdbrdcode.searchbox("Macbook");
		ckpdbrdcode.searchIcon();
		ckpdbrdcode.macBooksrcpg();
		String prouctname= ckpdbrdcode.macBookprdctname();
		if(prouctname.equals("MacBook"))
		{
			logger.info("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
		String Brand=ckpdbrdcode.brandapple();
		if(Brand.equals("Apple"))
		{
			logger.info("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
		String productcode=ckpdbrdcode.mcprdctCode16();
		if(productcode.equals("Product Code:Product 16"))
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
