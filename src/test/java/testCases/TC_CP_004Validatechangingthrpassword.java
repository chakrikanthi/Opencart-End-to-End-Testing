package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_CP_004Validatechangingthrpassword extends Baseclass{
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
		macc.passwordConfirmfield2("kanthi123");
		macc.passwordconfirmcontinuebtn();
		String successpwdmsg=macc.successPasswordchangemsg();
		System.out.println(successpwdmsg);
		macc.clickmyAccount();
		macc.clicklogout();
		
		macc.clickmyAccount();
		macc.clicklogin();
		Loginpage lp1= new Loginpage(driver);
		lp1.setEmail("kanthi1@gmail.com");
		lp1.setPassword("kanthi12"); 
		lp1.clicklogin();  
		
		System.out.println(driver.getTitle());
		String wrongpasswordmsg=macc.passwordwarningerrmsg();
		
		System.out.println(wrongpasswordmsg);
		
		if (wrongpasswordmsg.equals("Warning: No match for E-Mail Address and/or Password.")) {
			System.out.println("invalid password was entered");
		}
		Loginpage lp2= new Loginpage(driver);
		lp2.setEmail("kanthi1@gmail.com");
		lp2.setPassword("kanthi123"); 
		lp2.clicklogin();  
		System.out.println("Successfully logged into the account");
	}

}
