package testCases;

import org.testng.annotations.Test;

import pageObjects.Addingprdctthrucategoryorsub;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_32_WL_AddingprdcttoWLusingCategorSub extends Baseclass{
	
	@Test
	public void AddingprdcttoWL() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		Addingprdctthrucategoryorsub adprct= new Addingprdctthrucategoryorsub(driver);
		adprct.desktopsoption();
		adprct.showalldesktops();
		
		adprct.imac();
		Thread.sleep(3000);
		adprct.adddingimactoWL();
		adprct.clicksuccessmsg();
	}

}
