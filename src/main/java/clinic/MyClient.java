package clinic;

import java.util.ArrayList;
import java.util.List;

public class MyClient {
	
	
		
		
		static List<MyClient> clients =new ArrayList<MyClient>() ;
		 static List<Appointment> app =new ArrayList<Appointment>() ;
		
		 static ArrayList <MyServices> srvs=new ArrayList<MyServices>();
		 String id;
		 String name;
		 String email;
		String address;
		 String password;
		 String role;
		
		
		
		public int checkpass(String string) {

			if(string.equals("adminAhmad")) {
				return 1;
			}
			
			return 0;
		}

		
		public int checkname(String string) {

			if(string.equals("ahmad")) {
				return 1;
			}
			
			return 0;
		}

	
	
}
