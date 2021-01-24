package yunuso.Maven02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject1 {
	
	
	WebDriver driver;

	public PageObject1(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.cssSelector("input[id='username']");
	By password = By.cssSelector("input[id='password']");
	By logIn = By.cssSelector("input[name='submit']");
	
	
	public WebElement userNameID () {
		return driver.findElement(userName);
	}
	
	public WebElement passwordID () {
		return driver.findElement(password);
	}
	
	public WebElement logInID () {
		return driver.findElement(logIn);
	}
	
}
