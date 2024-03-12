package stepsdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Formsteps {
	WebDriver driver;

@Given("user oprn chrome browser and enter simpleform url")
public void user_oprn_chrome_browser_and_enter_simpleform_url() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHASHREE\\Documents\\selenium grid\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://v1.training-support.net/selenium/simple-form");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
}

@Given("text box should be enabled")
public void text_box_should_be_enabled() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("firstName")).isEnabled();
	
    
}

@When("user enter text in firstname, lastname,email,contact, message")
public void user_enter_text_in_firstname_lastname_email_contact_message() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("firstName")).sendKeys("shubhashree");
	driver.findElement(By.id("lastName")).sendKeys("swain");
	driver.findElement(By.id("email")).sendKeys("shubhu@123");
	driver.findElement(By.id("number")).sendKeys("7609082942");
	driver.findElement(By.xpath("//textarea")).sendKeys("i am shubhashree swain");
	
	
   
}

@When("user clicks on the submit button")
public void user_clicks_on_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@value='submit']")).click();
    
}

@Then("and alert is displayed")
public void and_alert_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	
  System.out.println("Alert is visible");
  
  // alert handeling
  Alert alt = driver.switchTo().alert();
  alt.accept();
}


}
