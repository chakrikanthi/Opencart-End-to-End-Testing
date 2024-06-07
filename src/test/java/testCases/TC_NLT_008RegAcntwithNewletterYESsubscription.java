package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.NewletterSubscription;
import testBase.Baseclass;

public class TC_NLT_008RegAcntwithNewletterYESsubscription extends Baseclass {
	@Test
	public void RegAcntwithNewletterYESsubscription() throws InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		NewletterSubscription NS= new NewletterSubscription(driver); 
		NS.firstName("creddy");
		NS.lastName("ch");
		NS.eMailid("creddy@gmail.com");
		NS.telephone("456-890-0000");
		NS.password("kanthi123");
		NS.passwordConfirm("kanthi123");
		NS.YESnewsletter();
		NS.agree();
		NS.continuebtn();
		System.out.println(driver.getTitle());
		NS.newsletterfromRIGHTcolumn();
		if(NS.YESsubscriptionOPTselected()) {
			System.out.println("YES subscription option is selected..the same option that we selected during registration");
		}

}
}
/*output:Your Account Has Been Created!
YES subscription option is selected..the same option that we selected during registration*/
//if u want to run this test caseagin please provide new data