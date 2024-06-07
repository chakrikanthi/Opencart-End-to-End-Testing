package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.Baseclass;

public class TC_CU_005Submittingcontactusformbyfillingallmandatoryfields extends Baseclass {
	@Test
	public void Submittingcontactusformbyfillingallmandatoryfields() throws InterruptedException {
		
		ContactUs contUs= new ContactUs(driver);
		contUs.phoneicon();
		contUs.yourNametextbox("Kanthi");
		contUs.eMailAddresstextbox("kanthi1@gmail.com");
		contUs.enquirytextbox("This is a test enquiry to submit and get succesfull message in this page");
		contUs.submitbtn();
		System.out.println("You are in page: "+driver.getTitle());
}
}