package ebaypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonpom2.homepage;

public class ebayhomepage {
	WebDriver driver;
	@FindBy(xpath="//span[@id='gh-ug-flex']/child::a")WebElement register;
	@FindBy(xpath="//input[@id='firstname']")WebElement firstname;
	@FindBy(xpath="//input[@id='lastname']")WebElement lastname;
	@FindBy(xpath="//input[@id='Email']")WebElement email;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//button[@id='EMAIL_REG_FORM_SUBMIT']")WebElement confirm;
	
	public void confirmclick() {
		confirm.click();
	}
	
	public void passwordfield(String Password) throws InterruptedException {
		password.click();
		Thread.sleep(1000);
		password.clear();
		Thread.sleep(1000);
		password.sendKeys(Password);
	}
	
	public void emailfield(String Email) throws InterruptedException {
		email.click();
		Thread.sleep(1000);
		email.clear();
		Thread.sleep(1000);
		email.sendKeys(Email);
	}
	
	public void lastnamefiled(String Lastname) throws InterruptedException {
		lastname.click();
		Thread.sleep(1000);
		lastname.clear();
		Thread.sleep(1000);
		lastname.sendKeys(Lastname);
	}
	
	public void firstnamefield(String Firstname) throws InterruptedException {
		firstname.click();
		Thread.sleep(1000);
		firstname.clear();
		Thread.sleep(1000);
		firstname.sendKeys(Firstname);
	}
	
	public void registerclick() {
		register.click();
	}
public ebayhomepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
