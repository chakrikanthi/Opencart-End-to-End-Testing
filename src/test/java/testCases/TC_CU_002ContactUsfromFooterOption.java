package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.Baseclass;

public class TC_CU_002ContactUsfromFooterOption extends Baseclass {
	@Test
	public void ContactUsfromFooterOption() throws InterruptedException {
		
		ContactUs ContUs= new ContactUs(driver);
		ContUs.contactUsfromFooter();
		String Contactuspage=driver.getTitle();
		if (Contactuspage.equals("Contact Us")) {
			System.out.println("Test got passed..You are in Contact Us Page");
		}

}
}