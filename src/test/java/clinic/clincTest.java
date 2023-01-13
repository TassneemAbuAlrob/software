
package clinic;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( plugin= {"html:target/clinic.html"},features="use_cases",glue="clinic")



public class clincTest {

	
}
	
	
	