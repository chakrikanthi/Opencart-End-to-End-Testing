package testCases;


import org.testng.annotations.Test;

import pageObjects.SearchboxandIcon;
import pageObjects.Validatingthereviewtab;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_019_ValidatingthereviewtabTest extends Baseclass {
   
	@Test(dataProvider="ReviewtabData",dataProviderClass=DataProviders.class)
   	public void verify_validatethereviewtab(String Name, String WriteReview) throws InterruptedException
	{
		SearchboxandIcon srcbox= new SearchboxandIcon(driver);
		srcbox.searchbox("Hp LP3065");
		srcbox.searchIcon();
		srcbox.hPLP3065();
		
		Validatingthereviewtab valreviewtab= new Validatingthereviewtab(driver);
		valreviewtab.Reviewlink();
		Thread.sleep(3000);
		valreviewtab.setName(Name);
		Thread.sleep(3000);
		valreviewtab.reviewtext(WriteReview);
		Thread.sleep(3000);
		valreviewtab.SetRating();
		Thread.sleep(3000);
		valreviewtab.continuebtn();
	}
	// this test is only for single review
	/*@Test
   	public void verify_validatethereviewtab()
	{
		SearchboxandIcon srcbox= new SearchboxandIcon(driver);
		srcbox.searchbox("HP LP3065");
		srcbox.searchIcon();
		srcbox.hPLP3065();
		
		Validatingthereviewtab valreviewtab= new Validatingthereviewtab(driver);
		valreviewtab.Reviewlink();
		valreviewtab.setName("kanthi");
		valreviewtab.reviewtext("This is a very good product");
		valreviewtab.SetRating();
		valreviewtab.continuebtn();
	}
	*/
}
