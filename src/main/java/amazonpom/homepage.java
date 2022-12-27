package amazonpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javascript.javascriptsutilities;

public class homepage {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Amazon Basics']") WebElement amazonbasic;
	
	public void amazonbasicclick() {
	
		amazonbasic.click();
		
	}
	

}
