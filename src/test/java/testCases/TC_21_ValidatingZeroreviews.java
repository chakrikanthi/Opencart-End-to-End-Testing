package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Samsunggalxytab;
import pageObjects.SearchboxandIcon;
import testBase.Baseclass;

public class TC_21_ValidatingZeroreviews extends Baseclass{
	@Test
	public void Verify_validatezeroreviews() throws InterruptedException
	{
		SearchboxandIcon srcbox= new SearchboxandIcon(driver);
		srcbox.searchbox("Samsung galaxy");
		srcbox.searchIcon();
		srcbox.samsungGalaxyTab10();
		Samsunggalxytab smstab= new Samsunggalxytab(driver);
		Thread.sleep(4500);
		smstab.clickzeroreviewtab();
		Thread.sleep(2500);
		
		String warningmsg=smstab.warningmsgdisplayed();
		if(warningmsg.equals("There are no reviews for this product."))//here we are intentionally failling the tc for taking screen shot ..actul value is "Your Account Has Been Created!"
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
