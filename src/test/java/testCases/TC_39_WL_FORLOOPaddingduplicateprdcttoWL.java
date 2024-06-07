package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.imac;
import testBase.Baseclass;

public class TC_39_WL_FORLOOPaddingduplicateprdcttoWL extends Baseclass{
	@Test
	public void addingsameprdctmultipletimestoWL() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		imac imac= new imac(driver);
		imac.searchbox("imac");
		imac.searchIcon();
		imac.imacitem();
	for(int i=1;  i<4; i++ ) 
	{
			
		imac.addimactoWL();
		System.out.println("added prdct to WL");
		Thread.sleep(2000);
	}
	
	imac.successWLmsg();
	
	}
}
