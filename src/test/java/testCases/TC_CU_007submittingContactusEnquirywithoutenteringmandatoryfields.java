package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.Baseclass;

public class TC_CU_007submittingContactusEnquirywithoutenteringmandatoryfields extends Baseclass {
	@Test
	public void submittingContactusEnquirywithoutenteringmandatoryfields() throws InterruptedException {

		ContactUs contUs= new ContactUs(driver);
		contUs.phoneicon();
		contUs.submitbtn();
		System.out.println("You didn't enter mandatory fields ..so the following warning messages are displayed");
		
		boolean Younamewarningmsg=contUs.YournameWarningmsgisdisplayed();
		if(Younamewarningmsg==true) {
			System.err.println("Name warning message is displayed as :Name must be between 3 and 32 characters!");
		}
		else {
			System.out.println("Test got failed ..contact us page got submitted with out entering mandatory feilds");
		}


		boolean Emailwarningmsg=contUs.eMailAddressisdisplayed();
		if(Emailwarningmsg==true) {
			System.err.println("Email warning message is displayed as :E-Mail Address does not appear to be valid!");
		}
		else {
			System.out.println("Test got failed ..contact us page got submitted with out entering mandatory feilds");
		}


		boolean Enquirywarningmsg=contUs.enquirywarningmsgisdisplayed();
		if(Enquirywarningmsg==true) {
			System.err.println("Enquiry warning message is displayed as :Enquiry must be between 10 and 3000 characters!");
		}
		else {
			System.out.println("Test got failed ..contact us page got submitted with out entering mandatory feilds");
		}

		System.out.println("Test got passed...Contact Us page not submitted without entering mandatory fields in the page");
	}
}