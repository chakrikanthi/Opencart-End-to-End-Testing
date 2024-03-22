package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Opencart_LoginData.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	
	//Dataprovider2
	
	@DataProvider(name="contactnumberData")
	public String [] [] getData1() throws IOException
	{
		String path=".\\testData\\contactnumberData.xlsx";
		ExcelUtility xlutil=new ExcelUtility(path);
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String contactnumberData[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				contactnumberData[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
		
		return contactnumberData;
		
	}
	
	@DataProvider(name="quantity")
	public String[][] getData2() throws IOException
	{
		String path=".\\testData\\quantity.xlsx";
		ExcelUtility xlutil=new ExcelUtility(path);
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
		String quantity[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++)
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				quantity[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
		return quantity;
	}
	
	//Dataprovider3
	
	@DataProvider (name="ReviewtabData")
	public String[][]getData3() throws IOException
	{
		String path=".\\testData\\ReviewtabData.xlsx";
		ExcelUtility xlutil=new ExcelUtility(path);
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String ReviewtabData[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				ReviewtabData[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
		
		return ReviewtabData;
		
	}
	@DataProvider (name="Reviewtxtdata")
	public String[][]getData4() throws IOException
	{
		String path=".\\testData\\Reviewtxtdata.xlsx";
		ExcelUtility xlutil=new ExcelUtility(path);
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String Reviewtxtdata[][]=new String[totalrows][totalcols];
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				Reviewtxtdata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
		
		return Reviewtxtdata;
		
	}
}
