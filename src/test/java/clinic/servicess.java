package clinic;

import static org.junit.Assert.assertTrue;

import clinic.MyServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class servicess {
	
	boolean servicesAdded=false;
	boolean servicesDeleted=false;
	boolean servicesUpdated=false;


	MyServices s;
	
	public servicess(MyServices s1)
	{
		s=s1;
	}

	@When("admin try to add service with name {string}, price {int}, id {string}")
	public void admin_try_to_add_service_with_name_price_id(String string, Integer int1, String string2) {
		 // Write code here that turns the phrase above into concrete actions
		loginSteps.loginflag=true;
		s.price=int1;
		s.serviceName=string;
		s.serviceid=string2;
		MyServices.manageServices.add(s);
		servicesAdded=true;
		
		
	}
	@Then("the service added successfully")
	public void the_service_added_successfully() {
		
		if(servicesAdded==true)
			assertTrue(servicesAdded);
	   
	}
	
	@When("admin try to delete service with name {string}, price {int},id {string}")
	public void admin_try_to_delete_service_with_name_price_id(String string, Integer int1, String string2) {
	    // Write code here that turns the phrase above into concrete actions

		loginSteps.loginflag=true;
		for(MyServices sv : MyServices.manageServices)
		{
			if(sv.serviceid.equals(string2) && sv.serviceName.equals(string) && sv.price == int1)
				MyServices.manageServices.remove(sv);

		}
		servicesDeleted=true;
	}


@Then("the service deleted successfully")
public void the_service_deleted_successfully() {
    // Write code here that turns the phrase above into concrete actions
	
	if(servicesDeleted==true)
		assertTrue (servicesDeleted);
}

@When("admin try to update service with name {string}, price {int}, id {string} to service with name {string}, price {int}, id {string}")
public void admin_try_to_update_service_with_name_price_id_to_service_with_name_price_id(String string, Integer int1, String string2, String string3, Integer int2, String string4) {
    // Write code here that turns the phrase above into concrete actions
	loginSteps.loginflag=true;
	for(MyServices sv : MyServices.manageServices)
	{
		if(sv.serviceid.equals(string2) && sv.serviceName.equals(string) && sv.price == int1)
			
			MyServices.manageServices.remove(sv);
			sv.serviceName=string3;
		    sv.serviceid=string4;
		    sv.price=int2;
			MyServices.manageServices.add(sv);


	}
	servicesUpdated=true;
	
}

@Then("the service updated successfully")
public void the_service_updated_successfully() {
    // Write code here that turns the phrase above into concrete actions

	assertTrue(servicesUpdated);
}

}
