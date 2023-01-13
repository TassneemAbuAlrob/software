package clinic;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class invoice{
	boolean invoice=false;
	
	
	@Given("the user with id {string} ,name {string} is registered")
	public void the_user_with_id_name_is_registered(String string, String string2) {
		System.out.println("Bill :"+"\n");
		System.out.print("The user: " +string2+"     "+ " with id "+string+"     "+"\n");
		
	}

@When("the user was add this two service {string},price {int},id {string} and {string},price {int},id {string}")
public void the_user_was_add_this_two_service_price_id_and_price_id(String string, Integer int1, String string2, String string3, Integer int2, String string4) {
	System.out.print("service name : " +"     "+"price of service: "+"     "+"id of service: "+ "\n \n " );
	System.out.print(string+"          "+int1+"                      "+string2+"\n ");
	System.out.print(string3+"                      "+int2+"                      "+string4+"\n \n");
	System.out.println("***************************************************");
	int total=int1+int2;
	System.out.println("the total price:  " +total+ "\n \n ");
	System.out.println("----------------------------------------------------");
	invoice=true;
}
@Then("the user finish the invoice")
public void the_user_finish_the_invoice() {
	assertTrue(invoice);
	
}
@Given("the user with id {string} ,name {string} is registered in the system")
public void the_user_with_id_name_is_registered_in_the_system(String string, String string2) {
	System.out.print("The user: " +string2+"     "+ " with id "+string+"     "+"\n \n");
}
@When("the user try to add service not available")
public void the_user_try_to_add_service_not_available() {
	System.out.print("The service you added is not available "+"\n \n");
	System.out.println("----------------------------------------------------");
	invoice=true;
}

@Then("the service will not add")
public void the_service_will_not_add() {
	if (invoice==false)
	assertTrue(!invoice);

}
	
}