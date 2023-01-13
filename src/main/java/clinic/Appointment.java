package clinic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Appointment {
	

  String section;
    String time;
   MyClient  c =new MyClient();
 
  int month= Calendar.MONTH;
  int day= Calendar.DAY_OF_WEEK;
  int week =Calendar.WEEK_OF_MONTH;
 
  String username =c.name;

 static List<Appointment> userBooking= new ArrayList <>();
 String uid=c.id;
static boolean donevisit=false;
static boolean writenote=false;

}
