package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_006ValidateDeliveryInformationFooterlink  extends Baseclass {

	@Test
	public void ValidateDeliveryInformationFooterlink() throws InterruptedException  {
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page:"+driver.getTitle());
		boolean Deliveryinfostatus=HMF.deliveryInformationfooterdisplayed();
		if(Deliveryinfostatus==true) {
			System.out.println("Delivery information Footer link is present in main page of QAFox.com ");
		}
		HMF.deliveryInformationfooter();
		String Deliveryinfopage=driver.getTitle();
		System.out.println("Second page is:"+Deliveryinfopage);
		if(Deliveryinfopage.equals("Delivery Information")) {
			System.out.println("You are successfully in Delivery Information page");
		}
		System.out.println("Test got passed");
		
}
}
