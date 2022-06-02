package stepdefinition;

import pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage loginPage = new LoginPage();
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage.User_login_into_SIMS();
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		loginPage.enterUserNameAndPassword();
	}
	 @When("^User enters invalid username and valid password$")
	    public void user_enters_invalid_username_and_valid_password() throws Throwable {
		 loginPage.enterinvalidUserNameAndvalidPassword();
		
	    }
	 
	 @When("^User enters valid username and invalid password$")
	    public void user_enters_valid_username_and_invalid_password() throws Throwable {
		 loginPage.entervalidUserNameAndinvalidPassword();
		 
		 
	    }

	@And("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		loginPage.clickLoginBtn();
	}

	@Then("^User navigated to the home page$")
	public void user_navigated_to_the_home_page() throws Throwable {
		loginPage.NavigatedToHomePage();
	}
	
	@Given("^User is on Safetychain Login page$")
    public void user_is_on_safetychain_login_page() throws Throwable {
		loginPage.User_login_into_SIMS();
    }

    @When("^User without enters username and password$")
    public void user_without_enters_username_and_password() throws Throwable {
        
    }
	
    @Then("^validation message should be displayed$")
    public void validation_message_should_be_displayed() throws Throwable {
    	loginPage.validationmsg();
    }
    
    @When("^User clicks on passwordhelp link$")
    public void user_clicks_on_passwordhelp_link() throws Throwable {
        loginPage.passwordhelp();
    }
    
    @Then("^User navigated to the Password Help page$")
    public void user_navigated_to_the_password_help_page() throws Throwable {
    	loginPage.passwordhelp();
    }
    
    @Then("^Incorrect User Name validation message should be displayed$")
    public void incorrect_user_name_validation_message_should_be_displayed() throws Throwable {
        
    }
    
    @Then("^Incorrect Password validation message should be displayed$")
    public void incorrect_password_validation_message_should_be_displayed() throws Throwable {
    	
    }
}
