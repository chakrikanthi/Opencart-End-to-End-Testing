package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Recurringpayment;
import testBase.Baseclass;

public class TC_RCP_001recurringPaymentsfromMyAcntPG extends Baseclass{
	@Test
	public void recurringPaymentsfromMyAcntPG() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[65].style.border='5px green solid';");
		
		Recurringpayment RP=new Recurringpayment(driver);
		RP.recurringPaymentsfromLEFThandside();
		System.out.println(driver.getTitle());
		
}}
