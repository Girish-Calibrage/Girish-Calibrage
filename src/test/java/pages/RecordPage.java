package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.Utilities;

public class RecordPage extends DriverFactory{
	Utilities utilities = new Utilities();
	String RecordName = null;
	String CardView_RecordNumber = null;
	By linkhamburgericon = By.xpath("//i[@id='SidebarTogglerIcon']");
	By records = By.xpath("//div[@id='MenuWrapper']//span[text()='Records']");
	By SearchLocationsEditField = By.xpath("//input[@class='form-control sc-gbl']");
	By ThreeMonths = By.xpath("//span[@id='DaysAgo']//ol[@id='DateFilterSelect']/..//span[contains(text(),'3M')]");
	By ThreeMonthsDatepicker = By.xpath("//span[@id='DaysAgo']/following-sibling::span[@id='DateRangePicker']//span[text()='Since 90 Days Ago' or text()='Select a Range']");
	By Record_Verify = By.xpath("//a[text()='Verify']");
	By Record_Verify_SignOff = By.xpath("//a[text()='Signoff']");
	By Record_Verify_None = By.xpath("//ol[@id='verify']//a[text()='None']");
	By Record_SignOff_FirstRecord = By.xpath("//table[@id='DataRecordsGrid']//tbody/tr[1]/td[1]");
	By Record_SignOff_RecordName = By.xpath("//table[@id='DataRecordsGrid']//tbody/tr[1]/td[3]//a/span");
	By Record_Sign = By.xpath("//div[@id='BottomBar']/span[@id='btnSign']");
	By Record_SignOffPopup_Comment = By.xpath("//span[@id='HIdMoreCSS']/../following-sibling::div[@id='PopVerify_rdModalShade']/following-sibling::div[@id='PopVerify']//textarea[@id='selVerifyComment']");
	By Record_SignOffPopup_Sign = By.xpath("//span[@id='HIdMoreCSS']/../following-sibling::div[@id='PopVerify_rdModalShade']/following-sibling::div[@id='PopVerify']//span[text()='SIGN']");
	By Filters = By.xpath("//span[text()='Filters']");
	By Filter_AdditionalFilters_RecordSearch = By.xpath("//div[@id='xFilterList2xx']//span[text()='Record Search']");
	By Filter_AdditionalFilters_RecordSearch_RecordName_EditField = By.xpath("//input[@id='RecordNameFilter']");
	By Filter_ApplyAll = By.xpath("//span[text()='Apply All']");
	By Record_Signed_Validation = By.xpath("//table[@id='DataRecordsGrid']//tbody/tr[1]/td[11]//i[@class='fa fa-check text-deeporange-500']");
	By Record_Signed_VerificationsAndSignOffs = By.xpath("//span[text()='Verifications and Sign Offs']/../following-sibling::span//span[text()='Signoff']/../following::div//span[text()=' : Entered Comments through Automation Script']");
	By Card = By.xpath("//div[@id='Card']");

	
	By Recordnum = By.xpath("//div[@id='hdr_Row1']//a/span");
	By Record_id = By.xpath("//span[text()='Record']/..//span[@class='fa fa-external-link text-info mr-1 p-1 border rounded']");
	
	
	By Record_sign = By.xpath("//i[@class='fa fa-pencil-square-o']");
	By Record_text = By.xpath("//div[@id='scs-signoffpopup-commentsfield']/textarea");
	By Record_submit = By.xpath("//div//span[text()='SIGN']");
	
	
	
    
    
	By More = By.xpath("//span[@id='DataRecords-NextPageCaption']");
	By FilterClose = By.xpath("/html//span[@id='SideRecords']//div[@id='divHeader']/a[@href='javascript:void(0);']/span[@class='cd-panel-close sc-gbl']");
	By Recordnumlink = By.xpath("//span[text()='Record']/..//span[@class='fa fa-external-link text-info mr-1 p-1 border rounded']");
	
	By Record_SideFilters = By.xpath("//span[text()='Filters']");
	By Record_SideFilters_Forms = By.xpath("//div[@id='SingleFilter_Row1']//span[text()='Forms']");
	By Record_SideFilters_Forms_OEEEvents = By.xpath("//a[text()='OEE Events']/../preceding-sibling::td[@id='Fast_Row1']");
	
    By Recordlink1 = By.xpath("//span[@class='text-white']/span[contains(text(),'BatchID =')]/..//span[contains(text(),'Event Type =')]/..//span[contains(text(),'Reason for Slowdown =')]/..//span[contains(text(),'Shift =')]/..//span[contains(text(),'Slowdown Event Type =')]/..//span[contains(text(),'Source of Slowdown =')]/ancestor::tr ");
	By Record_signon = By.xpath("//div[@id='clickArea']/div[1]//rdcondelement2/span/span[2]");
	By Record_popup = By.xpath("//div//span/i[@class='fa fa-pencil-square-o']");
	By Record_empty_text = By.xpath("//div[@id='scs-signoffpopup-button-sign']");
	By Record_signin = By.xpath("//i[@class='fa fa-pencil-square-o']");
	By Record_sign_Cancel = By.xpath("//div[@id='scs-signoffpopup-cancelbutton']/span[.='CANCEL']");
	By Record_Download = By.xpath("//span//i[@class='fa fa-download']");
	By Record_Edit = By.xpath("//i[@class='fa fa-pencil']");
	By Record_cancel = By.xpath("//button[text()='Cancel']");
	By Record_history = By.xpath("//span//i[@class = 'material-icons']");
    By Record_cancel_icon = By.xpath("//div//div[@id= 'scs-signoffpopup-close']");
	By Record_button = By.xpath("/html//table[@id='DataRecords']/tbody/tr[3]/td//div[@class='card-header card-header-thin']/div");
	By Record_pdf_button = By.xpath("/html//table[@id='DataRecords']/tbody/tr[3]/td/div//div[@class='px-1']/div[1]/a[@href='javascript:void(0);']//span[.='View PDF']");
	By Record_id_panel = By.xpath("//span[@id='yui_3_1_1653056248150_6337']");
	By Record_Filter_pdf = By.xpath("//span[text()='Print']");
	
	
	//grid
	
	By Record_GridView= By.xpath("//i[@class='ti-layout-grid4-alt']");
	By Record_OneMonth= By.xpath("//div[@class=' text-primary cursor-pointer']//span[text()='1M']");
	By Record_Groupbybutton= By.xpath("//a[text()='Group']");
    By Record_Verifybutton= By.xpath("//span[@id='label']//a[text()='Verify']");
    By Record_All_Button= By.xpath("//div[@id='All']");
    By Record_Verification= By.xpath("//span[text()='Verifications']");
    By Record_Fields= By.xpath("//span[text()='Fields']");
    By Record_Images= By.xpath("//span[text()='Images']");
    By Record_All= By.xpath("//div//span[text()='All']");
    By Record_Calendar= By.xpath("//div[@id='Date']");
    By Record_Excel= By.xpath("//span[text()='Excel']"); 
    By Record_CSV= By.xpath("//div[@id='CSV']");
    By Record_Fail_List= By.xpath("//div//th[@id='Fail-TH']");
    By Record_column= By.xpath("//span[text()='Record']");
    By Record_Date= By.xpath("//span[text()='Date']");
    By Record_Time= By.xpath("//span[text()='Time']");
    By Record_Task= By.xpath("//span[text()='Task']");
    By Record_Location= By.xpath("//span[text()='Location']");
    By Record_Form= By.xpath("//span[text()='Form']");
    By Record_Resource= By.xpath("//span[text()='Resource']");
    By Record_User= By.xpath("//span[text()='User']");
    By Record_Chart= By.xpath("//span[text()='Chart']");
    By Record_Signed= By.xpath("//span[text()='Signed']");
    By Record_Hist= By.xpath("//span[text()='Hist']");
    By Record_Img= By.xpath("//span[text()='Img']");
    By Record_Groupby_none= By.xpath("//a[text()='None']");
    By Record_Groupby_Form= By.xpath("//a[text()='By Form Name']");
	By Record_Groupby_Resource= By.xpath("//a[text()='By Resource Name']");
	By Record_Groupby_BatchID= By.xpath("//a[text()='BatchID']");
	By Record_Groupby_Case_No= By.xpath("//a[text()='Case No']");
	By Record_Groupby_Donor_Being_Checked= By.xpath("//a[text()='Donor Being Checked']");
	By Record_Groupby_DonorID= By.xpath("//a[text()='Donor ID']");
	By Record_Groupby_Donor_Product_Description= By.xpath("//a[text()='Donor Product Description']");
	By Record_Groupby_Event_Type= By.xpath("//a[text()='Event Type']");
	By Record_Groupby_Item_Code= By.xpath("//a[text()='Item Code']");
	By Record_Groupby_Line= By.xpath("//a[text()='Line']"); 
	By Record_Groupby_Product_Code_Date= By.xpath("//a[text()='Product Code Date']");
	By Record_Groupby_RunID= By.xpath("//a[text()='Run ID']");
	By Record_Groupby_Shift= By.xpath("//a[text()='Shift']");
	By Record_Groupby_Source_of_Reject= By.xpath("//a[text()='Source of Reject']");
	By Record_Stage= By.xpath("//a[text()='Stage']");
	By Record_Test_Trainshort= By.xpath("//a[text()='TestTrainshort']");
	By Record_urgency= By.xpath("//a[text()='Urgency']");
	By Record_verify_signoff= By.xpath("//div//a[text()='Signoff']");
	
	
	
	
	
	
	
	
	
	By sign_in_icon = By.xpath("//span[text()='Show Signed']");
	
	public void clickRecordUnderHamburger()throws Throwable {
		utilities.webDriverWait(driver, linkhamburgericon);
		driver.findElement(linkhamburgericon).click();
		utilities.MinimumWait(driver);
		driver.findElement(records).click();
		utilities.MediumWait(driver);
	}
	
	public void clickonThreeMonths()throws Throwable {
		utilities.webDriverWait(driver, ThreeMonths);
		driver.findElement(ThreeMonths).click();
		utilities.webDriverWait(driver, ThreeMonthsDatepicker);
		driver.findElement(ThreeMonthsDatepicker).click();
		utilities.MinimumWait(driver);
		driver.findElement(ThreeMonthsDatepicker).click();
	}
	
	public void clickOnSignOffUnderVerify()throws Throwable {
		utilities.webDriverWait(driver, Record_Verify);
		driver.findElement(Record_Verify).click();
		utilities.webDriverWait(driver, Record_Verify_SignOff);
		driver.findElement(Record_Verify_SignOff).click();
		utilities.MaximumWait(driver);
	}
	
	public void CheckTheCheckBoxOfFirstRecordForSignOffandClickOnVerify()throws Throwable {
		utilities.webDriverWait(driver, Record_SignOff_FirstRecord);
		RecordName = driver.findElement(Record_SignOff_RecordName).getText();
		driver.findElement(Record_SignOff_FirstRecord).click();
		for(int i=0;i<7;i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			utilities.MediumWait(driver);
		}
		
		utilities.webDriverWait(driver, Record_Sign);
		driver.findElement(Record_Sign).click();
		utilities.webDriverWait(driver, Record_SignOffPopup_Comment);
		driver.findElement(Record_SignOffPopup_Comment).sendKeys("Entered Comments through Automation Script");
		utilities.webDriverWait(driver, Record_SignOffPopup_Sign);
		driver.findElement(Record_SignOffPopup_Sign).click();
		utilities.MediumWait(driver);
	}
	
	public void ClickOnNoneUnderVerify()throws Throwable {
		utilities.webDriverWait(driver, Record_Verify);
		utilities.MaximumLongWait(driver);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(Record_Verify);
		action.moveToElement(element).click().perform();
		utilities.webDriverWait(driver, Record_Verify_None);
		driver.findElement(Record_Verify_None).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Verify);
	}
	
	public void FilterRecord()throws Throwable {
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Filter_AdditionalFilters_RecordSearch);
		driver.findElement(Filter_AdditionalFilters_RecordSearch).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Filter_AdditionalFilters_RecordSearch_RecordName_EditField);
		driver.findElement(Filter_AdditionalFilters_RecordSearch_RecordName_EditField).sendKeys(RecordName);
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, By.xpath("//a[text()='"+RecordName+"']"));
		driver.findElement(By.xpath("//a[text()='"+RecordName+"']")).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Filter_ApplyAll);
		driver.findElement(Filter_ApplyAll).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Signed_Validation);
		driver.findElement(Record_Signed_Validation).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Signed_VerificationsAndSignOffs);
		driver.findElement(Record_Signed_VerificationsAndSignOffs).click();
		
	}

	public void User_click_on_Card_view_button_Record_Page() throws Throwable {
		utilities.webDriverWait(driver, Card);
		driver.findElement(Card).click();
		utilities.MaximumWait(driver);
	
	}

	public void User_click_on_Record_Number_in_Card_view_page() throws Throwable {
		utilities.webDriverWait(driver, Recordnum);
		driver.findElement(Recordnum).click();
		utilities.MediumWait(driver);
	
	}
	
	
	public void User_click_on_Record_Id_link_in_card_view_page() throws Throwable {
		utilities.webDriverWait(driver, Record_id);
		driver.findElement(Record_id).click();
		utilities.MediumWait(driver);
		
	}


	
	
	
	
	
	
	
	
	public void User_click_on_More_Records_button_in_Card_view_page() throws Throwable {
		utilities.webDriverWait(driver, More);
		driver.findElement(More).click();
		for(int i=0;i<12;i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
		utilities.MaximumWait(driver);
		
	}
	}
	
	
	public void User_click_on_close_icon() throws Throwable {
		utilities.webDriverWait(driver, FilterClose);
		driver.findElement(FilterClose).click();
		utilities.MaximumWait(driver); 
				
	}

	public void User_click_on_Expand_icon_in_Record_in_Card_view_page() throws Throwable {
		utilities.webDriverWait(driver, Recordlink1);
		List<WebElement> elements = driver.findElements(Recordlink1);
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("row"));
	      String RowNumber = elements.get(i).getAttribute("row");
	      utilities.webDriverWait(driver, Recordlink1);
	      if(driver.findElement(By.xpath("//table[@id='DataRecords']//td["+RowNumber+"]//span[@id='lblSubmitted_Date_Row"+RowNumber+"']")).isDisplayed()) {
	    	driver.findElement(By.xpath("//table[@id='DataRecords']//td["+RowNumber+"]//span[@id='lblSubmitted_Date_Row"+RowNumber+"']")).click();
	  		utilities.MaximumWait(driver);
	  		driver.findElement(By.xpath("//table[@id='DataRecords']//td["+RowNumber+"]//span[@id='lblSubmitted_Date_Row"+RowNumber+"']")).click();
	  		break;
	      }
	    }
	}
		
	public void User_click_on_Record_by_filtering_OEE_Events() throws Throwable {
		utilities.webDriverWait(driver, Record_SideFilters);
		utilities.PerformClickUsingJavaScriptExecutor(driver, Record_SideFilters);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_SideFilters_Forms);
		driver.findElement(Record_SideFilters_Forms).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_SideFilters_Forms_OEEEvents);
		driver.findElement(Record_SideFilters_Forms_OEEEvents).click();
		utilities.MaximumWait(driver);
		
		for(int k=0;k<15;k++) {
			utilities.MaximumWait(driver);
			List<WebElement> elements = driver.findElements(Recordlink1);
		    System.out.println("Number of elements:" +elements.size());
		    if(elements.size()==0) {
		    	driver.findElement(By.xpath("//span[text()='MORE RECORDS']")).click();
		    }
		    else {
		    	utilities.MediumWait(driver);
		    	break;
		    }
		}
		
		List<WebElement> elements = driver.findElements(Recordlink1);
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("row"));
	      String RowNumber = elements.get(i).getAttribute("row");
	      utilities.webDriverWait(driver, Recordlink1);
	      if(driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).isDisplayed()) {
	    	CardView_RecordNumber = driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).getText();
	    	utilities.PerformClickUsingJavaScriptExecutor(driver, By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']"));
//	    	driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).click();
	  		utilities.webDriverWait(driver, By.xpath("//span[@class='pl-2 ']/span[text()='"+CardView_RecordNumber+"']"));
	  		break;
	      }
	    }
	    
	    driver.findElement(By.xpath("//span[@class='pl-2 ']/span[text()='"+CardView_RecordNumber+"']")).click();
	}

	
	public void User_Click_on_Record_Icon_in_card_view_page() throws Throwable {
		utilities.webDriverWait(driver, Recordlink1);
		List<WebElement> elements = driver.findElements(Recordlink1);
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("row"));
	      String RowNumber = elements.get(i).getAttribute("row");
	      utilities.webDriverWait(driver, Recordlink1);
	      if(driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).isDisplayed()) {
		    	CardView_RecordNumber = driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).getText();
		    	driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).click();
		  		utilities.webDriverWait(driver, By.xpath("//span[@class='pl-2 ']/span[text()='"+CardView_RecordNumber+"']"));
		  		break;
		      }
	    }
	    
	    driver.findElement(By.xpath("//span[@class='pl-2 ']/span[text()='"+CardView_RecordNumber+"']")).click();
	    utilities.webDriverWait(driver, Record_signon);
		driver.findElement(Record_signon).click();
		utilities.MaximumWait(driver);
	    
	      	    
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
			}
		}
	}
		
		
		public void User_Able_to_see_the_elements_in_the_popup_page_in_card_view_page() throws Throwable {
			utilities.webDriverWait(driver, Record_popup);
			driver.findElement(Record_popup).click();
			utilities.MaximumWait(driver);
			
		}
		public void User_click_on_sign_icon_without_entering_data() throws Throwable { 
			utilities.webDriverWait(driver, Record_empty_text);
			driver.findElement(Record_empty_text).click();
			utilities.MediumWait(driver);
			utilities.webDriverWait(driver, Record_sign);
			driver.findElement(Record_sign).click();
			utilities.MaximumWait(driver);
			utilities.webDriverWait(driver, Record_text);
			driver.findElement(Record_text).sendKeys("Test");
			utilities.MaximumWait(driver);
			utilities.webDriverWait(driver, Record_submit);
			driver.findElement(Record_submit).click();
			utilities.MediumWait(driver);
			utilities.webDriverWait(driver, Record_signin);
			driver.findElement(Record_signin).click();
			utilities.MaximumWait(driver);
			utilities.webDriverWait(driver, Record_sign_Cancel);
			driver.findElement(Record_sign_Cancel).click();
			utilities.MediumWait(driver);
			          
			}
	
	
	public void User_click_on_Downloadicon_in_popup_page() throws Throwable {
		utilities.webDriverWait(driver, Record_Download);
		driver.findElement(Record_Download).click();
		utilities.MediumWait(driver);
	}

	public void User_click_on_edit_icon_and_cancel_button_in_popup_page() throws Throwable {
		utilities.webDriverWait(driver, Record_Edit);
		driver.findElement(Record_Edit).click();
		utilities.MaximumWait(driver); 
		utilities.webDriverWait(driver, Record_cancel);
		driver.findElement(Record_cancel).click();
		utilities.MaximumWait(driver); 
		
	}

	public void User_click_on_history_icon_and_Close_icon_in_popup_page() throws Throwable {
		utilities.webDriverWait(driver, Record_history);
		driver.findElement(Record_history).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_cancel_icon);
		driver.findElement(Record_cancel_icon).click();
		utilities.MaximumWait(driver); 
		
		
	}

	public void User_click_on_Record_to_validate_the_pdf_button() throws Throwable {
		utilities.webDriverWait(driver, Recordlink1);
		List<WebElement> elements = driver.findElements(Recordlink1);
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("row"));
	      String RowNumber = elements.get(i).getAttribute("row");
	      utilities.webDriverWait(driver, Recordlink1);
	      if(driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).isDisplayed()) {
	    	  driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@id='lblSubmitted_Date_Row"+RowNumber+"']")).click();
		    	utilities.MaximumWait(driver);  
	    	driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@id='lblSubmitted_Date_Row"+RowNumber+"']/ancestor::tr//span[text()='View PDF']")).click();
	    	utilities.MaximumWait(driver);
			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					utilities.MaximumLongWait(driver);
				}
			}
			driver.close();
			utilities.MediumWait(driver);
			driver.switchTo().window(parent);
	  		break;
	      }
	    }
	    
		
		
    }

	public void User_click_on_pdf_to_Print_Record_in_card_view_page() throws Throwable {
		utilities.webDriverWait(driver, Recordlink1);
		List<WebElement> elements = driver.findElements(Recordlink1);
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("row"));
	      String RowNumber = elements.get(i).getAttribute("row");
	      utilities.webDriverWait(driver, Recordlink1);
	      if(driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).isDisplayed()) {
	    	CardView_RecordNumber = driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).getText();
	    	driver.findElement(By.xpath("//table[@id='DataRecords']//td[@id='RecordCard_Row"+RowNumber+"']//span[@class=' text-primary cursor-pointer pl-1']")).click();
	  		utilities.webDriverWait(driver, By.xpath("//span[@class='pl-2 ']/span[text()='"+CardView_RecordNumber+"']"));
	  		utilities.MaximumWait(driver);
	  		break;
	      }
	    }
	    
	    utilities.PerformClickUsingJavaScriptExecutor(driver, Record_Filter_pdf);
		utilities.MaximumWait(driver);
		
	}

	
	
	//grid
	
	public void User_verify_all_the_fields_in_the_Grid_view_Page() throws Throwable {
		utilities.webDriverWait(driver, Record_OneMonth);
		driver.findElement(Record_OneMonth).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Record_Groupbybutton);
		driver.findElement(Record_Groupbybutton).click();
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver, Record_Verifybutton);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Verification);
		driver.findElement(Record_Verification).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Fields);
		driver.findElement(Record_Fields).click();
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver, Record_Images);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_All);
		driver.findElement(Record_All).click();
		utilities.MaximumLongWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver, Record_Calendar);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Excel);
		driver.findElement(Record_Excel).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_CSV);
		driver.findElement(Record_CSV).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Fail_List);
		driver.findElement(Record_Fail_List).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_column);
		driver.findElement(Record_column).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Date);
		driver.findElement(Record_Date).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Time);
		driver.findElement(Record_Time).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Task);
		driver.findElement(Record_Task).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Location);
		driver.findElement(Record_Location).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Form);
		driver.findElement(Record_Form).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Resource);
		driver.findElement(Record_Resource).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_User);
		driver.findElement(Record_User).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Chart);
		driver.findElement(Record_Chart).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Signed);
		driver.findElement(Record_Signed).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Hist);
		driver.findElement(Record_Hist).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Img);
		driver.findElement(Record_Img).click();
		utilities.MaximumWait(driver);
	} 
	
	public void User_Verify_all_fields_in_group_and_verify_dropdown_in_Grid_view_Page() throws Throwable { 
		
		utilities.webDriverWait(driver, Record_GridView);
		driver.findElement(Record_GridView).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Groupbybutton);
		driver.findElement(Record_Groupbybutton).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver,  Record_Groupby_none );
	 	driver.findElement(Record_Groupby_none).click();
	 	utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Form );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Resource );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_BatchID );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Case_No );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Donor_Being_Checked );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_DonorID );
		utilities.MaximumWait(driver); 
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Donor_Product_Description );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Event_Type );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Item_Code );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Line );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Product_Code_Date );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_RunID );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Shift );
	    utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Groupby_Source_of_Reject );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Stage );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Test_Trainshort );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_urgency );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_Verifybutton );
		utilities.MaximumWait(driver);
		utilities.PerformClickUsingJavaScriptExecutor(driver,  Record_verify_signoff );
		utilities.MaximumWait(driver);

	}
	
  }


     	
	
	
	
	
	
	
	
	
	










	
	
	
	

//	public void User_Click_on_Sign_Icon_in_card_view_page() throws Throwable {
//		utilities.webDriverWait(driver, Record_popup_window);
//		driver.findElement(Record_popup_window).click();
//		utilities.MediumWait(driver);
//		
//	}

 

		


	

	
		
