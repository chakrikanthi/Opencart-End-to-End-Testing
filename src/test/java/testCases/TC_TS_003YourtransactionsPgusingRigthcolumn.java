package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.TransactionsPage;
import testBase.Baseclass;

public class TC_TS_003YourtransactionsPgusingRigthcolumn  extends Baseclass {
	@Test
	public void YourtransactionsPgusingRigthcolumn() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[78].style.border='5px red solid';");
		TransactionsPage TP= new TransactionsPage(driver);
		TP.transactionsfromRIGHTcolumn();
		String ActualPage=driver.getTitle();
		if(ActualPage.equals("Your Transactions")) {
			System.out.println("You are in Your Transactions page: Test got passed");
		}
		
	}


}
