package testCases;


import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Minimumquantityset;
import pageObjects.SearchboxandIcon;
import testBase.Baseclass;

public class TC_016_MinimumquantitysetTest extends Baseclass{
  @Test(groups={"regression","master"})
  
	public void Verify_MinimumquantitysetTest() throws InterruptedException, IOException, AWTException
	{
		SearchboxandIcon schbxic= new SearchboxandIcon(driver);
		schbxic.searchbox("Apple Cinema 30");
		schbxic.searchIcon();
		schbxic.appleCinema30();
		Minimumquantityset mnmqty= new Minimumquantityset(driver);
		Thread.sleep(2000);
		mnmqty.smallradiobutton();
		Thread.sleep(2000);
		//mnmqty.checkbox3option();
		mnmqty.checkbox4option();
		Thread.sleep(2000);
		mnmqty.textbox("Sample text for testing");
		Thread.sleep(2000);
		//mnmqty.Bluecoloroption();
		mnmqty.Redcoloroption();
		Thread.sleep(2000);
		mnmqty.textarea("this is a sample text for running the test through testng");
		mnmqty.uploadFile();
		Thread.sleep(9000);
		mnmqty.dateoption();
		logger.info("Date 23 is selected");
		Thread.sleep(5000);
		mnmqty.timeoption();
		logger.info("Time 22:25 is selected");
		Thread.sleep(7000);
		mnmqty.dateandTimeoption();
		Thread.sleep(6000);
		mnmqty.qtybox("1");//This test will pass even if we change to quantity  25 because as this product is out of stock it was displaying danger alert message just like "product has minimum qnty of 2"..this xpath is same for both alert messages
		//mnmqty.qtybox("25");
		Thread.sleep(4000);
		mnmqty.addToCartbutton();
		Thread.sleep(3000);
		String minumqtyset2= mnmqty.PrdctHasMinQuatxtunderdisplaypage();
		
		 if(minumqtyset2.equals("This product has a minimum quantity of 2"))//this message is displayed under add to cart option
			{
				logger.info("test passed..");
				Assert.assertTrue(true);
				
			}
			else
			{
				logger.info("Test failed...");
				Assert.fail();
			}
		
		 Thread.sleep(2000);
		 
		 mnmqty.shoppingCart();
		 Thread.sleep(7000);
		 mnmqty.minOrderAmntApple2inshopcrtpage();
		 logger.info("Test is completed..warning message checked");
		 //String warningmsg=mnmqty.minOrderAmntApple2inshopcrtpage();
		 //if (warningmsg.equals(" Minimum order amount for Apple Cinema 30 is 2!"))
		/* boolean message=mnmqty.minOrderAmntApple2inshopcrtpage();
		 if )
		 {
			 logger.info("test passed..");
				Assert.assertTrue(true);
		 }
		 else
		 {
				logger.info("Test failed...");
				Assert.fail();
			}
	*/
			 
	}
  
}
