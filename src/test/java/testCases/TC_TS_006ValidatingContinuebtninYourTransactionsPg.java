package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.TransactionsPage;
import testBase.Baseclass;

public class TC_TS_006ValidatingContinuebtninYourTransactionsPg extends Baseclass {
	
	@Test
	public void YourtransactionfrmRightcolumnbeforeeLogin() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
	    
				
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[78].style.border='5px green solid';");
		TransactionsPage TP= new TransactionsPage(driver);
		TP.transactionsfromRIGHTcolumn();
		
		    
		String ActualPage=driver.getTitle();
		if(ActualPage.equals("Your Transactions")) {
			System.out.println("You are in Your Transactions page: Test got passed");
		}
		
		
		String zerotransactionsmsg=TP.yourCurrentBalanceIs0msg();
		String Actualtransactionspagemsg="Your current balance is: $0.00.";
		Assert.assertEquals(zerotransactionsmsg, Actualtransactionspagemsg);
		
		System.out.println("Transactions table header sections are:"+TP.Transactionstableheader());
		
		TP.continuebtnisenabled();
		System.out.println("Continue button is enabled and able to click on it");
		TP.continuebtninYourTransactionsPg();
		System.out.println("Now we are in page:"+driver.getTitle());
		System.out.println("Current URL is:"+driver.getCurrentUrl());
	}
     


}
