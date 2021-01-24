package fileBasePage;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import yunuso.Maven02.LandingHomePage;
import yunuso.Maven02.PageObject1;

@RunWith(Cucumber.class)

public class BaseClass extends LandingHomePage {
	
	@Given("visiting homepage of {string} website")
	public void visiting_homepage_of_website(String string) throws IOException {
		System.out.println("Webpage is displayed");
		driver = baseLandingPage ();
		driver.get(string);

	
	}
	
	
	@When("^entering credentials (.+) and (.+) to log in$")
    public void entering_credentials_and_to_log_in(String username, String password) throws Throwable {
		System.out.println("Username " + username);
		System.out.println("Password " + password);
		
		PageObject1 po1 = new PageObject1 (driver);
		
		po1.userNameID().sendKeys(username);
		po1.passwordID().sendKeys(password);
		po1.logInID().click();
	
	}
	@Then("read the {string} from console")
	public void read_the_from_console(String string) {
		System.out.println("Message: " + string);
	
	}
	
	@Then("verify the message {string}")
	public void verify_the_message(String string) {
	 
	}
	
	@And("^close all pages$")
    public void close_all_pages() throws Throwable {
    
		driver.close();
    }
	
	
	/*
	 * 
	 *     @Given("^visiting homepage of \"([^\"]*)\" website$")
    public void visiting_homepage_of_something_website(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^entering credentials (.+) and (.+) to log in$")
    public void entering_credentials_and_to_log_in(String username, String password) throws Throwable {
        throw new PendingException();
    }

    @Then("^read the \"([^\"]*)\" from console$")
    public void read_the_something_from_console(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^verify the message \"([^\"]*)\"$")
    public void verify_the_message_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
	 * 
	 * 
	 */
	
	
	

	

}
