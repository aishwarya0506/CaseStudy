package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefn {

@Given("^I have some cakes in my hand$")
public void i_have_some_cakes_in_my_hand() throws Exception {
    System.out.println("Given");  
    // throw new PendingException();
	
}

@When("^I will wait for some time$")
public void i_will_wait_for_some_time() throws Exception {
    System.out.println("When");
    //throw new PendingException();
}

@Then("^My cakes will disappear$")
public void my_cakes_will_disappear() throws Exception {
    System.out.println("Then");
   //throw new PendingException();
}
}
