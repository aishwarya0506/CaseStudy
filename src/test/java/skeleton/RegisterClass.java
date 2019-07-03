package skeleton;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class RegisterClass {
    WebDriver driver;
    int flag=0;
    String a;
    String result="Login";
    
    
    
    @Given("^The SignUp page is opened$")
    public void the_SignUp_page_is_opened() throws Throwable {
   
   
    System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\path\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("SignUp")).click();
}
   
    @When("^the \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"  and the other details are given$")
    public void the_and_the_other_details_are_given(String username, String fname, String lname, String password, String cpassword, String email, String mob, String add)

    {

           driver.findElement(By.name("userName")).sendKeys("Lalitha");

        

             

        driver.findElement(By.name("firstName")).click();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        a= driver.findElement(By.xpath("//*[@id=\"err\"]")).getText();

            driver.findElement(By.name("userName")).sendKeys(username);

           driver.findElement(By.name("firstName")).sendKeys(fname);

           driver.findElement(By.name("lastName")).sendKeys(lname);

           driver.findElement(By.name("password")).sendKeys(password);

           driver.findElement(By.name("confirmPassword")).sendKeys(cpassword);

           driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();

        driver.findElement(By.name("emailAddress")).sendKeys(email);

        driver.findElement(By.name("mobileNumber")).sendKeys(mob);

        driver.findElement(By.name("dob")).sendKeys("09/05/1997");

        driver.findElement(By.name("address")).sendKeys(add);

        driver.findElement(By.name("answer")).sendKeys("vpm");

        driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).click();

         WebElement category=driver.findElement(By.id("securityQuestion"));

         Select s=new Select(category);

          List <WebElement> values=s.getOptions();

          for(WebElement e:values)

          {

           String  option = e.getText();

           if (option.equals("What is your favour color?"))

           {

           s.selectByVisibleText(option);

           flag = 1;

           break;

           }

          }if(flag==1){

          driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("yellow");

          driver.findElement(By.name("Submit")).click();

          

    }

        }

       

   


    
    @Then("^The user is regestered$")
    public void the_user_is_registered() throws Throwable {
        

        // Write code here that turns the phrase above into concrete actions

           System.out.println("Successfullyregistered");
           Assert.assertEquals(result, driver.getTitle());
       

    }







}

