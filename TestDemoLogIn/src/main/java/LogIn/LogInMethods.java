package LogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LogInMethods {
	public static WebElement UserId;
	public static WebElement Password;
	public static WebElement Login;
	public static WebElement Message;
	
	  public String openGoogle(WebDriver driver)
	{
		//driver = new ChromeDriver();
		UserId = driver.findElement(By.name("uid"));
		Password =driver.findElement(By.name("password"));
		Login = driver.findElement(By.name("btnLogin"));
		
		
		
		UserId.sendKeys("mngr321798");
		Password.sendKeys("gemAhyt");
		Login.click();
		Message = driver.findElement(By.xpath("//marquee"));
		
		return Message.getText();
	}

}
