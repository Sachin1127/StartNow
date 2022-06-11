package POM_Repositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//Employment Self Service	
	//span[text()='Employee Self Service ']	
@FindBy(xpath="(//a[@class='dropdown-toggle'])[11]")
public WebElement ess;

//Leave Request
//span[text()='Leave Request']
@FindBy(xpath="//span[text()='Leave Request']")
public WebElement lr;

//Request Btn
@FindBy(xpath="//input[@id='btnNewLeaveRequest']")
public WebElement reqbtn;


//Employment Details
@FindBy(xpath="//div[@id='ddlEmpId_chosen']/a")
public WebElement empdetails;

//Request Type
//input[@class='chosen-search-input']
@FindBy(xpath="//div[@id='ddlEmpId_chosen']/div/ul/li[4]")
public WebElement empName;

//Request Type Select
//div[@id='ddlLeaveGround_chosen']/a
@FindBy(xpath="//div[@id='ddlLeaveGround_chosen']/a")
public WebElement reqtype;

//Request Name
@FindBy(xpath="//div[@id='ddlLeaveGround_chosen']/div/ul/li[3]")
public WebElement reqnam;

//Leave Type Select
@FindBy(xpath="(//a[@class='chosen-single'])[3]")

public WebElement leavetye;

//Casual Leave
@FindBy(xpath="//div[@id='ddlLeaveType_chosen']/div/ul/li[2]")
public WebElement caslve; 


//Start Date
@FindBy(xpath="//input[@id='txtLeaveStartDate']")
public WebElement startdate;

//Start Date Select
@FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr/td[7]/a")
public WebElement startdatesel;

//End Date
//input[@id='txtLeaveEndDate']
@FindBy(id="txtLeaveEndDate")
public WebElement enddate;

////div[@id='ui-datepicker-div']/table/tbody/tr/td[5]/a
//End Date Select
//(//input[@type='text'])[26]
@FindBy(xpath="(//div[@id='ui-datepicker-div']/table/tbody/tr/td[5]/a)[1]")
public WebElement enddatesel;

//textarea[@id='txtLeaveReason']
//Reason
@FindBy(xpath="//textarea[@id='txtLeaveReason']")
public WebElement reason;

//Choose
@FindBy(xpath="//div[@id='divAction']/button")
public WebElement chosbtn;


//Submit
@FindBy(xpath="//input[@value='SUBMIT']")
public WebElement sub;
//Employment Self Service	
public void ess() {
	ess.click();
}

//Leave Request
public void lr() {
	lr.click();
}

//Request Button
public void reqbtn() {
	reqbtn.click();
}
//Employment Details
public void empdetails() {
	empdetails.click();
}
//Emp Name 
public void empName() {
	empName.click();
}
//Request Type Select
public void reqtype() {
	reqtype.click();
}
//Request Type Name
public void reqnam() {
	reqnam.click();
}
//Leave Type
public void leavetye() {
	leavetye.click();
}
//Casual Leave
public void caslve() {
	caslve.click();
}
//Start Date
public void startdate() {
	startdate.click();
}
//Start Date Select
public void startdatesel() {
	startdatesel.click();
}
//End Date
public WebElement enddate() {
	return enddate;
}
//End Date Select
public void enddatesel() {
	enddatesel.click();
}
//Reason
public void reason(String srrrr) {
	reason.sendKeys(srrrr);
	
}
//Choose
public WebElement chosbtn() {
	return chosbtn;
}
//Submit
public void sub() {
	sub.click();
}
}