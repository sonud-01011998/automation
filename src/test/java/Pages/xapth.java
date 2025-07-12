package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Liabrarory.Utilitymethods2;

public class xapth extends  Utilitymethods2{
	@FindBy(xpath="//input[@placeholder='Enter Name']")
	public WebElement name;
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailname;
	@FindBy(xpath="//input[@placeholder='Enter Phone']")
	public WebElement phoneno;
	@FindBy(xpath="//textarea[@id='textarea']")
	public WebElement adress;
	@FindBy(xpath="//input[@id='female']")
	public WebElement radiobutton;
	@FindBy(xpath="//input[@id='wednesday']")
	public WebElement Days;
	@FindBy(xpath="//select[@id='country']")
	public WebElement Selectdropdown;
	@FindBy(xpath="//select[@id='colors']")
	public WebElement selectcolors;
	@FindBy(xpath="//select[@id='animals']")
	public WebElement sortedlist;
	@FindBy(xpath="//input[@id='datepicker']")
	public WebElement calender;
	@FindBy(xpath="//a[@class='ui-state-default ui-state-highlight']")
	public WebElement datepicker;
	@FindBy(xpath="//button[@class='submit-btn']")
	public WebElement submitbutton;
	@FindBy(xpath="//input[@id='singleFileInput']")
	public WebElement choosefile;
	@FindBy(xpath="//button[text()='Upload Single File']")
	public WebElement uploadfile;
	@FindBy(xpath="//input[@id='input1']")
	public WebElement form;
	@FindBy(xpath="//input[@id='input1']")
	public WebElement formsubmitbutton;
	
	public WebElement getname() {
		 return name;
	}

	
	
	
	
	
	
	public xapth(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void setname() {
//		if(getname()())
//		{
//			getname().click();
//		}
//		else
//		{
//			System.out.println("not dispalyed");
//		}
//	}
	
}
