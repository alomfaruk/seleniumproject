package facebookwork_testng;

import org.testng.annotations.Test;
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
    return new Object[][] {
      new Object[] { "abc1@gmail", "abc123" },
      new Object[] { "abc2@gmail", "abc234" },
      new Object[] { "abc3@gmail", "abc345" },
    };
  }
}
