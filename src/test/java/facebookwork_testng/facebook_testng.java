package facebookwork_testng;

import org.testng.annotations.Test;

import com.shams.excel.reader.utilities.Xlsx_Reeader_EAL;

import org.testng.annotations.Test;

import facebook_pom.home_page;
import utilitiespack.utilities;

import org.testng.annotations.DataProvider;

public class facebook_testng extends utilities{
  @Test(dataProvider = "facebookdata")
  public void facebook(String email , String password) throws InterruptedException {
	  home_page ob=new home_page(driver);
	  ob.emailfieldclick(email);
	  Thread.sleep(2000);
	  ob.passfield_action(password);
	  Thread.sleep(1000);
	  ob.login();
	  driver.navigate().back();
	  Thread.sleep(4000);
	  
  }

  @DataProvider
  public Object[][] facebookdata() {
	  String exelfilepath="/Users/anikhassan/eclipse-workspace/seleniumproject/Testdata/facebookdata.xlsx";
	  Xlsx_Reeader_EAL reader=new Xlsx_Reeader_EAL(exelfilepath);
	   Object[][] data=reader.getSheetData("fb");
	   return data;
	  
    
  }
}
