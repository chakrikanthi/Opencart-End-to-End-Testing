package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_018vALIDATEProductDisplayPagefromBrandpage  extends Baseclass{
	@Test
	public void vALIDATEProductDisplayPagefromBrandpage() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.brandsfooterlinkclick();
		HMF.applebrandclick();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('img-responsive')[4].style.border='5px Blue solid';");
		System.out.println("ipod Nano thumbnail got highlighted in Blue color");
		HMF.iPodNanoTHUMBNAIL();
		System.out.println("Clicked on ipod Nano thumbnail");
		System.out.println("Currently you are in product display page of:"+driver.getTitle());
		System.out.println("Current page URL is:"+driver.getCurrentUrl());

}
}