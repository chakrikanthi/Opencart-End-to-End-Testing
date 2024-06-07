package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.Baseclass;

public class TC_CU_001ValidContactUspagefromHeaderOpt extends Baseclass {
	@Test
	public void ValidContactUspagefromHeaderOpt() throws InterruptedException {
		
		ContactUs ContUs= new ContactUs(driver);
		ContUs.phoneicon();
		String Contactuspage=driver.getTitle();
		if (Contactuspage.equals("Contact Us")) {
			System.out.println("Test got passed..You are in Contact Us Page after pressing ContactUs  footer option ");
		}

}
}