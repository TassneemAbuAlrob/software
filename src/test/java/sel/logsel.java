package sel;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logsel {
	
	WebDriver driver=null;
	static boolean loginSuccess=false;
	
	@Given("user open the website and go to login page")
	public void user_open_the_website_and_go_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.html");	
		loginSuccess=true;	}

	@When("user fill username and password and click on login")
	public void user_fill_username_and_password_and_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("tassneemMasa");

		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(2)")).sendKeys("tassneemMasa12");

		//WebElement username =driver.findElement(By.id("username"));
		//WebElement pass = driver.findElement(By.id("password"));
		//username.sendKeys(("tassneemMasa"));
		//pass.sendKeys(("tassneemMasa12"));
		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		boolean iswelcom=driver.findElement(By.cssSelector("[data-testid=\"welcom\"]")).isDisplayed();
		Assert.assertTrue(iswelcom);
	}

}
