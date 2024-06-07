package testCases;

import org.testng.annotations.Test;
import pageObjects.ProductThumbnail;
import testBase.Baseclass;

public class TC_012_ProductThumbnailtest extends Baseclass{
	@Test(groups={"regression","master"})
	public void Verify_ProctThumbnailtest() throws InterruptedException {
		
		ProductThumbnail pdctnl= new ProductThumbnail(driver);
		pdctnl.searchbox("Macbook air");
		pdctnl.searchbtn();
		pdctnl.macBksearchresult();
		pdctnl.macthumbnailimg();
		Thread.sleep(1500);
		pdctnl.RightArrowKey();
		Thread.sleep(1500);
		pdctnl.LeftArrowKey();
		Thread.sleep(1500);
		pdctnl.Macclose1Of4();
		Thread.sleep(1500);
		pdctnl.smallThumbnail2();
		Thread.sleep(1500);
		pdctnl.LeftArrowKey();
		Thread.sleep(1500);
		pdctnl.RightArrowKey();
		Thread.sleep(1500);
		pdctnl.closeMacBkAir2Of4();
		pdctnl.smallThumbnail3();
		Thread.sleep(1500);
		pdctnl.LeftArrowKey();
		Thread.sleep(1500);
		pdctnl.RightArrowKey();
		Thread.sleep(1500);
		pdctnl.closeMacBkAir3Of4();
		pdctnl.smallThumbnail4();
		Thread.sleep(1500);
		pdctnl.LeftArrowKey();
		Thread.sleep(1500);
		pdctnl.RightArrowKey();
		Thread.sleep(1500);
		pdctnl.closeMacBkAir4Of4();
		
		
	}

}
