package clinic;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class display {
	
	boolean disp=false;
	@Given("that the admin {string} request to display services")
	public void that_the_admin_request_to_display_services(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("The admin  : " +string+"     "+"\n");	}

	@When("the services in clinic is  {string},price {int},id {string} and {string},price {int},id {string} and {string} ,price {int},id {string}")
	public void the_services_in_clinic_is_price_id_and_price_id_and_price_id(String string, Integer int1, String string2, String string3, Integer int2, String string4, String string5, Integer int3, String string6) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("service name : " +"     "+"price of service: "+"     "+"id of service: "+ "\n \n " );
		System.out.print(string+"          "+int1+"                      "+string2+"\n ");
		System.out.println("***************************************************");
		System.out.print(string3+"                      "+int2+"                      "+string4+"\n \n");
		System.out.println("***************************************************");
		System.out.print(string5+"          "+int3+"                      "+string6+"\n\n ");
		System.out.println("----------------------------------------------------------------------------------"+"\n \n");
disp=true;
}

	@Then("print services")
	public void print_services() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(disp);	}

	@Given("that the admin {string} request to display team table")
	public void that_the_admin_request_to_display_team_table(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("The admin  : " +string+"     "+"\n");	}

	@When("the team in clinic is name {string} ,service {string} and name {string} service {string} and name {string} service {string}")
	public void the_team_in_clinic_is_name_service_and_name_service_and_name_service(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions

		System.out.print("Employee name : " +"     "+"service name: "+"     "+ "\n \n " );
		System.out.print(string+"          "+"        "+string2+"\n ");
		System.out.println("***************************************************");
		System.out.print(string3+"                      "+"   "+string4+"\n \n");
		System.out.println("***************************************************");
		System.out.print(string5+"          "+"        "+string6+"\n\n ");
		System.out.println("----------------------------------------------------------------------------------"+"\n \n");
disp=true;
	}

	@Then("print team table")
	public void print_team_table() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(disp);	}
}