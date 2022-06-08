package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
public static WebDriver driver;


@BeforeMethod
public void openbrowser() {
	System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}
}
