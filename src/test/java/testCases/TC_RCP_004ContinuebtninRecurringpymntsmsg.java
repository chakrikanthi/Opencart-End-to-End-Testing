package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Recurringpayment;
import testBase.Baseclass;

public class TC_RCP_004ContinuebtninRecurringpymntsmsg extends Baseclass{
	@Test
	public void ContinuebtninRecurringpymntsmsg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[75].style.border='5px red solid';");
		
		Recurringpayment RP=new Recurringpayment(driver);
		RP.recurringPaymentsRIGHTSide();
		System.out.println("You are in page:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		System.out.println("Recurring payments message is:"+RP.noRecurringPaymentsFoundmsg());
        RP.continuebtninRecurringpymntsPg();
      
}
}