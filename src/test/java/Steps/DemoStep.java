package Steps;

import Liabrarory.Utilitymethods2;
import Pages.xapth;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DemoStep extends Utilitymethods2 {
	public static Utilitymethods2  A;
	public static xapth b;
	
	@Given("User launch with a Browser")
  public void launch() throws Exception {
		A=new Utilitymethods2();
		A.launch();
		    
	}
	
	@Then("launch site with a url")
	public void URL() 
	{
		A.url();
	}
	
	@Then("Enter a {string}")
	public void Name (String sss) throws Exception{
		xapth  b=new xapth(driver);
		A.enterData(b.name, sss);
	}
	
	@Then("Enter an {string}")
	public void enterAnValue(String value) throws Exception
	{
		b=new xapth (driver);
		A.enterData(b.emailname, value);
	}
	
	@Then("Enter in {string}")
	public void enterAnnumber(String num) throws Exception
	{
		b=new xapth (driver);
		A.enterData(b.phoneno, num);
	}
	
      @Then("Enter  {string}")
      public void addressss(String add) throws Exception
      {
    	  A.enterData(b.adress, add);
      }
       
      @Then  ("User  to select Gender")
      public void gender() throws Exception
      {
    	  A.click(b.radiobutton);
      }
      @Then("User need to select  Days")
      public void user_need_to_select_days()throws Exception
      {
    	  A.click(b.Days);
      }
      @Then  ("User need to select Country")
      public void country() throws Exception
      {
    	A.selectdrop(b.Selectdropdown,"India");
      }

	}
	
	


