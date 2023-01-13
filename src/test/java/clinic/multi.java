package clinic;

import static org.junit.Assert.assertTrue;

import clinic.Appointment;
import clinic.MyClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multi {
	boolean stop=false;
	boolean size=false,delete=false,update=false;
int num;
Appointment a1;
	MyClient c1;
	
	
	public multi( Appointment a ,MyClient c    ) {
		a1=a;
		c1=c;
	}
	
	@Given("the user with id {string} is registerd")
	public void the_user_with_id_is_registerd(String string) {
	    
		for(MyClient c :MyClient.clients) {
	    	if(c.id.equals(string)) {
	    		register.registerr=true;
	    	}
	    	else {
	    		register.registerr=false;

		}
		}
		
	}

	@When("the user choose {int} to {int} appointments from")
	public void the_user_choose_to_appointments_from(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E, K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    
		for(int i=0;i<8;i++) {
			String co1= dataTable.cell(i, 0);	
			String co2= dataTable.cell(i, 1);	
			int  co3= Integer.parseInt(dataTable.cell(i, 2));	
			int co4= Integer.parseInt(dataTable.cell(i, 3));
			int co5= Integer.parseInt(dataTable.cell(i, 4));
	         a1.section=co1;
	         a1.time=co2;
	         a1.day=co3;
	         a1.week=co4;
	         a1.month=co5;
			
	         Appointment.userBooking.add(a1);
		}

		
	}

	@When("the user select appointment with section {string}, time {string}, day {int},week {int},month {int}")
	public void the_user_select_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	
	if (MyClient.app.size()<3) {
		
	a1.section=string;
	a1.time=string2;
	a1.day=int1;
	a1.week=int2;
	a1.month=int3;
	MyClient.app.add(a1);
		
		
		
		
		
	}
	

	
	}

	@When("appointment with section {string}, time {string}, day {int},week {int},month {int}")
	public void appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
		if (MyClient.app.size()<3) {
			
			a1.section=string;
			a1.time=string2;
			a1.day=int1;
			a1.week=int2;
			a1.month=int3;
			MyClient.app.add(a1);
				
				
				
			}
	
	}

	@Then("these appointments are booked")
	public void these_appointments_are_booked() {
		
		if (MyClient.app.size()<3) {
booking.isbooked=true;			
size=true;
		assertTrue(booking.isbooked&&size);

	}

	
	}
	

@When("the user try to book multi appointments")
public void the_user_try_to_book_multi_appointments() {
	
	 register.registerr =false;

}	

@Then("the user can not book multi appointments")
public void the_user_can_not_book_multi_appointments() {
	if (  register.registerr ==false  ) {
				assertTrue(!booking.isbooked);

			}


}

@When("the user choose more than {int} appointments from")
public void the_user_choose_more_than_appointments_from(Integer int1, io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
  
	for(int i=0;i<8;i++) {
		String co1= dataTable.cell(i, 0);	
		String co2= dataTable.cell(i, 1);	
		int  co3= Integer.parseInt(dataTable.cell(i, 2));	
		int co4= Integer.parseInt(dataTable.cell(i, 3));
		int co5= Integer.parseInt(dataTable.cell(i, 4));
	       a1.section=co1;
           a1.time=co2;
         a1.day=co3;
         a1.week=co4;
         a1.month=co5;
		
         Appointment.userBooking.add(a1);
		
	}
	
}

@When("the user select appointments with number {int}")
public void the_user_select_appointments_with_number(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	num=int1;
	 if (num>3) {
		 
		size=false;
		 
		 
		 
	 }
	
}

 @Then("the user exceeded the number of appointments,so the appointments are not booked")
 public void the_user_exceeded_the_number_of_appointments_so_the_appointments_are_not_booked() {
   System.out.println(booking.isbooked);
	 if (size==false) {
 assertTrue( !(booking.isbooked&&size) ); // will return soooooooooooooooooooooooooooooooooonn

}
 }

@Given("the user with id {string} is register")
public void the_user_with_id_is_register(String string) {
   
		for(MyClient c :MyClient.clients) {
	    	if(c.id.equals(string)) {
	    		register.registerr=true;
	    	}
	    	else {
	    		register.registerr=false;

		}
		}
	
	
	
}

@When("the user is already booked these appointments")
public void the_user_is_already_booked_these_appointments(io.cucumber.datatable.DataTable dataTable) {

	for(int i=0;i<3;i++) {
		String co1= dataTable.cell(i, 0);	
		String co2= dataTable.cell(i, 1);	
		int  co3= Integer.parseInt(dataTable.cell(i, 2));	
		int co4= Integer.parseInt(dataTable.cell(i, 3));
		int co5= Integer.parseInt(dataTable.cell(i, 4));
       a1.section=co1;
         a1.time=co2;
         a1.day=co3;
         a1.week=co4;
         a1.month=co5;
		
		MyClient.app.add(a1);
		
	}
	


}

@When("the user needs to delete appointment with section {string}, time {string}, day {int},week {int},month {int}")
public void the_user_needs_to_delete_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
    // Write code here that turns the phrase above into concrete actions

	for(Appointment b :MyClient.app) {
    	if(b.section.equals(string)&& b.time.equals(string2)&& b.day==int1 &&b.week==int2 && b.month== int3){

    		MyClient.app.remove(b);
            delete=true;

    	}

}
	}

@Then("this appointment is deleted")
public void this_appointment_is_deleted() {
  if(delete==true)
	assertTrue(delete&&register.registerr);
	
	
}


@When("the user is already booked an appointment with section {string}, time {string}, day {int},week {int},month {int}")
public void the_user_is_already_booked_an_appointment_with_section_time_day_week_month
(String string, String string2, Integer int1, Integer int2, Integer int3) {

	register.registerr =true; 

    	a1.section=string;
    	a1.time=string2 ;
    	
    	
    	a1.day=int1;
    	a1.week=int2;
    	a1.month=int3;

    		MyClient.app.add(a1);
        



}


	
	
	
@When("the user want to change the time of appointment with section {string}, time {string}, day {int},week {int},month {int} to time {string}")
public void the_user_want_to_change_the_time_of_appointment_with_section_time_day_week_month_to_time
(String string, String string2, Integer int1, Integer int2, Integer int3, String string3) {
	for(Appointment b :MyClient.app) {
    	if(b.section.equals(string)&& b.time.equals(string2)&& b.day==int1 &&b.week==int2 && b.month== int3){
           
    	 MyClient.app.remove(b);
    		b.time=string3;
        
        	b.section=string;
        	b.time=string2 ;
        	
        	
        	b.day=int1;
        	b.week=int2;
        	b.month=int3;
            MyClient.app.add(b);
            update=true;

    	}
	}  
	
	
	
}


@Then("this appointment is updated")
public void this_appointment_is_updated() {
   
	if (update==true) {
		
		assertTrue(update && register.registerr);
	
	}
}



	
	
	
	
 
	
	
	

}
