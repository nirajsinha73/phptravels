package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpButton 
{
	WebDriver driver;
	public SignUpButton(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SignUpClick()
	{
		driver.findElement(By.id("submitAccount")).click();
		
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
	}

}
