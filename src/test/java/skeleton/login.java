package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	String expectedresult="Find a Flight: Mercury Tours:";
	@Given("^Login page opens$")
	public void login_page_opens() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\path\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demoaut.com/");
		  driver.manage().window().maximize();
	    //throw new PendingException();
	}

	@When("^User enters correct login credentials$")
	public void user_enters_correct_login_credentials() throws Exception {
		
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("login")).click();
	    //throw new PendingException();
	}

	@Then("^User logs in to the page for further action$")
	public void user_logs_in_to_the_page_for_further_action() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    Assert.assertEquals(expectedresult, driver.getTitle());
	    //throw new PendingException();
	}
}
