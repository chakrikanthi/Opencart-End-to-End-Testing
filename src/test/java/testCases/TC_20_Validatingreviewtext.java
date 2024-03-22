package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Basepage;
import pageObjects.SearchboxandIcon;
import pageObjects.Validatingthereviewtab;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_20_Validatingreviewtext extends Baseclass{
	
	@Test(dataProvider="Reviewtxtdata",dataProviderClass=DataProviders.class)
	public void verify_validatereviewtext(String Name, String WriteReview) throws InterruptedException
	{
		SearchboxandIcon srchbox=new SearchboxandIcon(driver);
		srchbox.searchbox("HP LP3065");
		srchbox.searchIcon();
		srchbox.hPLP3065();
		
		Validatingthereviewtab valrev= new Validatingthereviewtab(driver);
		valrev.Reviewlink();
		valrev.setName(Name);
		valrev.reviewtext(WriteReview);
		valrev.SetRating();
		valrev.continuebtn();
		Thread.sleep(3500);
		String wrnmsg= valrev.warningmsg();
		if(wrnmsg.equals("Warning: Review Text must be between 25 and 1000 characters!"))//here we are intentionally failling the tc for taking screen shot ..actul value is "Your Account Has Been Created!"
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
