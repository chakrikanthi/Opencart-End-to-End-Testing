package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import testBase.Baseclass;

public class TC_AFL_012ValidatingAffiliatedprgwithinvalidemail extends Baseclass{
	@Test
	public void ValidatingAffiliatedprgwithinvalidemail() {
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		System.out.println("Second page:"+driver.getTitle());
		AA.NewAffiliatecontinuebtn();
		AA.firstName("RANI");
		AA.lastName("SAI");
		AA.eMail("kanthi11@gmail.com");
		AA.telephone("404-404-4000");
		AA.company("ghgjhjh");
		AA.webSite("www.google.com");
		AA.taxID("1234567");
		AA.chequePayeeName("RANI");
		AA.password("kanthi123");
		AA.passwordConfirm("kanthi123");
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
		boolean warningstatus=AA.warningEMailAddressexiststatus();
		if(warningstatus==true) {
			System.out.println("You have entered already registered email");
		}
		System.out.println(AA.warningEMailAddressexist());

}
}

/*output: First page:Your Store
Second page:Affiliate Program
You have entered already registered email
Warning: E-Mail Address is already registered!
*/