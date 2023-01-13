package clinic;

import static org.junit.Assert.assertTrue;

import clinic.MyClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	
	MyClient cc;
	MyClient ccc;
	static boolean exist=false;
	static boolean registerr=false;
	static boolean out=false;

	public register(MyClient c){
		cc=c;
		
	}
	
	@Given("The Admin is logged in")
	public void the_admin_is_logged_in() {
		loginSteps.loginflag=true;
		
	}

	@Given("The user with id {string}, name {string} ,email {string},address {string},password {string}")
	public void the_user_with_id_name_email_address_password(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		 for(MyClient c :MyClient.clients) {
		    	if(c.id.equals(string)) {
		    		exist=true;
		    	}
		    }
 		   if(exist ==false)
 		   {
 	 	  registerr=true;
 		   cc.id=string;
 		   cc.name=string2;
 		   cc.email=string3;

 		   cc.address= string4;
 		   cc.password=string5;
 		   }
 	   }
	

	@When("The user with id  {string} try to register")
	public void the_user_with_id_try_to_register(String string) {
	    // Write code here that turns the phrase above into concrete actions
		cc.role="user";
	}

	@Then("The user with id {string}, name {string} ,email {string},address {string},password {string} is register successfully in clinc")
	public void the_user_with_id_name_email_address_password_is_register_successfully_in_clinc(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		
		if(exist==false) {
			MyClient.clients.add(cc);
			}
			assertTrue( registerr);
		

	}
	
	@When("The user id is {string}")
	public void the_user_id_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("The user is already registered")
	public void the_user_is_already_registered() {
	    // Write code here that turns the phrase above into concrete actions
		exist=true;
		   assertTrue(exist);	}


	@Given("The user with id {string},name {string}")
	public void the_user_with_id_name(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		ccc=new MyClient();
		ccc.id="7";
		ccc.name="shahd";
  	    	   MyClient.clients.add(ccc);
	}

	@When("The Admin unregister the user")
	public void the_admin_unregister_the_user() {
	    // Write code here that turns the phrase above into concrete actions
 	   MyClient.clients.remove(ccc);
	}

	@Then("The user is unregister")
	public void the_user_is_unregister() {
	    // Write code here that turns the phrase above into concrete actions
		   for(MyClient r : MyClient.clients)
    	   {
    		   if(r.id == ccc.id) //if we found id==7 is still not remove
    			   out=false;
    		   else
    			   out=true;
    	   }
    	   
    	   assertTrue(out);       }
	



     @Given("The Admin is not logged in")
     public void the_admin_is_not_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	 loginSteps.loginflag=false;

   }

     @Then("The user is not registered in clinc")
     public void the_user_is_not_registered_in_clinc() {
    // Write code here that turns the phrase above into concrete actions
    	 if(registerr==false)
	  assertTrue(registerr);
    	 }

}