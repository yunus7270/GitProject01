package yunuso.Maven02;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMavenProject2 extends LandingHomePage {

	PageObject2 po2;
	@BeforeTest 
	public void beforeTest () throws IOException {
		driver = baseLandingPage ();
		driver.get("https://secure.education.mn.gov/cas/login?service=https%3a%2f%2fsecure.education.mn.gov%2ftestwes%2findex.faces");
		String title = driver.getTitle();
		System.out.println("My title is " + title);}
	@Test
	public void testMaven01 () throws IOException {
		po2 = new PageObject2 (driver);
		po2.registerID().click();
		po2.acceptID().click();}
	
public void testMaven02 () throws IOException {
		po2 = new PageObject2 (driver);
		String text = po2.titelID().getText();
		System.out.println("Text " + text);}
	@AfterTest
	public void afterTest () {
		driver.close();}
	}
