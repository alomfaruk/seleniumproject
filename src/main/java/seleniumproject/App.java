package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
    {
        System.setProperty("webdriver.edge.driver","/Users/anikhassan/eclipse-workspace/seleniumproject/driver/msedgedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://wwww.amazon.com");
    }
}
