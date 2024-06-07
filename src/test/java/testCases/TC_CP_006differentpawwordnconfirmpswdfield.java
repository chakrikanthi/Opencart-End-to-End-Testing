package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_CP_006differentpawwordnconfirmpswdfield extends Baseclass{
	@Test
	public void Validatechangingthrpassword() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");	

		MyAccountPage macc=new MyAccountPage(driver);
		macc.changepasswordfromRIGHTcolumnside();
		macc.changepasswordfield1("kanthi123");
		macc.passwordConfirmfield2("kanthi1");
		macc.passwordconfirmcontinuebtn();
		String mismatchwarningmsg=macc.twopasswordConfirmationDoesNotmatch();
		System.out.println(mismatchwarningmsg);
		if (mismatchwarningmsg.equals("Password confirmation does not match password!")) {
			System.out.println("User entered two different values in the two different fields");
		}

}}
