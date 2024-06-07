package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import testBase.Baseclass;

public class TC_AFL_016AboutuslinkinAffiliateprogramPg extends Baseclass{
	@Test
	public void AboutuslinkinAffiliateprogramPg() throws InterruptedException {

		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[50].style.border='5px red solid';");

		AA.NewAffiliatecontinuebtn();
		
		jsexe.executeScript("document.getElementsByTagName('b')[0].style.border='5px red solid';");
		Thread.sleep(1200);
		AA.aboutUsLINK();
		System.out.println("Second page:"+driver.getTitle());
		Thread.sleep(1200);
		AA.ClosingAboutUsdialogbox();
		Thread.sleep(1200);
	}
}