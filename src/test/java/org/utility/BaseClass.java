package org.utility;
import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass 
{
	public static WebDriver driver;
	public static Actions action;
	public static Robot robot;
	public static Select select;
	public static TakesScreenshot tss;
	public static JavascriptExecutor js;
	public static Alert alert;
	public static WebDriverWait webdriverwait;
	public static File file;
	public static FileInputStream fileinput;
	public static Workbook workbook;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
	public static Date date;
	
	
	public static void DriverInstall() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void DriverInstallf() 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	public static void DriverInstallie() 
	{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	public static void GetUrl(String urlpath)
	{
		driver.get(urlpath);
	}
	public static void WindoMax()
	{
		driver.manage().window().maximize();
	}
	
	public static String PrintTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public static String PrintCurrentUrl()
	{
		String currtitle=driver.getCurrentUrl();
		return currtitle;
	}
	public static void Cls()
	{
		driver.close();
	}
	public static void Qut()
	{
		driver.quit();
		
	}
	public static void Findelesendkeyusername(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	public static void Findelesendkeyfirstname(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	public static void Findelesendkeylastname(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	public static void Findelesendkeyaddress(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	public static void Findelesendkeycredit(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	
	public static void Findelesendkeycreditcvvno(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	
	public static void Findelesendkeymobil(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	public static void Findelesendkeyemil(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	public static void Findelesendkeypasswrd(WebElement webele,String val)
	{
		
		webele.sendKeys(val);
	}
	
	
	public static void Selectwebelement(WebElement webele)
	{
		
		webele.click();
	}
	public static void Selectwebelement1(WebElement webele)
	{
		
		webele.click();
	}
	public static void Checkbox(WebElement webele)
	{
		
		webele.click();
	}
	public static void Submitbutton(WebElement webele)
	{
		
		webele.click();
	}
	public static void Submitbutton1(WebElement webele)
	{
		
		webele.click();
	}
	public static void PrintwebeleText(WebElement webele)
	{
		
		String webtext= webele.getAttribute("value");
		System.out.println(webtext);
		//return webtext;
	}
	public static String getwebeleAttribute(WebElement webele,String value)
	{
		
		String webtext1= webele.getAttribute(value);
		return webtext1;
	}
	public static void MoveElement (WebElement webele)
	{
		action= new Actions(driver);
		action.moveToElement(webele).perform();
	}	
	public static void MoveElement1 (WebElement webele)
	{
		action= new Actions(driver);
		action.moveToElement(webele).perform();
	}	
	public static void MoveElement2 (WebElement webele)
	{
		action= new Actions(driver);
		action.moveToElement(webele).perform();
		webele.click();
	}	
	
	public static void DrangDropElement (WebElement src,WebElement des)
	{
		action= new Actions(driver);
		action.dragAndDrop(src, des).perform();
	}	
	public static void Keydown (WebElement webele,String value,String key)
	{
		action= new Actions(driver);
		action.keyDown(webele, key);
		webele.sendKeys(value);
	}	
	public static void Keyup (WebElement webele,String key)
	{
		action= new Actions(driver);
		action.keyUp(webele, key);
	}
	public static void Doubletick (WebElement webele)
	{
		action= new Actions(driver);
		action.doubleClick(webele).perform();
	}	
	public static void RightClick (WebElement webele)
	{
		action= new Actions(driver);
		action.contextClick(webele).perform();
	}	
	public static void Keypressrel (int Down,int limt,int Enter,int tab,int Ctrl,int ctrl_v) throws AWTException
	{
		robot=new Robot();
		for(int i=0;i<limt;i++)
		{
			robot.keyPress(Down);
			robot.keyRelease(Down);
		}
		robot.keyPress(Enter);
		robot.keyRelease(Enter);
		robot.keyPress(tab);
		robot.keyRelease(tab);
		robot.keyPress(Ctrl);
		robot.keyPress(ctrl_v);
		robot.keyRelease(Ctrl);
		robot.keyRelease(ctrl_v);
	}
	public static void DropDownSelectindex(WebElement webele,int a)
	{
		select = new Select(webele);
		select.selectByIndex(a);
		
	}
	public static void DropDownSelectvisbtextloc(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtexthotel(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextroomtype(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextnoofroom(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextadults(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextchildren(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextcredittype(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextexpdate(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownSelectvisbtextexpyear(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	
	
	
	public static void DropDownSelectvalue(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByValue(a);
	}
	public static boolean DropDownselectismulti(WebElement webele)
	{
		select = new Select(webele);
		boolean b=select.isMultiple();
		return b;
	}
	public static List DropDownSelectgetoptions(WebElement webele)
	{
		select = new Select(webele);
		List list = (List) select.getOptions();
		return list;
		
	}
	public static List DropDownSelectallgetoptions(WebElement webele)
	{
		select = new Select(webele);
		List list = (List) select.getAllSelectedOptions();
		return list;
	}
	public static String DropDownSelectfirstgetoptions(WebElement webele)
	{
		select = new Select(webele);
		WebElement web =select.getFirstSelectedOption();
		String printfiset= web.getText();
		return printfiset;
	}
	public static void DropDownDeSelectindex(WebElement webele,int a)
	{
		select = new Select(webele);
		select.deselectByIndex(a);
	}
	public static void DropDownDeSelectvisibletex(WebElement webele,String a)
	{
		select = new Select(webele);
		select.selectByVisibleText(a);
	}
	public static void DropDownDeSelectvalue(WebElement webele,String a)
	{
		select = new Select(webele);
		select.deselectByValue(a);
	}
	public static void DropDownAllDeSelect(WebElement webele)
	{
		select = new Select(webele);
		select.deselectAll();
	}
	public static void WindowsUrl(String url)
	{
		driver.switchTo().window(url);
		//driver.getWindowHandle();---string
		//driver.getWindowHandles();---set
	}
	public static void WindowsTitle(String title)
	{
		driver.switchTo().window(title);
	}
	public static void WindowsId(String title)
	{
		driver.switchTo().window(title);
	}
	public static void Frameid(String a) 
	{
		driver.switchTo().frame(a);
		
	}
	public static void Framename(String a)
	{
		driver.switchTo().frame(a);
	}
	public static void Framewebelement(WebElement webele)
	{
		driver.switchTo().frame(webele);
	}
	public static void Takeshotget(File src1,File dec)
	{
		tss= (TakesScreenshot)driver;
	}
	
	public static void jsexscrolldown(WebElement webele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", webele);
		String b = webele.getText();
		System.out.println(b);
		
	}
	public static void jsexscrollup(WebElement webele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", webele);
		String b = webele.getText();
		System.out.println(b);
		
	}
	public static void jsexsetatt(String a,WebElement webele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript(a, webele);
	}
	public static void jsexgetatt(String a,WebElement webele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript(a, webele);
	}
	public static void jsexgetattprint(WebElement webele)
	{
		js=(JavascriptExecutor)driver;
		//String p1 = null;
		Object obj= js.executeScript("return arguments[0].getAttribute('value')", webele);
		String p1=(String)obj;
		System.out.println(p1);
		//return p1;
	}
	public static void jsexclick(String a,WebElement webele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript(a, webele);
	}
	//40	
	public static void Alertaccept()
	{
		alert=driver.switchTo().alert();
		alert.accept();
	}
	public static void Alertdismiss()
	{
		alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public static void Alertsendkeys(String a)
	{
		alert=driver.switchTo().alert();
		alert.sendKeys(a);
	}
	public static void StaticThread(int a) throws InterruptedException
	{
		Thread.sleep(a);
	}
	public static void Implicitywaittimeunit(int Timeout)
	{
		driver.manage().timeouts().implicitlyWait(Timeout, TimeUnit.SECONDS);
	}
	public static void Webdriverwait(long sec)
	{
		webdriverwait = new WebDriverWait(driver,sec);
	}
	
	
	
	
	public static void Filepathrowcellcount(String pathway,String sheetname,String newvalue) throws IOException
	{
		file = new File(pathway);
		fileinput = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileinput);
		sheet = workbook.getSheet(sheetname);
		row=sheet.createRow(12);
		cell=row.createCell(0);
		cell.setCellValue(newvalue);
		FileOutputStream fout = new FileOutputStream(file);
		workbook.write(fout);
		System.out.println("Done");
		
		
	}
	
	
	
	
	public static String Filepath(String pathway,String sheetname,int rowno,int cellno) throws IOException
	{
		file = new File(pathway);
		fileinput = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileinput);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rowno);
		cell = row.getCell(cellno);
		int celltype =cell.getCellType();
		String Value = null;
		if(celltype==1)
		{
			Value=cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell))
		{
			java.util.Date date = cell.getDateCellValue();
			 SimpleDateFormat formateddate = new SimpleDateFormat("MM-dd-YYYY");
			 formateddate.format(date);
		}
		else
		{
			double d= cell.getNumericCellValue();
			long l = (long)d;
			Value = String.valueOf(l);
		}
		return Value;
	}
	public static void DateAndTime() {
		date =new Date();
		System.out.println(date);
	}
	
	
}

