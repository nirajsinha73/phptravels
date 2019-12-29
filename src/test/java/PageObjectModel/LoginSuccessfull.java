package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSuccessfull {
	WebDriver driver;
	

	public LoginSuccessfull(WebDriver driver) {
		this.driver = driver;
	}
	public void LoginButtonClick() {
		WebElement Home = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		Home.click();

}
}
