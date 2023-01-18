package stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.saucedemo.pom.Addtokart_Pomclass;
import com.saucedemo.pom.HomepagePom_Class;
import com.saucedemo.pom.LoginPom_Class;

import com.saucedemo.test.TestBaseClass;
import com.saucedemo.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinations extends TestBaseClass
{
	WebDriver driver;
	HomepagePom_Class hp;
	LoginPom_Class lp;
	Addtokart_Pomclass ap;
	
	
	@Given("I have opened the browser then maximized it.")
	public void openbrowser() throws IOException 
	{
		this.driver=super.setUp();
		System.out.println("open browser");
		
	}
	@And("I have entered the url")
	public void url() throws IOException
	{
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("open website");
	Utility.takess(driver, "loginpage");
	}
	@When("I enter valid username and password")
	public void idpw() throws IOException
	{
		this.lp=new LoginPom_Class(driver);
		lp.sendusername();
		lp.sendpassword();
		System.out.println("Entered id password");
		Utility.takess(driver, "loginpage2");
	}
	@And("clicked Login button")
	public void clicklogin() throws IOException
	{
		this.lp=new LoginPom_Class(driver);
		lp.loginbtnclick();
		System.out.println("clicked login");
		Utility.takess(driver, "homepage");
	}
    @Then("I clicked one product")
    public void productclick()
    {
    	this.hp=new HomepagePom_Class(driver);
    	hp.productclick();
    	System.out.println("1st product click");
    	
    }
    @And("I added it to cart")
    public void addtocart() throws IOException
    {
     this.ap=new Addtokart_Pomclass(driver);
     ap.addtocart();
     System.out.println("product added to cart");
     Utility.takess(driver, "cartpage");
    }
   
    @Then("I click backto Products") 
    public void backtohome()
    {
    	this.ap=new Addtokart_Pomclass(driver);
    	ap.backtoproducts();
    	System.out.println("clicked backoproducts");
    	
    }
    @And("clicked on menu option") 
    public void menu() throws IOException
    {
    	this.hp=new HomepagePom_Class(driver);
    	hp.clickmenu();
    	System.out.println("clicked menu");
    	Utility.takess(driver, "menu");
    }
   @Then("I clicked on Logout option")
   public void logout() throws IOException
   {
	   this.hp=new HomepagePom_Class(driver);
	   hp.logoutclick();
	   System.out.println("clicked logout");
	   Utility.takess(driver, "logout");
   }
	 @Then("Then I have closed the browser")
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
