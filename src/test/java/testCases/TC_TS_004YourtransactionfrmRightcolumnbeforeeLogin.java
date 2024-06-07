package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.TransactionsPage;
import testBase.Baseclass;

public class TC_TS_004YourtransactionfrmRightcolumnbeforeeLogin  extends Baseclass{
	@Test
	public void YourtransactionfrmRightcolumnbeforeeLogin() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
				
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[63].style.border='5px green solid';");
		TransactionsPage TP= new TransactionsPage(driver);
		TP.transactionsfromRIGHTcolumn();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
	    
		String ActualPage=driver.getTitle();
		if(ActualPage.equals("Your Transactions")) {
			System.out.println("You are in Your Transactions page: Test got passed");
		}
		
	}



}
