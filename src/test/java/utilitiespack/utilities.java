package utilitiespack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class utilities {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException  {
	  
  }@Parameters({"browser","url"})
  @BeforeClass
  public void Ibrowsers(String NameOfBrowser,String url) throws InterruptedException {
		
	     String ud=System.getProperty("user.dir");

		if(NameOfBrowser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",ud+"/driver/chromedriver");
			
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(url);
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ud+"/driver/msedgedriver");
			
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get(url);
			Thread.sleep(40000);
			// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}	

}
 

  @AfterClass
  public void afterClass() throws IOException {
	//Screenshot();
	 
  }
 
  public  void Screenshot(String foldername) throws IOException  {
		 String ud=System.getProperty("user.dir");
		 Date datein=new Date();
		 datein.toString().replace(" ","_").replace(":","_");
		File screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(screen,new File(ud+"/Pictures/"+foldername+"/"+datein+"myss.jpg"));
	}
}
