package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LogIn.LogInMethods;

public class LogInTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
	}
	@Test
	public void logIn()
	{
		LogInMethods ob = new LogInMethods();
		String title=ob.openGoogle(driver);
		assertEquals("Welcome To Manager's Page of Guru99 Bank", title);
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
