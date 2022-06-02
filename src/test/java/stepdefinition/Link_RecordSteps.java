package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.RecordPage;

public class Link_RecordSteps {
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
	
	@And("^User click on Card view button Record Page$")
	public void User_click_on_Card_view_button_Record_Page() throws Throwable {
		RecordPage.User_click_on_Card_view_button_Record_Page();
	}
	
	@And("^User click on Record Id link in card view page$")
	public void User_click_on_Record_Id_link_in_card_view_page() throws Throwable {
		RecordPage.User_click_on_Record_Id_link_in_card_view_page();
	}
	
	@And("^User Able to see the elements in the popup page in card view page$")
	public void User_Able_to_see_the_elements_in_the_popup_page_in_card_view_page() throws Throwable {
		RecordPage.User_Able_to_see_the_elements_in_the_popup_page_in_card_view_page();
	}
	
//	@And("^User Click on Sign Icon in card view page$")
//	public void User_Click_on_Sign_Icon_in_card_view_page() throws Throwable {
//		RecordPage.User_Click_on_Sign_Icon_in_card_view_page();
//	}
	
	@And("^User click on sign icon without entering data$")
	public void User_click_on_sign_icon_without_entering_data() throws Throwable {
		RecordPage.User_click_on_sign_icon_without_entering_data();
	}
	
	@And("^User click on Downloadicon in popup page$")
	public void User_click_on_Downloadicon_in_popup_page() throws Throwable {
		RecordPage.User_click_on_Downloadicon_in_popup_page();
	}
	
	@And("^User click on edit icon and cancel button in popup page$")
	public void User_click_on_edit_icon_and_cancel_button_in_popup_page() throws Throwable {
		RecordPage.User_click_on_edit_icon_and_cancel_button_in_popup_page();
	} 
	
	@And("^User click on history icon and close icon in popup page$")
	public void User_click_on_history_icon_and_Close_icon_in_popup_page() throws Throwable {
		RecordPage.User_click_on_history_icon_and_Close_icon_in_popup_page();
	
	}
		
	
//	@And("^User click on More Records button in Card view page$")
//	public void User_click_on_More_Records_button_in_Card_view_page() throws Throwable {
//		RecordPage.User_click_on_More_Records_button_in_Card_view_page();
//	}
//	
	@And("^User click on Record Number in Card view page$")
	public void User_click_on_Record_Number_in_Card_view_page() throws Throwable {
		RecordPage.User_click_on_Record_Number_in_Card_view_page();
	}
	
	@And("^User click on close icon$")
	public void User_click_on_close_icon() throws Throwable {
		RecordPage.User_click_on_close_icon();
	}
	
	@And("^User Click on Record Icon in card view page$")
	public void User_Click_on_Record_Icon_in_card_view_page() throws Throwable {
		RecordPage.User_Click_on_Record_Icon_in_card_view_page();
	}
	
	@And("^User click on Record to validate the pdf button$")
	public void User_click_on_Record_to_validate_the_pdf_button() throws Throwable {
		RecordPage.User_click_on_Record_to_validate_the_pdf_button();
	} 
	
	@And("^User click on pdf to Print Record in card view page$")
	public void User_click_on_pdf_to_Print_Record_in_card_view_page() throws Throwable {
		RecordPage.User_click_on_pdf_to_Print_Record_in_card_view_page();
	}
	
	
//	@And("^User Click on Sign on Icon in card view page$")
//	public void User_Click_on_Sign_on_Icon_in_card_view_page() throws Throwable {
//		RecordPage.User_Click_on_Sign_on_Icon_in_card_view_page();
//	}
	
	@And("^User click on Expand icon in Record in Card view page$")
	public void User_click_on_Expand_icon_in_Record_in_Card_view_page() throws Throwable {
		RecordPage.User_click_on_Expand_icon_in_Record_in_Card_view_page();
	}
	
	
	@And("^User click on Record by filtering OEE Events")
	public void User_click_on_Record_by_filtering_OEE_Events() throws Throwable {
		RecordPage.User_click_on_Record_by_filtering_OEE_Events();
	} 
	
//	@And("^User click on Record Number in card view page")
//	public void User_click_on_Record_Number_in_card_view_page() throws Throwable {
//		RecordPage.User_click_on_Record_Number_in_card_view_page();
//	}
	
	
	
}
