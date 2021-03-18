package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
		@Given("I have logged in at Mailchimp")
		public void i_have_logged_in_at_mailchimp() throws InterruptedException {
			System.out.println("Log in");
		    System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\drivers\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://login.mailchimp.com/signup/");
		    Thread.sleep(2000);  // Let the user actually see something!
		  
		    driver.quit();
			
		}

		@Given("I have entered {string}")
		public void i_have_entered(String email) {
			System.out.println("Email " +email);
		}
		@When("I check for the {int} in step")
		public void i_check_for_the_in_step(int userName) {
			System.out.println("User name " +userName);
		}
		@Then("I verify the success in step")
		public void i_verify_the_success_in_step() {
			System.out.println("Verify");
		}

}
