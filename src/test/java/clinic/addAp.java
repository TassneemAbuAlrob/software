package clinic;

import static org.junit.Assert.assertTrue;

import clinic.Appointment;
import clinic.MyClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addAp {
	Appointment pp;
	boolean booking=false;
	boolean exist2=false;
	boolean edit=false;
	boolean delete =false;
	boolean exists=false;
	   
	
	
	public addAp( Appointment p      ) {
		pp=p;
	}	
	
	@Given("the appointment with section {string},time {string},username {string} ,day {int},month {int} ,week {int}")
	public void the_appointment_with_section_time_username_day_month_week(String string, String string2, String string3, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		
		loginSteps.loginflag=true;
		pp.section=string;
		pp.time=string2;
		pp.day=int1;
		pp.month=int2;
		pp.week=int3;
		pp.username=string3;
		exist2=true;
	}

	@When("the appointment is added")
	public void the_appointment_is_added() {
	    // Write code here that turns the phrase above into concrete actions
		booking=true;

	}

	@Then("the appointment with section {string},time {string},username {string},day {int},month {int},week {int} is booked in clinic")
	public void the_appointment_with_section_time_username_day_month_week_is_booked_in_clinic(String string, String string2, String string3, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		if (booking==true) {
			   MyClient.app.add(pp);
		   } 
		   assertTrue(booking);
			}

	@Given("the appointment with section {string},time {string},username {string},day {int},month {int} ,week {int}")
	public void the_appointment_with_section_timeusername_day_month_week(String string, String string2, String string3, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		loginSteps.loginflag=false;
		
	}

	@Then("the appointment is not booked in clinic")
	public void the_appointment_is_not_booked_in_clinic() {
	    // Write code here that turns the phrase above into concrete actions
		if(loginSteps.loginflag==false)
			{
			booking=false;
			}
			   assertTrue(!booking);
	}

	@When("the appointment with section {string},time {string},day {int},month {int} ,week {int} is added")
	public void the_appointment_with_section_time_day_month_week_is_added(String string, String string2, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		for(Appointment p :MyClient.app)
		{
		if(p.section.equals(string) && p.time.equals(string2) && p.day==int1 && p.month==int2 && p.week ==int3)				
			exist2=true;
		}	}

	@Then("the time of this appointment reserved for another appointment")
	public void the_time_of_this_appointment_reserved_for_another_appointment() {
	    // Write code here that turns the phrase above into concrete actions
		if(exist2 == true)
			   assertTrue(!booking);	
			}

	@When("the user with username {string} want to change the date of appointment to day {int}, month {int} ,week {int}")
	public void the_user_with_username_want_to_change_the_date_of_appointment_to_day_month_week(String string, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		for(Appointment p :MyClient.app)
		{
			if(p.username.equals(string))
			{
				p.day=int1;
				p.month=int2;
				p.week=int3;
				edit=true;
			}
		}
		}

	@Then("the appointment with section {string},time {string},username {string},day {int},month {int},week {int} is edited to section {string},time {string},username {string},day {int},month {int},week {int}")
	public void the_appointment_with_section_time_username_day_month_week_is_edited_to_section_time_username_day_month_week(String string, String string2, String string3, Integer int1, Integer int2, Integer int3, String string4, String string5, String string6, Integer int4, Integer int5, Integer int6) {
	    // Write code here that turns the phrase above into concrete actions
		if(edit == true)
			assertTrue(edit);
	}
	
	
	@When("the appointment is deleted")
	public void the_appointment_is_deleted() {
	    // Write code here that turns the phrase above into concrete actions

}

	@Then("the appointment with section {string},time {string},username {string},day {int},month {int},week {int} is deleted in clinic")
	public void the_appointment_with_section_time_username_day_month_week_is_deleted_in_clinic(String string, String string2, String string3, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		
		for(Appointment p: MyClient.app)
		{
			if(p.username.equals(string))
			{
				MyClient.app.remove(p);
				delete=true;


			}
		}
		
		if(delete ==true)
			assertTrue(delete);

	
	}
	
	@Given("the appointment with username {string}")
	public void the_appointment_with_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("the admin is searched for appointment with username {string}")
	public void the_admin_is_searched_for_appointment_with_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		for(Appointment p: MyClient.app)
		{
			if(p.username.equals(string))
			{
				exists=true;
			}

		}
	}

	@Then("the appointment with section {string},time {string},username {string},day {int},month {int},week {int} is exist in clinic")
	public void the_appointment_with_section_time_username_day_month_week_is_exist_in_clinic(String string, String string2, String string3, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(exists);

		
	}



}

	
	


