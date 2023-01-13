package clinic;



import static org.junit.Assert.assertTrue;

import clinic.MyClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	MyClient c;
	static boolean loginflag;

	public loginSteps(MyClient c1) {
		c=c1;
	}
	
	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		loginflag=false;
	}

	@Given("the password is {string}")
	public void the_password_is(String string) {
		 c.password=string;
			if( c.checkpass(string)==1) {
				loginflag=true;
			}
			if( c.checkpass(string)==0) {
				loginflag=false;
			}
			 
			}
	

	@Given("the username is {string}")
	public void the_username_is(String string) {
		 c.name=string;
			if( c.checkname(string)==1) {
				loginflag=true;
			}
			if( c.checkname(string)==0) {
				loginflag=false;
			}
			 
			
	}
	
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
		loginflag=true;
	}

	@Then("the admin login succeeds")
	public void the_admin_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(loginflag);
	}

	@Then("the admin is logged in")
	public void the_admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(loginflag);
	}

	@Then("the admin login fails")
	public void the_admin_login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(!loginflag);
	}

	@Then("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(!loginflag);
	}
	
	

	@When("the admin logs out")
	public void the_admin_logs_out() {
		loginflag=false;
	}


	
	}