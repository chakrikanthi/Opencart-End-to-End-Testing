package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ReturnsPage;
import testBase.Baseclass;

public class TC_RS_002ReturnsfromRigthtcolumn extends Baseclass {
	@Test
	public void ReturnsfromRigthtcolumn() {
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
		System.out.println(driver.getTitle());		
		System.out.println(RP.youHaveNotMadeAnyreturnsMsg());
	}

	
}
