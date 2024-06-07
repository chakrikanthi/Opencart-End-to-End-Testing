package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_007ValidatePrivacyPolicyFooterlink   extends Baseclass {
	@Test
	public void ValidateDeliveryInformationFooterlink() throws InterruptedException  {
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page:"+driver.getTitle());
		boolean Privacypolicystatus=HMF.privacyPolicydisplayed();
		if(Privacypolicystatus==true) {
			System.out.println("Privacypolicystatus Footer link is present in main page of QAFox.com ");
		}
		HMF.privacyPolicyclicking();
		String PrivacyPolicyinfopage=driver.getTitle();
		System.out.println("Second page is:"+PrivacyPolicyinfopage);
		if(PrivacyPolicyinfopage.equals("Privacy Policy")) {
			System.out.println("You are successfully in Privacy Policy page");
		}
		System.out.println("Test got passed");
		
}

}
