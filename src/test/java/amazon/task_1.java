package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import amazonpom.homepage;
import utilitiespack.utilities;

import org.testng.annotations.Test;

public class task_1 extends utilities {
  @Test
  public void f() throws InterruptedException {
	WebElement bestseller=driver.findElement(By.xpath("Amazon Basics"));
	Thread.sleep(2000);
	bestseller.click();
	  
  }
}
