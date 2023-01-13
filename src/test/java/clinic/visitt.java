package clinic;

import static org.junit.Assert.assertTrue;

import clinic.Appointment;
import clinic.MyClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class visitt {
	

	@Given("the user with id {string} is arrived at the clinic on the specific time")
	public void the_user_with_id_is_arrived_at_the_clinic_on_the_specific_time(String string) {
	    // Write code here that turns the phrase above into concrete actions
    for(Appointment p:MyClient.app ) {
    	if (p.uid==(string)) 
    		booking.isbooked=true;
    	else
    		booking.isbooked=false;
    		
    }
	
}

	@When("the user come to the appointment with section {string},time {string}, day {int} ,week {int}, month {int}")
	public void the_user_come_to_the_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions

	for (Appointment p: MyClient.app) {
		   if(p.section.equals(string)&& p.time.equals(string2)&& p.day==int1 &&p.week==int2 && p.month == int3) 
			   Appointment.donevisit=true;
		   else
			   Appointment.donevisit=false;
		   
	}
}

@Then("the appointment converted to visit")
public void the_appointment_converted_to_visit() {
   if ( Appointment.donevisit==true) 
	  
	   assertTrue(Appointment.donevisit && booking.isbooked);

}
@Given("the user with id {string} not arrived at the clinic on the specific time")
public void the_user_with_id_not_arrived_at_the_clinic_on_the_specific_time(String string) {
	for(Appointment p:MyClient.app ) {
    	if (p.uid==(string)) 
    		booking.isbooked=true;
    	else
    		booking.isbooked=false;
    		
    }
}

@When("the user  did not come to the appointment with section {string},time {string}, day {int} ,week {int}, month {int}")
public void the_user_did_not_come_to_the_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	for (Appointment p: MyClient.app) {
		   if(p.section.equals(string)&& p.time.equals(string2)&& p.day==int1 &&p.week==int2 && p.month == int3) 
			   Appointment.donevisit=true;
		   else
			   Appointment.donevisit=false;
		   
	}
}

@Then("the appointment not converted to visit")
public void the_appointment_not_converted_to_visit() {
	 if ( Appointment.donevisit==false) 
		  
		   assertTrue(!(Appointment.donevisit && booking.isbooked));

}
@Given("the user with id {string} arrived at the clinic on the specific time")
public void the_user_with_id_arrived_at_the_clinic_on_the_specific_time(String string) {
	for(Appointment p:MyClient.app ) {
    	if (p.uid==(string)) 
    		booking.isbooked=true;
    	else
    		booking.isbooked=false;
	}
}

@When("the user come to the second appointment with  section {string}, time {string}, day {int},week {int},month {int}")
public void the_user_come_to_the_second_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	for (Appointment p: MyClient.app) {
		   if(p.section.equals(string)&& p.time.equals(string2)&& p.day==int1 &&p.week==int2 && p.month == int3) 
			   Appointment.donevisit=true;
		   else
			   Appointment.donevisit=false;
		   
	}
}

@When("the user write a note the service was good")
public void the_user_write_a_note_the_service_was_good() {
   if (Appointment.donevisit==true)
	   Appointment.writenote=true;
   else 
	   Appointment.writenote=false;
}
@Then("the appointment converted to visit successfully and the user write a note")
public void the_appointment_converted_to_visit_successfully_and_the_user_write_a_note() {
	if ( Appointment.donevisit==true && Appointment.writenote==true ) 
		  
		   assertTrue(Appointment.donevisit && booking.isbooked);

}





}