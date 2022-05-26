package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Browser.PoJo;

public class Utility 
{
	
	public String data(int x, int y) throws EncryptedDocumentException, IOException
	{
	String path = "E:\\Speed\\Excel\\Test.xlsx";
	FileInputStream file = new FileInputStream(path);
	Sheet d = WorkbookFactory.create(file).getSheet("Sheet1");
	String data = d.getRow(x).getCell(y).getStringCellValue();
	return data;	
}
	public void ScreenShot(WebDriver driver) throws IOException
	{
		int i=1;
		TakesScreenshot t = (TakesScreenshot)driver;
		Date time = new Date();
		 String time1= time.toString().replace(" ", "_").replace(":", "_");
		 File src = t.getScreenshotAs(OutputType.FILE);
		 File dest = new File ("E:\\Speed\\snaps\\"+time1+"i");
		 FileHandler.copy(src, dest);
		 i=i+1;
	}
}
