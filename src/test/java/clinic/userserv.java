package clinic;

import static org.junit.Assert.assertTrue;

import clinic.MyClient;
import clinic.MyServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userserv {
	boolean added=false;
	boolean deleted=false;

	MyServices s1;
	public userserv(MyServices s2)
	{
		s1=s2;
	}

	
	@When("the user choose service from")
	public void the_user_choose_service_from(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		for(int i=0;i<3;i++) {
			String co1= dataTable.cell(i, 0);	
			int co2= Integer.parseInt (dataTable.cell(i, 1));	
			String  co3= dataTable.cell(i, 2);
			
			s1.serviceName=co1;
			s1.price=co2;
			s1.serviceid=co3;
			MyServices.exsitingServices.add(s1);
			System.out.println(s1.price);
			System.out.println(s1.serviceName);
			System.out.println(s1.serviceid);


			
		}
	}
	
	@When("the user select service with name {string},price {int},id {string}")
	public void the_user_select_service_with_name_price_id(String string, Integer int1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		for(MyServices d :MyServices.exsitingServices)
		{
			if(d.serviceid.equals(string2))
				MyClient.srvs.add(d);
			added=true;
		}
	}
	
	@Then("this service is added")
	public void this_service_is_added() {
	    // Write code here that turns the phrase above into concrete actions
		if(added ==true)
			assertTrue(added);
	}
	
	@When("the user try to cancel the service with name {string},price {int},id {string}")
	public void the_user_try_to_cancel_the_service_with_name_price_id(String string, Integer int1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		for(MyServices a:MyClient.srvs)
		{
			if(a.serviceid.equals(string2))
				MyClient.srvs.remove(a);
			deleted=true;
			
		}
	}

	@Then("this service is canceled")
	public void this_service_is_canceled() {
	    // Write code here that turns the phrase above into concrete actions
		if(deleted==true)
			assertTrue(deleted);
	}
	
	
}