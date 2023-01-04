package amazonpom2;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javascript.javascriptsutilities;

public class homepage {
	WebDriver driver;
@FindBy(xpath="//span[text()='Account & Lists']") WebElement signaccount;
@FindBy(xpath="//div[@id='nav-flyout-ya-newCust']/child::a")WebElement starthere;

public void starthere() throws InterruptedException {
	javascriptsutilities.drawBorderblue(driver, starthere);
	Thread.sleep(1000);
	starthere.click();
}

public void signinaccounthover() {
	Actions act=new Actions(driver);
	act.moveToElement(signaccount).build().perform();
	
}
public homepage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
