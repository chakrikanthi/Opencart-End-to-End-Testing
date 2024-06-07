package testCases;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_005ValidateAboutUsFooterlink extends Baseclass{
	@Test
	public void ValidateAboutUsFooterlink() throws InterruptedException  {
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page:"+driver.getTitle());
		boolean aboutusstatus=HMF.aboutusdisplay();
		if(aboutusstatus==true) {
			System.out.println("About Us Footer link is present in main page of QAFox.com ");
		}
		HMF.aboutUsfooter();
		String Aboutuspage=driver.getTitle();
		System.out.println("Second page is:"+Aboutuspage);
		if(Aboutuspage.equals("About Us")) {
			System.out.println("You are successfully in About US page");
		}
		System.out.println("Test got passed");
		
}
}