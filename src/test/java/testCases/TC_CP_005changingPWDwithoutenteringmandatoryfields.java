package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_CP_005changingPWDwithoutenteringmandatoryfields extends Baseclass{
	@Test
	public void changingPWDwithoutenteringmandatoryfields() {
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
		macc.changepasswordfield1("");
		macc.passwordConfirmfield2("");
		macc.passwordconfirmcontinuebtn();
		String warningmsg=macc.passwordMandatoryfieldwarningmsg();
		System.out.println("Warning message as user didn't enter mandatory field values:"+warningmsg);
	}

}
