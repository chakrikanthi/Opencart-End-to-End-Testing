package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_008ValidateTermsnConditionsFooterlink extends Baseclass {
	@Test
	public void ValidateTermsnConditionsFooterlink() throws InterruptedException  {
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page:"+driver.getTitle());
		boolean Termsnconditionsfooterstatus=HMF.termsnConditionsdisplayed();
		if(Termsnconditionsfooterstatus==true) {
			System.out.println("Terms & Conditions Footer link is present in main page of QAFox.com ");
		}
		HMF.termsnConditions();
		String TermsnConditionsinfopage=driver.getTitle();
		System.out.println("Second page is:"+TermsnConditionsinfopage);
		if(TermsnConditionsinfopage.equals("Terms & Conditions")) {
			System.out.println("You are successfully in Terms & Conditions page");
		}
		System.out.println("Test got passed");
		
}

}
