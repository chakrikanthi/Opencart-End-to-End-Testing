package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_012ValidateUserisnavigatingtoProductDisplayPagefromSpecialOfferspage  extends Baseclass {
	
	@Test
	public void ValidateUserisnavigatingtoProductDisplayPagefromSpecialOfferspage() throws InterruptedException  {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		System.out.println("Current page title is: "+driver.getTitle());
		
		sp.canonEOS5Dthumbnail();
		System.out.println("Canon EOS 5D thumbnail got clicked..");
		System.out.println("Now we are in page: "+driver.getTitle());
		System.out.println("We are in product page of:"+sp.canonEOS5Display());
	}

}
