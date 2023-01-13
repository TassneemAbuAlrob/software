package clinic;

import java.util.ArrayList;
import java.util.List;

public class MyServices {

	 String serviceid;
	 String serviceName;
	MyClient  c =new MyClient();
    String userid=c.id;
    String username=c.name;
     int price;
     static List<MyServices> manageServices= new ArrayList <MyServices>();
    static List<MyServices> exsitingServices= new ArrayList <MyServices>();


}
