package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Record_Page;

public class Link_RecordsPage_Steps {
	Record_Page Record_Page = new Record_Page();
	
	@And("^User click on Record Under Hamburger in Link HomePage$")
	public void User_click_on_Record_Under_Hamburger_in_Link_HomePage() throws Throwable {
		Record_Page.clickRecordUnderHamburger();
	}
	
	@Then("^User click on Three months under Record Page$")
	public void User_click_on_Three_months_under_Record_Page() throws Throwable {
		Record_Page.clickonThreeMonths();
	}
	
	@And("^User click on SignOff under Verify of Record Page$")
	public void User_click_on_SignOff_under_Verify_of_Record_Page() throws Throwable {
		Record_Page.clickOnSignOffUnderVerify();
	}
	
	@Then("^User select CheckBox Of First Record and SignOff The Record$")
	public void User_select_CheckBox_Of_First_Record_and_SignOff_The_Record() throws Throwable {
		Record_Page.CheckTheCheckBoxOfFirstRecordForSignOffandClickOnVerify();
	}
	
	@And("^User click on None under Verify of Record Page$")
	public void User_click_on_None_under_Verify_of_Record_Page() throws Throwable {
		Record_Page.ClickOnNoneUnderVerify();
	}
	
	@Then("^User Validate Record is Signed by Filtering the Record in Record Search$")
	public void User_Validate_Record_is_Signed_by_Filtering_the_Record_in_Record_Search() throws Throwable {
		Record_Page.FilterRecord();
	}
	
	@Then("^User click on click on Card view button$")
    public void user_click_on_click_on_card_view_button() throws Throwable {
		Record_Page.User_click_on_the_CardViewRecord();
    }

    @Then("^User click on click on Record Id link$")
    public void user_click_on_click_on_record_id_link() throws Throwable {
        
    }

    @And("^User click on expand icon in the Card$")
    public void user_click_on_expand_icon_in_the_card() throws Throwable {
        
    }
	
	
	
}