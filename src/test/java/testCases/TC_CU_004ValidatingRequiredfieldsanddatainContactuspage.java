package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUs;
import testBase.Baseclass;

public class TC_CU_004ValidatingRequiredfieldsanddatainContactuspage   extends Baseclass {
	@Test
	public void ValidatingRequiredfieldsanddatainContactuspage() throws InterruptedException {
		
		ContactUs contUs= new ContactUs(driver);
		contUs.phoneicon();
		//header of the page
		boolean Locatheaderstatus=contUs.ourLocationheader();
		if(Locatheaderstatus==true) {
			System.out.println("Our Location is displayed successfully in the page");
		}
		else {
			System.out.println("Test got failed...you are not in contact us page");
		}
		System.out.println("Heading of the page is:"+contUs.ourLocationheadertext());
		
		
		// Address in the contact us page
		boolean Addressstatus=contUs.addressisdisplayed();
		if(Addressstatus==true) {
			System.out.println("Address is displayed successfully in the page");
		}
		else {
			System.out.println("Test got failed...you are not in contact us page");
		}
		System.out.println("Address of the page is:"+contUs.addresstext());
		
		// Telephone display in contact us page
		boolean Telephonestatus=contUs.telephoneisdisplayed();
		if(Telephonestatus==true) {
			System.out.println("Telephone is displayed successfully in the page");
		}
		else {
			System.out.println("Test got failed...you are not in contact us page");
		}
		System.out.println("Telephone  of the page is:"+contUs.telephonetext());
		
		//your name
		
		boolean yournamestatus=contUs.yourNameisdisplayed();
		if(yournamestatus==true) {
			System.out.println("Your name is displayed successfully in the page");
		}
		else {
			System.out.println("Test got failed...you are not in contact us page");
		}
		
		
		//Email Address
		boolean Emailaddressstatus=contUs.eMailAddressisdisplayed();
		if(Emailaddressstatus==true) {
			System.out.println("Email field is displayed successfully in the page");
		}
		else {
			System.out.println("Test got failed...you are not in contact us page");
		}

		
		boolean Enquirystatus=contUs.enquiryisdisplay();
		if(Enquirystatus==true) {
			System.out.println("Enquiry feild is displayed successfully in the page");
		}
		else {
			System.out.println("Test got failed...you are not in contact us page");
		}
}
}