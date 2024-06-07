package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import testBase.Baseclass;

public class TC_AFL_014ValidatingbyprovidpwdnConfrmpwddifferently extends Baseclass{
	@Test
	public void ValidatingbyprovidpwdnConfrmpwddifferently() {
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		System.out.println("Second page:"+driver.getTitle());
		AA.NewAffiliatecontinuebtn();
		AA.firstName("RANI");
		AA.lastName("SAI");
		AA.eMail("kanthi114567@gmail.com");
		AA.telephone("404-404-4000");
		AA.company("ghgjhjh");
		AA.webSite("www.google.com");
		AA.taxID("1234567");
		AA.chequePayeeName("RANI");
		AA.password("kanthi123");
		AA.passwordConfirm("kanth23");
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
		boolean warningstatus=AA.passwordConfirmationDoesNotmatchdisplay();
		if(warningstatus==true) {
			System.out.println("You have entered two different passwords in password field and confirm password field");
		}
		System.err.println("Error message we got is:"+AA.passwordConfirmationDoesNotmatchtxt());

}

}
