package TestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import POM_Repositary.HomePage;
import POM_Repositary.LoginPage;


public class LoginPageTestCase_01 extends BaseClass {
	@Test
	 public static void login() throws InterruptedException
	 {
		 driver.get("http://192.168.6.18:501/");
		 LoginPage lp=new LoginPage(driver);
		 
		 lp.id("000851");
		 lp.pass("A");
		 lp.cap();
		 Thread.sleep(5000);
		 lp.sigin();
		 HomePage hp=new HomePage(driver);
		 hp.ess();
		 hp.lr();
		 hp.reqbtn();
		 hp.empdetails();
		 hp.empName();
		 hp.reqtype();
		 hp.reqnam();
		 hp.leavetye();
		 hp.caslve();
		 hp.startdate();
		 hp.startdatesel();
		 WebElement ele = hp.enddate();
		
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", ele);
		 
		 hp.enddatesel();
		 hp.reason("dsfdfdfgsdfgsd");
		 
		WebElement ele2 = hp.chosbtn();
		 js.executeScript("arguments[0].click();", ele2);
	hp.sub(); 	 
	 }
}
