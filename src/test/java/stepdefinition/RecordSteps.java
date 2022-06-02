package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.RecordPage;

public class RecordSteps {
	RecordPage RecordPage = new RecordPage();
	
	@And("^User click on Record Under Hamburger in Link HomePage$")
	public void User_click_on_Record_Under_Hamburger_in_Link_HomePage() throws Throwable {
		RecordPage.clickRecordUnderHamburger();
	}
	
	@Then("^User click on Three months under Record Page$")
	public void User_click_on_Three_months_under_Record_Page() throws Throwable {
		RecordPage.clickonThreeMonths();
	}
	
	@And("^User click on SignOff under Verify of Record Page$")
	public void User_click_on_SignOff_under_Verify_of_Record_Page() throws Throwable {
		RecordPage.clickOnSignOffUnderVerify();
	}
	
	@Then("^User select CheckBox Of First Record and SignOff The Record$")
	public void User_select_CheckBox_Of_First_Record_and_SignOff_The_Record() throws Throwable {
		RecordPage.CheckTheCheckBoxOfFirstRecordForSignOffandClickOnVerify();
	}
	
	@And("^User click on None under Verify of Record Page$")
	public void User_click_on_None_under_Verify_of_Record_Page() throws Throwable {
		RecordPage.ClickOnNoneUnderVerify();
	}
	
	@Then("^User Validate Record is Signed by Filtering the Record in Record Search$")
	public void User_Validate_Record_is_Signed_by_Filtering_the_Record_in_Record_Search() throws Throwable {
		RecordPage.FilterRecord();
	}
	
	@And("^User verify all the fields in the Card page$")
	public void User_verify_all_the_fields_in_the_Card_page() throws Throwable {
		RecordPage.User_verify_all_the_fields_in_the_Card_page();
			
		}
	@Then("^User click on the Card View Record$")
	public void User_click_on_the_Card_View_Record() throws Throwable {
		RecordPage.User_click_on_the_CardViewRecord();
	}
	
	@And("^User verify all the fields in the Grid view Page")
	public void  User_verify_all_the_fields_in_the_Grid_view_Page() throws Throwable {
		RecordPage.User_verify_all_the_fields_in_the_Grid_view_Page();
	}

	}
