package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.NewletterSubscription;
import testBase.Baseclass;

public class TC_NLT_009RegisterNewAcntNOTbyselectingNewssubscription  extends Baseclass{
	@Test
	public void RegisterNewAcntNOTbyselectingNewssubscription() throws InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		NewletterSubscription NS= new NewletterSubscription(driver); 
		NS.firstName("kkreddy");
		NS.lastName("ch");
		NS.eMailid("kkreddy@gmail.com");
		NS.telephone("456-890-0001");
		NS.password("kanthi123");
		NS.passwordConfirm("kanthi123");
		NS.agree();
		NS.continuebtn();
		System.out.println(driver.getTitle());
		NS.newsletterfromRIGHTcolumn();
		if(NS.NOsubscriptionOPTselected()) {
			System.out.println("NO subscription option is selected..the same option that we selected during registration");
		}

		System.out.println("Current page title is :"+driver.getTitle());
		System.out.println("Current page URL is :"+driver.getCurrentUrl());
}
}
/*OUTPUT:Your Account Has Been Created!
NO subscription option is selected..the same option that we selected during registration
Current page title is :Newsletter Subscription
Current page URL is :https://tutorialsninja.com/demo/index.php?route=account/newsletter */
//if u want to run this test caseagin please provide new data