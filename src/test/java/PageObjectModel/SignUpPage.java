package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPage {
	WebDriver driver;
	
	 WebDriverWait wait = new WebDriverWait(driver, 10);
		
	 
	 @Given("User navigate to SignUp page")
	 public void user_navigate_to_SignUp_page() {
			System.setProperty("webdriver.chrome.driver", "D:\\Practice Project\\phptravels\\Browser\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
	 }

	 @When("Click On SignIn button")
	 public void Click_On_SignIn_button() {
		 driver.findElement(By.xpath("//a[@class='login']")).click();
	    	
	 }

	 @Then("User should be enter Required details")
	 public void user_should_be_enter_Required_details() {
	    	
			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_create']")));
			email.sendKeys("nirajsinha310@gmail.com");
			 driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
			 driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("niraj");
			 driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("sinha");
			 driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("nirajsinha");
			 
			 Select dropdown = new Select(driver.findElement(By.id("//select[@id='days']")));
			 dropdown.selectByIndex(20);

			 Select dropdown1 = new Select(driver.findElement(By.id("//select[@id='months']")));
			 dropdown1.selectByIndex(8);

			 Select dropdown2 = new Select(driver.findElement(By.id("//select[@id='years']")));
			 dropdown2.selectByIndex(1992);
			 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("niraj");
			 driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("sinha");
			 driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("bangalore");
			 driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("bangalore1");
			 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
			 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
	    	
	 }

	 @Then("user should be succesfully Register")
	 public void user_should_be_succesfully_Register() {
	
	 
	 }


}
