package facebook_pom;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
public   WebDriver driver;
@FindBy(name="email") WebElement emailfield;
@FindBy(name="pass") WebElement passfield;
@FindBy(name="login") WebElement loginbutton;


public void emailfieldclick(String eamil) {
	emailfield.click();
	emailfield.clear();
	emailfield.sendKeys(eamil);
}
public void passfield_action(String password) throws InterruptedException {
	passfield.click();
	Thread.sleep(1000);
	passfield.sendKeys(password);
	Thread.sleep(2000);
}
public void login() {
	loginbutton.click();
}
public home_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
