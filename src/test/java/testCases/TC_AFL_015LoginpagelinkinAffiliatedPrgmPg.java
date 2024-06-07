package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import testBase.Baseclass;

public class TC_AFL_015LoginpagelinkinAffiliatedPrgmPg extends Baseclass{
	@Test
	public void LoginpagelinkinAffiliatedPrgmPg() {
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		 jsexe.executeScript("document.getElementsByTagName('a')[50].style.border='5px red solid';");
		AA.NewAffiliatecontinuebtn();
		AA.loginPagelinkinaffiliatedprgpg();
		 jsexe.executeScript("document.getElementsByTagName('h1')[1].style.border='5px red solid';");
		String ACtualpagetitle=driver.getTitle();
		if(ACtualpagetitle.equals("Affiliate Program")) {
			System.out.println("Test got passed, we are in 'Affiliate Program' login page");
		}

}
}