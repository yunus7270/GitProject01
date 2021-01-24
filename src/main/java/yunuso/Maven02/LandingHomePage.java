package yunuso.Maven02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingHomePage {
	public WebDriver driver;
	public WebDriver baseLandingPage () throws IOException {
		
		Properties prop = new Properties ();
													// System.getProperty("user.dir")				// Remains same
//		FileInputStream fis = new FileInputStream("C:\\Users\\ogurlu\\eclipse-workspace\\Maven02" + "\\src\\main\\java\\yunuso\\Maven02\\baseFile");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\yunuso\\Maven02\\baseFile");
		prop.load(fis);
		
		// String browserName = System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ogurlu\\javafx-sdk-11.0.2/chromedriver.exe");
//			ChromeOptions options = new ChromeOptions ();
//			options.addArguments("headless");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		} 
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ogurlu\\javafx-sdk-11.0.2/geckodriver.exe");
			driver = new FirefoxDriver ();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}
		return driver;
	}
}
