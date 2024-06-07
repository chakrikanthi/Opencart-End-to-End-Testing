package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ReturnsPage;
import testBase.Baseclass;

public class TC_RS_003productsreturnsBeforeLogin extends Baseclass{
	@Test
	public void productsreturnsBeforeLogin() {
		Homepage hp= new Homepage(driver);
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('span')[2].style.border='5px red solid';");
		hp.clickMyAccount();
		hp.clickRegister();
		
        jsexe.executeScript("document.getElementsByTagName('a')[62].style.border='5px red solid';");
		
		ReturnsPage RP= new ReturnsPage(driver);
		RP.returnsfromRIGHTcolumn();
		
		System.out.println("You are in page:"+driver.getTitle());	
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("abc123@gmail.com"); 
		lp.setPassword("test@123"); 
		lp.clicklogin();  
		
	
		System.out.println("You are in page:"+driver.getTitle());		
		System.out.println("Message in the page is"+RP.youHaveNotMadeAnyreturnsMsg());
	}

}
