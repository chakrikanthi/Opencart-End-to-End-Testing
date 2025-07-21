package testBase;

import org.openqa.selenium.WebDriver;




import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;//Log4J
import org.apache.logging.log4j.Logger;//log4j

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;



public class Baseclass {

	//static  public WebDriver driver;   //from step 8 we changed this webdrive as a static variable because of extent report
	   public WebDriver driver; // if we want to run parallel testing successfully we have to keep Webdriver as public only
	   public Logger logger;
	   public Properties p;
	
	 //Base class contains all the reusable methods

	@BeforeClass(groups= {"sanity","regression","master"})
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		
		//at the time of execution the first method that is going to execute is setup method
		
		//Loading properties file
		FileReader file= new FileReader(".//src/test/resources/config.properties");
		p= new Properties();
		p.load(file);
		
		//Loading Log4j2 file
		logger=LogManager.getLogger(this.getClass());//Log4j
		
		/*
		//if we want to run the testcases using standalone set up we have to uncomment this if else part and comment the switch case part
	
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	 	{	
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		//os
		if(os.equalsIgnoreCase("windows"))
		{
			capabilities.setPlatform(Platform.WIN11);
		}
		else if(os.equalsIgnoreCase("mac"))
		{
			capabilities.setPlatform(Platform.MAC);
		}
		else
		{
			System.out.println("No matching os..");
			return;
		}
		
		//browser
		switch(br.toLowerCase())
		{
		case "chrome" : capabilities.setBrowserName("chrome"); break;
		case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
		default: System.out.println("No matching browser.."); return;
		}
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		
	    }
	else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
	{
						
		//Launching browser based on condition for local environment
		switch(br.toLowerCase()) //here we are converting the browser what ever we entered into lower case
		{
		case "chrome":driver= new ChromeDriver();break;//if browser is chrome then it launch chrome driver and then break
		case "edge":driver= new EdgeDriver();break;//if browser is edge then it launch edge driver and then break
		default: System.out.println("No matching browser");// if it doesnt match with any browser then it will return means exit from the test
		return;   //it will exit from the test
		}
		
	}*/
		
		//launching browser based on condition-- with out using standalone or remote setup
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		default: System.out.println("No matching browser..");
					return;
		}
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	
	}
	
	@AfterClass(groups= {"sanity","regression","master"})
	public void teardown()
	{
		driver.quit();
	}
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}

	public String randomNumber()
	{
		String generatedString =RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		Files.move(sourceFile, targetFile);
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
}
