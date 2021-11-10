package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	@When("click on CRMSFA")
public void click_on_CRMSFA()
{
		  driver.findElement(By.linkText("CRM/SFA")).click();	
	
	
}
}
