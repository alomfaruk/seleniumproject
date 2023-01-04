package amazon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shams.excel.reader.utilities.Xlsx_Reeader_EAL;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazonpom2.homepage;
import amazonpom2.signinpage;
import utilitiespack.utilities;

public class Test_amazon extends utilities {
  @Test(dataProvider ="amazondata")
  public void testamazon(String Name ,String Email,String Password,String Repassword) throws InterruptedException {
	  homepage ob=new homepage(driver);
	  ob.signinaccounthover();
	  ob.starthere();
	  signinpage ob1=new signinpage(driver);
	  ob1.namefield(Name);
	  Thread.sleep(1000);
	  ob1.emailfield(Email);
	  Thread.sleep(1000);
	  ob1.passwordfield(Password);
	  Thread.sleep(1000);
	  ob1.repasswordfield(Repassword);
	  Thread.sleep(1000);
	  ob1.continuebuttonclick();
	  Thread.sleep(2000);
  }
  @DataProvider
  public Object[][] amazondata() {
	  String excellsheet="/Users/anikhassan/eclipse-workspace/seleniumproject/Testdata/Testdata2.xlsx";
	  Xlsx_Reeader_EAL reader=new Xlsx_Reeader_EAL(excellsheet);
	  Object[][]data= reader.getSheetData("amazon");
	  return data;
  }
 
}
