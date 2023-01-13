package clinic;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class report {
boolean generated=false;
	
	
	@Given("the user with id {string} , name {string} ,email {string},address {string} is registered")
	public void the_user_with_id_name_email_address_is_registered(String string, String string2, String string3, String string4) {
	 
		System.out.print("The user " +string2+ " with email "+string3+" and address "+string4 +"\n\n");
		
		
		
	}
	
	@Given("the user selected service with name {string}, price {int}, id {string}")
	public void the_user_selected_service_with_name_price_id(String string, Integer int1, String string2) {
		System.out.print(" selected a service: "+string +  "\n \n "  );
		
	}

	
	@When("the user selected appointment with section {string}, time {string}, day {int},week {int},month {int}")
	public void the_user_selected_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
		System.out.print("His/Her appointment : "+string + " ,time "+string2+ " ,at date " + int1+
				"/ "+ int3 + " week " + int2+ "\n\n"  );
		
 generated=true;

	}

	
	

	@Then("the report is generated")
	public void the_report_is_generated() {
	  assertTrue(generated);

	}


}
	
	
	