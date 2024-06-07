package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ReturnsPage;
import testBase.Baseclass;

public class TC_RS_005ContinueBtnfromProductsReturnPg extends Baseclass{
	@Test
	public void ContinueBtnfromProductsReturnPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("abc123@gmail.com"); 
		lp.setPassword("test@123"); 
		lp.clicklogin();  
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[73].style.border='5px red solid';");
		ReturnsPage RP= new ReturnsPage(driver);
		RP.returnsfromRIGHTcolumn();
		System.out.println("You are in page:"+driver.getTitle());		
		String ActualMessage=RP.youHaveNotMadeAnyreturnsMsg();
		if(ActualMessage.equals("You have not made any previous returns!")) {
			System.out.println("Actual value and message got matched and the test got passed");
		}
		jsexe.executeScript("document.getElementsByTagName('a')[53].style.border='5px red solid';");
		RP.continuebtninProductreturnsPg();
		System.out.println("You are in page:"+driver.getTitle());	
	}

}
