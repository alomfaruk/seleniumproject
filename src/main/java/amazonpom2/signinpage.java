package amazonpom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='ap_customer_name']")WebElement name;
	@FindBy(xpath="//input[@id='ap_email']") WebElement email;
	@FindBy(xpath="//input[@id='ap_password']") WebElement password;
	@FindBy(xpath="//input[@id='ap_password_check']") WebElement repassword;
	@FindBy(xpath="//input[@id='continue']") WebElement continuebutton;
	
	public void continuebuttonclick() throws InterruptedException {
		continuebutton.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	public void repasswordfield(String Repassword) throws InterruptedException {
		repassword.click();
		Thread.sleep(1000);
		repassword.clear();
		Thread.sleep(1000);
		repassword.sendKeys(Repassword);
	}
	
	public void passwordfield(String Password) throws InterruptedException {
		password.click();
		Thread.sleep(1000);
		password.clear();
		password.sendKeys(Password);
	}
	
	
	public void emailfield (String Email) throws InterruptedException {
		email.click();
		Thread.sleep(1000);
		email.clear();
		Thread.sleep(1000);
		email.sendKeys(Email);
	}
	
	public void namefield(String Name) throws InterruptedException {
		name.click();
		Thread.sleep(1000);
		name.clear();
		Thread.sleep(1000);
		name.sendKeys(Name);
	}
	public signinpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
