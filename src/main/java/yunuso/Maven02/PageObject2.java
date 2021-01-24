package yunuso.Maven02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject2 {
	WebDriver driver;

	public PageObject2(WebDriver driver) {
		this.driver = driver;
	}
	
	private By register = By.cssSelector("a[href*='register']");
	private By accept = By.cssSelector("input[type='submit']");
	private By title = By.cssSelector("div[class*='card-header text-center'] h2");

	public WebElement registerID () { 
		return driver.findElement(register);
		}
	
	public WebElement acceptID () {
		return driver.findElement(accept);
	}
	
	public WebElement titelID () {
		return driver.findElement(title);
	}

}
