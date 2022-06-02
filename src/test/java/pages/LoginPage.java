package pages;

import util.Utilities;
import org.openqa.selenium.By;
import util.DriverFactory;


public class LoginPage extends DriverFactory{
	Utilities utilities = new Utilities();
	By txtUsername = By.cssSelector("input#Username");
	By txtPassword = By.cssSelector("input#Password");
	By btnLogin = By.xpath("//button[@value='login']");
	By Details = By.xpath("//div[contains(text(),'Details')]");
	By validationmsg = By.xpath("//span[text()='Please enter username and password']");
	By incorrectpasswordmsg = By.xpath("//span[text()='Incorrect User Name / Password combination. Your account will be locked after 9 more invalid login attempt(s).']");
	By incorrectusernamemsg = By.xpath("//span[text()='Incorrect User Name / Password combination. Please try again.']");
	By passwordhelp = By.xpath("//a[@class='passwordHelp']");
	By btnsubmit = By.xpath("//button[text()='SUBMIT']");
	By contactsupport = By.xpath("//a[text()='Contact Support']");
	By returntologin = By.xpath("//a[text()='Return to Login']");
	By rememberme = By.xpath("//input[@id='RememberLogin']");
	public void User_login_into_SIMS() throws Throwable {
		driver.get(prop.getProperty("url"));
		}
	
	public void enterUserNameAndPassword() throws Throwable {
		utilities.webDriverWait(driver, txtUsername);
        boolean ElementPresent = driver.findElements(txtUsername).size()>0;
        if(ElementPresent) {
        driver.findElement(txtUsername).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(txtPassword).sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
        }
	}
	
	public void entervalidUserNameAndinvalidPassword() throws Throwable {
		utilities.webDriverWait(driver, txtUsername);
        boolean ElementPresent = driver.findElements(txtUsername).size()>0;
        if(ElementPresent) {
        driver.findElement(txtUsername).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(txtPassword).sendKeys("abcd");
		Thread.sleep(1000);
        }
	}
	
	public void enterinvalidUserNameAndvalidPassword() throws Throwable {
		utilities.webDriverWait(driver, txtUsername);
        boolean ElementPresent = driver.findElements(txtUsername).size()>0;
        if(ElementPresent) {
        driver.findElement(txtUsername).sendKeys("abcd");
		Thread.sleep(1000);
		driver.findElement(txtPassword).sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
        }
	}
	
	public void clickLoginBtn() throws Throwable {
		boolean ElementPresent = driver.findElements(btnLogin).size()>0;
        if(ElementPresent) {
        	driver.findElement(btnLogin).click();
        	utilities.WaitUntilPageIsLoaded(driver);
        	
        	
        }
	}
	
	public void NavigatedToHomePage() throws Throwable {
		utilities.webDriverWait(driver, Details);
		Boolean isPresent = driver.findElements(Details).size()>0;
		if (isPresent) {
			utilities.webDriverWait(driver, Details);
			driver.findElement(Details).click();
		}
	}
	
	public void validationmsg() throws Throwable {
		
        	utilities.webDriverWait(driver, validationmsg);
        	driver.findElement(validationmsg).click();
        	
        	
        }
	
	public void incorrectpasswordmsg() throws Throwable {
    	utilities.webDriverWait(driver, incorrectpasswordmsg);
    	driver.findElement(incorrectpasswordmsg).getText();
 
    }
	
	public void incorrectusernamemsg() throws Throwable {
    	utilities.webDriverWait(driver, incorrectusernamemsg);
    	driver.findElement(incorrectusernamemsg).getText();
 
    }
	
	public void passwordhelp() throws Throwable {
    	utilities.webDriverWait(driver, passwordhelp);
    	driver.findElement(passwordhelp).click();
    	utilities.webDriverWait(driver, btnsubmit);
    	driver.findElement(btnsubmit).click();
    	utilities.webDriverWait(driver, contactsupport);
    	driver.findElement(contactsupport).click();
    	driver.navigate().back();
    	driver.navigate().back();
    	utilities.webDriverWait(driver, returntologin);
    	driver.findElement(returntologin).click();
    	utilities.webDriverWait(driver, rememberme);
    	driver.findElement(rememberme).click();
    }
	
	}



