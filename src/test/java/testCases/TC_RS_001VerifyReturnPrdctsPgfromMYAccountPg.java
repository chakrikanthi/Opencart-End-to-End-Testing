package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ReturnsPage;
import testBase.Baseclass;

public class TC_RS_001VerifyReturnPrdctsPgfromMYAccountPg extends Baseclass{
	@Test
	public void VerifyReturnPrdctsPgfromMYAccountPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("abc123@gmail.com"); 
		lp.setPassword("test@123"); 
		lp.clicklogin();  
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[59].style.border='5px green solid';");
		
		ReturnsPage RP= new ReturnsPage(driver);
		RP.ReturnRequestsfromLEFTcolumn();
		
		String Actualpage= driver.getTitle();
		String ExpectedPage= "Product Returns";
		
		Assert.assertEquals(Actualpage, ExpectedPage);
		System.out.println("We are in page:"+Actualpage);
		System.out.println("Message  in the curret page is:"+RP.youHaveNotMadeAnyreturnsMsg());
	}

}
