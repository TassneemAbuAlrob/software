package sel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class viewTeam {
	WebDriver driver=null;

	boolean ViewTeam=false;
	
	@Given("that the user login successfully")
	public void that_the_user_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.html");
		
		try {
			Thread.sleep(1500);
			driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("tassneemMasa");
			driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys("tassneemMasa12");
			driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}

	@When("click on team view")
	public void click_on_team_view() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait w = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));

		driver.findElement(By.linkText("Team View")).click();
		try {
			Thread.sleep(1500);
			
			driver.findElement(By.xpath(
					"/html/body/table[2]/tbody/tr[1]/td[1]/div[1]/div/ul/li[16]/a"))
					.click();
			ViewTeam=true;
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			}

	@Then("View users")
	public void view_users() {
		   // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(ViewTeam);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
