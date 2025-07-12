package Liabrarory;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Utilitymethods2 {
	public static WebDriver driver;
	public static Properties confi;
	public static Actions action;
	public static Select select;
	
	
	
	
	public void launch() throws Exception
	{
		File f=new File(System.getProperty("user.dir")+"\\Application.Properties");
		FileInputStream fi=new FileInputStream(f);
		confi=new Properties();
		confi.load(fi);
		
		if(confi.getProperty("BrowserType").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nites\\eclipse-workspace\\NewProject\\chromedriver.exe");  
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		
	}
	public void url() {
		
	
		driver.get(confi.getProperty("URL"));
		driver.manage().window().maximize();
		//driver.get(confi.getProperty("UserName"));
		
	}
		public void enterData(WebElement element, String data) throws Exception
		{
			Thread.sleep(2000);
			element.sendKeys(data);
			
			
		}
		public void click(WebElement element)  throws Exception 
		{
			Thread.sleep(2000);
			element.click();
		}
		
		public  void hover(WebElement element) throws Exception
		{
			Thread.sleep(2000);
			 action=new Actions(driver); 
			action.moveToElement(element).perform();
		}
		public static void hoverandClick(WebElement element) throws Exception
		{
			 
			action.moveToElement(element).click(element).build().perform();
		}
		
		public static void hoverandenterData(WebElement element, String data) throws Exception 
		{
			action.moveToElement(element).click(element).sendKeys(data).build().perform(); 
		}
		
		
		public static void SwitchToFrame(String Frameid ) throws Exception
		{
			driver.switchTo().frame(Frameid);
		}
		public static void SwitchToParentFrame() throws Exception
		{
			driver.switchTo().parentFrame();
		}
		public static void selectdrop(WebElement element, String a ) throws Exception
		{
			select=new Select(element);
			//select.selectByIndex(a);
			Thread.sleep(3000);
			select.selectByVisibleText(a);;
			//select.selectByValue(a);
		}
		@AfterMethod
		public static void driverclose() throws Exception
		{
			Thread.sleep(5000);
			driver.close();
			driver.quit();
		}
		public static void windowHandle(int i) throws Exception
		{
			Thread.sleep(5000);
			Set<String> w=driver.getWindowHandles();
			List<String> ws=new ArrayList<String>(w);
			driver.switchTo().window(ws.get(i));
		}
		
		public static void Text(WebElement element) throws Exception
		{
			String x=element.getText();
			System.out.println(x);
		}
		

		    public static String takeScreenshot(WebDriver driver, String testName) {
	
		    	String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		        String path = "test-output/screenshots/" + testName + "_" + timestamp + ".png";
		        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        try {
		            Files.createDirectories(new File("test-output/screenshots").toPath());
		            File dest = new File(path);
		            Files.copy(src.toPath(), dest.toPath());
		            return path;
		        } catch (IOException e) {
		            e.printStackTrace();
		            return null;
		        }
		        
		    }
		    public void robot() throws Exception {
		    	Robot r= new Robot();
		    	r.keyPress(KeyEvent.VK_ENTER);
		    	r.keyRelease(KeyEvent.VK_ENTER);
		    	
		    	
		    }
		   
		    public void SelectClass(WebElement element, String a) throws Exception {
		    	Select dropdown = new Select(element);
		    	//dropdown.selectByIndex(2);
		    	dropdown.selectByValue(a);
		    	//dropdown.selectByVisibleText(null);
}
}


