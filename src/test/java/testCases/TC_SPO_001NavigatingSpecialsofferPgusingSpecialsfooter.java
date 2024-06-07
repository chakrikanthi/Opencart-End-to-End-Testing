package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_001NavigatingSpecialsofferPgusingSpecialsfooter extends Baseclass{
	@Test
	public void submittingenquiryafterloggedin()  {
		
		Specialoffers SO= new Specialoffers(driver);
		SO.specialsfromfooter();
		String presentpage=driver.getTitle();
		if(presentpage.equals("Special Offers")) {
			System.out.println("Test got passed ...user is in Special Offers page right now");
		}
		
}
}