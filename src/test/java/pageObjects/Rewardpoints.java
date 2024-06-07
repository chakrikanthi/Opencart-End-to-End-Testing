package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rewardpoints extends Basepage{

	public Rewardpoints(WebDriver driver) {
		super(driver);
		
	}

	//your reward points from Left column
	
	@FindBy(xpath="//a[normalize-space()='Your Reward Points']") 
	WebElement RewardPointsfromLEFTcolm;
	
	public void RewardPointsfromLEFTcolm() {
		RewardPointsfromLEFTcolm.click();
	}
	
	// reward points from RIGHT Column
	@FindBy(xpath="//a[normalize-space()='Reward Points']") 
	WebElement rewardPointsfromRIGHTcolm;
	
	public void rewardPointsfromRIGHTcolm() {
		rewardPointsfromRIGHTcolm.click();
	}
	
	//continue btn in Your rewards page
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	WebElement continuebtninRewardspg;
	
	public void continuebtninRewardspg() {
		continuebtninRewardspg.click();
	}
	
	//Empty rewards msg 
	
	@FindBy(xpath="//div[@id='account-reward']//p[1]") 
	WebElement totalrewardsmsg;
	public String totalrewardsmsg() {
		return totalrewardsmsg.getText();
	}
	//REWARDS Table header
	@FindBy(xpath="//div[@id='content']//div//table//thead//tr") 
	WebElement Rewardstableheader;
	public String Rewardstableheader() {
		return Rewardstableheader.getText();
	}
	
	//reward points message in Rewards table
	@FindBy(xpath="//td[normalize-space()='You do not have any reward points!']")
	WebElement rewardsmessageinTABLE;
	
	public String rewardsmessageinTABLE() {
		return rewardsmessageinTABLE.getText();
	}
}
