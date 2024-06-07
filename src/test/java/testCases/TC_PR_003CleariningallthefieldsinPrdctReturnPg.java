package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import pageObjects.ProductReturnsPage;
import testBase.Baseclass;

public class TC_PR_003CleariningallthefieldsinPrdctReturnPg extends Baseclass{
	@Test
	public void CleariningallthefieldsinPrdctReturnPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Orderhistory OH= new Orderhistory(driver);
		OH.orderHistoryfromRIGHTcolumnoption();
		OH.viewiconfororder8112();
		System.out.println("You are in page:"+driver.getTitle()+" Page");
		OH.ReturnIcon8112inOrderHisPg();
		System.out.println("You are in page:"+driver.getTitle()+" Page");
		
		ProductReturnsPage prdReturn=new ProductReturnsPage(driver);
		prdReturn.ProductretrunfirstName("");
		prdReturn.ProductretrunlastName("");
		prdReturn.ProductretruneMail("");
		prdReturn.Productretruntelephone("");
		prdReturn.ProductretrunorderID("");
		prdReturn.ProductretrunproductName();
		prdReturn.returningproductCode();
		prdReturn.Returnsubmitbtn();
		
		System.out.println(prdReturn.firstNameErrormsg());
		System.out.println(prdReturn.lastNameErrormsg());
		System.out.println(prdReturn.eMailErrormsg());
		System.out.println(prdReturn.telephoneErrormsg());
		System.out.println(prdReturn.orderIDErrormsg());
		
		
		
		
		
		
		
	}

}
