package ebay;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.shams.excel.reader.utilities.Xlsx_Reeader_EAL;

import ebaypom.ebayhomepage;
import utilitiespack.utilities;

import org.testng.annotations.DataProvider;

public class ebaytest extends utilities {
  @Test(dataProvider = "ebaydata")
  public void test4(String Firstname, String Lastname,String Email,String Password ) throws InterruptedException {
	  ebayhomepage ob=new ebayhomepage(driver);
	  ob.registerclick();
	  Thread.sleep(2000);
	  ob.firstnamefield(Firstname);
	  Thread.sleep(1000);
	  ob.lastnamefiled(Lastname);
	  Thread.sleep(1000);
	  ob.emailfield(Email);
	  Thread.sleep(1000);
	  ob.passwordfield(Password);
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(3000);
  }

  @DataProvider
  public Object[][] ebaydata() {
	  String excellsheet="/Users/anikhassan/eclipse-workspace/seleniumproject/Testdata/Testdata3.xlsx";
   Xlsx_Reeader_EAL reader=new Xlsx_Reeader_EAL(excellsheet);
   Object[][]data= reader.getSheetData("ebay");
   return data;
   
  }
}
