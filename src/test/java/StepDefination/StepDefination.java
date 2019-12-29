package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPage;
import PageObjectModel.LoginPageDetails;
import PageObjectModel.LoginSuccessfull;
import PageObjectModel.SignUpButton;
import PageObjectModel.SignUpDetails;
import PageObjectModel.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	static WebDriver driver;
	
	@Given("We need to launch browser")
	public void we_need_to_launch_browser() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("1");

	}

	@When("Browser details and link")
	public void browser_details_and_link() throws Throwable {
		driver.get("http://automationpractice.com/index.php");
		System.out.println("2");

	}

	@Then("open home page")
	public void open_home_page() throws Throwable {
		driver.manage().window().maximize();
		System.out.println("3");

	}

	@Given("User navigate to login page")
	public void user_navigate_to_login_page() throws Throwable 
	{
		System.out.println("We are on Login page");
		
	}

	@When("Click on Login button")
	public void click_on_Login_button() 
	{
		LoginPage h = new LoginPage(driver);
		h.LoginClick();
		System.out.println("4");
	}

	@And("enter {string} and {string}")
	public void enter_and(String strArg1, String strArg2) 
	{
		System.out.println("4");
		LoginPageDetails LD = new LoginPageDetails(driver);
		LD.LoginDetails(strArg1, strArg2);

		
	 
	}
	@Then("user should be succesfully Login{string}")
	public void user_should_be_succesfully_Login(String accountname)
	{
		LoginSuccessfull LS = new LoginSuccessfull(driver);
		LS.LoginButtonClick();
	}
	

	
	@Given("User navigate to SignUp page")
	public void user_navigate_to_SignUp_page()
	{
		System.out.println("SignUp Page details");
		SignUpPage SP = new SignUpPage(driver);
		SP.CreateAccount();
	}

	@When("SignUp details")
	public void signup_details()
	{
		SignUpDetails SD = new SignUpDetails(driver);
		SD.SignUp();

	}

	@Then("user successfully Register")
	public void user_successfully_Register()
	{
		SignUpButton SB = new SignUpButton(driver);
		SB.SignUpClick();
	}
}
