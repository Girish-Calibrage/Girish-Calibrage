package pages;


import java.util.Iterator;
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
	String CardViewFirstRecord = null;
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
    By Record_Cardview = By.xpath("//span[text()='Card']");
    By Record_CardViewRecord = By.xpath("//div[@id='hdr_Row1']//a/span");
    By Record_Edit = By.xpath("//span[@class='fa fa-external-link text-info mr-1 p-1 border rounded']");
    By Record_PopUp_EditIcon = By.xpath("//i[@class='fa fa-pencil']");
    By Record_PopUp_Cancel = By.xpath("//button[text()='Cancel']");
    By Record_Edit_PopUp= By.xpath("//i[@class='fa fa-pencil']");
    By Record_PopUp_Submit = By.xpath("//button[text()='SUBMIT']");
    By Record_Edit_Okbutton = By.xpath("//button[text()='OK']");
    By Record_PopUp_History = By.xpath("//i[text()='history']");
    By Record_History_Show = By.xpath("//div[@class='scs-history-hide']");
    By Record_TaskHistory_Show = By.xpath("//div[@class='scs-history-hide task-history']");
    By Record_PopUp_Clear = By.xpath("//div[text()='clear']");
    By Record_GridView = By.xpath("//i[@class='ti-layout-grid4-alt']");
    By Record_OneMonth= By.xpath("//div[@class=' text-primary cursor-pointer']//span[text()='1M']");
	By Record_Groupbybutton= By.xpath("//a[text()='Group']");
    By Record_Verifybutton= By.xpath("//span[@id='label']//a[text()='Verify']");
    By Record_All_Button= By.xpath("//div[@id='All']");
    By Record_Verification= By.xpath("//span[text()='Verifications']");
    By Record_Fields= By.xpath("//span[text()='Fields']");
    By Record_Images= By.xpath("//div[@id='Images']//span[text()='Images']");
    By Record_All= By.xpath("//div[@id='All']");
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
    By Grid_Record = By.xpath("//div[@id='hdr_Row1']//a/span");
    By Grid_Pdf = By.xpath("//a[@id='pdf']");
    By Grid_Print = By.xpath("//div[@id='print']");
    
    
    
    
     
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
		utilities.MediumWait(driver);
	}
	
	
	//CardViewFirstRecord = driver.findElement(CardViewRecord).getText();
	
	
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
	

	public void User_verify_all_the_fields_in_the_Card_page()throws Throwable {
		utilities.webDriverWait(driver, Record_Cardview);
		driver.findElement(Record_Cardview).click();
		
	}
 public void User_click_on_the_CardViewRecord() throws Throwable {
		 utilities.webDriverWait(driver, Record_CardViewRecord);
		 driver.findElement(Record_CardViewRecord).click();
		
		 utilities.webDriverWait(driver, Record_Edit);
		 driver.findElement(Record_Edit).click();
		 utilities.WaitUntilPageIsLoaded(driver);
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
		 utilities.webDriverWait(driver, Record_PopUp_EditIcon);
		 driver.findElement(Record_PopUp_EditIcon).click();
		 utilities.webDriverWait(driver, Record_PopUp_Cancel);
		 driver.findElement(Record_PopUp_Cancel).click();
		 utilities.webDriverWait(driver, Record_Edit_PopUp);
		 driver.findElement(Record_Edit_PopUp).click();
		 utilities.webDriverWait(driver,Record_PopUp_Submit);
		 driver.findElement(Record_PopUp_Submit).click();
		 utilities.webDriverWait(driver, Record_Edit_Okbutton);
		 driver.findElement(Record_Edit_Okbutton).click();
		 utilities.webDriverWait(driver, Record_PopUp_History);
		 driver.findElement(Record_PopUp_History).click();
		 utilities.webDriverWait(driver, Record_History_Show);
		 driver.findElement(Record_History_Show).click();
		 utilities.webDriverWait(driver, Record_TaskHistory_Show);
		 driver.findElement(Record_TaskHistory_Show).click();
		 utilities.webDriverWait(driver, Record_PopUp_Clear);
		 driver.findElement(Record_PopUp_Clear).click();
     }
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
		utilities.webDriverWait(driver, Record_Images);
		driver.findElement(Record_Images).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_All);
		driver.findElement(Record_All).click();
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, Record_Calendar);
		driver.findElement(Record_Calendar).click();
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


public void User_click_on_the_Record_in_the_Grid_view_Page() throws Throwable{
	utilities.webDriverWait(driver, Grid_Record);
	driver.findElement(Grid_Record).click();
	utilities.MediumWait(driver);
	utilities.webDriverWait(driver, Grid_Print);
	driver.findElement(Grid_Print).click();
	utilities.MediumWait(driver);
	
}
}



