package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class shout {
	Person Lucy=new Person();
	Person Sean=new Person();
	String expected="Free Puppies";
	String actual;
	@Given("^Lucy is (\\d+) meters away from Sean$")
	public void lucy_is_meters_away_from_Sean(int Distance) throws Exception {
	    Sean.setDistance(0);
	    Lucy.setDistance(Distance);
	}

	@When("^Sean shouts \"([^\"]*)\"$")
	public void sean_shouts(String message) throws Exception {
		actual=message;
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^Lucy hears Sean's message$")
	public void lucy_hears_Sean_s_message() throws Exception {
		Assert.assertEquals(expected, actual);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
