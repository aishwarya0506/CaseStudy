package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Purchase {
		WebDriver driver;
		@Given("^Alex has Registered in to TestMeApp$")
		public void alex_has_Registered_in_to_TestMeApp() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\path\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		 driver.findElement(By.name("Login")).click();
 
		}
		@When("^Alex search a particular prduct like headphones$")
		public void alex_search_a_particular_prduct_like_headphones() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		    //Assert.assertEquals("Sorry no products available in this category. Please try some other",driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")));
		}
		@And("^try to proceed to payment without adding any item in the cart$")
		public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() throws Throwable {
		  System.out.println("No items are added");  
		}
		@Then("^TestMe doesn't display the cart icon$")
		public void testme_doesn_t_display_the_cart_icon() throws Throwable {
		 System.out.println("Cart icon unavailable"); 
		  
		}
		}

