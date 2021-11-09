package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}
	@Given("load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}
	@Given("Enter the username as Demosalesmanager")
	public void enter_the_username_as_demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    
	}
	@Given("Enter Password as crmsfa")
	public void enter_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	   
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}
	@Then("Homepage should be used")
	public void homepage_should_be_used() {
		String title=driver.getTitle();
		if(title.equals("Leaftaps - Testleaf Automated Platform"))
		{
			System.out.println("homepage is displayed");
		}
		else
		{
			System.out.println("username not dissolved");
		}

}
}
