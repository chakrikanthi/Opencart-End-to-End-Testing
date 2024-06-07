package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_CP_002PasswordfromRightcolumn extends Baseclass{
	@Test
	public void PasswordfromRightcolumn() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount in Homepage..");
		hp.clicklogin(); //Login link under MyAccount...this is from home page
		logger.info("Clicked on Login Button under MyAccount..");
		
		Loginpage lp= new Loginpage(driver);
		logger.info("Entering valid email id..");
		lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
		logger.info("Entering valid password...");
		lp.setPassword(p.getProperty("password")); // same as above line
		lp.clicklogin();  //Login link button in login page...this is from login page
		logger.info("clicked on login button...");	
		
		MyAccountPage macc=new MyAccountPage(driver);
		macc.clickmyAccount();
		macc.myAccountafterloggedin();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('list-group-item')[2].style.border='5px blue solid';");
		macc.changepasswordfromRIGHTcolumnside();
		System.out.println("We are in "+driver.getTitle());
	}

}
