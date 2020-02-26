package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class LoginSuccessfull {
	WebDriver driver;
	

	public LoginSuccessfull(WebDriver driver) {
		this.driver = driver;
	}
	public void LoginButtonClick()
	{
		System.out.println("You are in Home Page");
	}
}
