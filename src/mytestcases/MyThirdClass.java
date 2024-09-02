package mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyThirdClass {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void loginTest() {
		String UserName = "standard_user";
		String Password = "secret_sauce";
		WebElement UsernameInput = driver.findElement(By.id("user-name"));
		WebElement PasswordInpu = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UsernameInput.sendKeys(UserName);
		PasswordInpu.sendKeys(Password);
		LoginButton.click();

	}

	@Test(priority = 2)

	public void addtontCartAllItems() {
		// int myage =31;
		// int mymobileNumber=798684127;
		List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
		for (int i = 1; i < 6; i=i+2) {
			if(i==4) {
				break; }

			AddToCartButtons.get(i).click();
		}

	}

}
