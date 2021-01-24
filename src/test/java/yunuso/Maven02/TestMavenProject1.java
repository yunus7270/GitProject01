package yunuso.Maven02;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMavenProject1 extends LandingHomePage {

	
	
	@BeforeTest 
	public void beforeTest () throws IOException {
		driver = baseLandingPage ();
		
		driver.get("https://secure.education.mn.gov/cas/login?service=https%3a%2f%2fsecure.education.mn.gov%2ftestwes%2findex.faces");
		String title = driver.getTitle();
		System.out.println("My title is " + title);
	}

	@Test (dataProvider = "getData")
	public void testMaven01 (String userName, String password) throws IOException {

		
		PageObject1 po1 = new PageObject1 (driver);
		
		po1.userNameID().sendKeys(userName);
		po1.passwordID().sendKeys(password);
		po1.logInID().click();
		
	}
	@DataProvider
	public Object [][] getData () {
		
		Object [][] data = new Object [1][2];
		data [0][0] = "Elifim Burcum";
		data [0][1] = "11102014";
		
		return data;

	}
	
	@AfterTest
	public void afterTest () {
		driver.close();
	}
	
}
