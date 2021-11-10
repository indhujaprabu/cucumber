package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass{
	
	/*@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}
	@Given("load the application url {string}")
	public void load_the_application_url(String url) {
		driver.get(url);*/
			    

	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	    
	}
	@Given("Enter Password as {string}")
	public void enter_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	   
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}
	@Then("Homepage should be used")
	public void homepage_should_be_used() {
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		if(title.equals("Leaftaps - Testleaf Automation Platform"))
		{
			System.out.println("homepage is displayed");
		}
		else
		{
			System.out.println("username not dissolved");
		}

}
	@But("Error message is displayed")
	public void Error_Message()
	{
		System.out.println("error message is displayed");
	}
}
