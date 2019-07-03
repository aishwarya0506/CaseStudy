package skeleton;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login1 {

	  WebDriver driver;
	     String expected="Login";
	  @Given("^user enters Login Page$")
	  public void user_enters_Login_Page() throws Exception {
	   
		  System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\path\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	       driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	       driver.manage().window().maximize();
	     
	  }

	 @When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	  public void user_enters_valid_and(String username, String password) throws Exception {
	   driver.findElement(By.name("userName")).sendKeys(username);
	       driver.findElement(By.name("password")).sendKeys(password);
	       driver.findElement(By.name("Login")).click();
	       
	  }

	 @Then("^successful login$")
	  public void successful_login() throws Exception {
	   driver.navigate().back();
	      
	 //   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 //   Assert.assertEquals(expected, driver.getTitle());
	      
	  }




	}



