package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_001Validatingcorrectphonenumberdisplayedincontactoption extends Baseclass {
	@Test
	public void Validatingcorrectphonenumberdisplayedincontactoption() throws InterruptedException  {
   
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.phoneiconisDisplayed();
		String contactnumfrommainpage=HMF.correctcontactnodisplay();
		System.out.println("Contact number from main page:"+contactnumfrommainpage);
		if(contactnumfrommainpage.equals("123456789")) {
			System.out.println("Correct number is diplayed in main page QAFOX.com");
		}
		
		HMF.phoneicon();
		
		String contctusno=HMF.contactnumfromContactuspage();
		System.out.println("Contact number from main page:"+contctusno);
	
		
}
}