package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.Baseclass;

public class TC_CU_008EnteringInvalidemaininContactuspage  extends Baseclass{
	@Test
	public void EnteringInvalidemaininContactuspage() throws InterruptedException {

		ContactUs contUs= new ContactUs(driver);
		contUs.phoneicon();
		contUs.yourNametextbox("kanthi");
		contUs.eMailAddresstextbox("kanthi@");
		contUs.enquirytextbox("This is a test enquiry to test the contact us page by entering invalid email id");
		contUs.submitbtn();
		boolean Emailwarningmsg=contUs.eMailAddressisdisplayed();
		if(Emailwarningmsg==true) {
			System.out.println("Email warning message is displayed as :E-Mail Address does not appear to be valid!");
		}
		else {
			System.out.println("Test got failed ..contact us page got submitted with out entering mandatory feilds");
		}
		System.out.println("You entered invalid email id so enquiry can't be submitted");
	}
}