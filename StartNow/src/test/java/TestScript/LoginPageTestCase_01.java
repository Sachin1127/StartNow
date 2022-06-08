package TestScript;

import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import POM_Repositary.LoginPage;


public class LoginPageTestCase_01 extends BaseClass {
	@Test
	 public static void login() throws InterruptedException
	 {
		 driver.get("http://192.168.6.18:501/");
		 LoginPage lp=new LoginPage(driver);
		 
		 lp.id("000001");
		 lp.pass("A");
		 lp.cap();
		 Thread.sleep(5000);
		 lp.sigin();
		// HomePage hp=new HomePage();
		 
		 
	 }
}
