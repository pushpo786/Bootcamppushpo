package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaFlightSearchPage {
 WebDriver driver;

@FindBy(xpath="//button[@aria-label='Leaving from']")	
WebElement leavingFromfield;

@FindBy(xpath="//strong[contains(text(),'Washington (IAD - Washington Dulles Intl.)')]")
WebElement leavingfromthecity;

@FindBy(xpath="//button[@aria-label='Going to']")
WebElement goingtoField;

@FindBy(xpath="//strong[contains(text(),'Paris (PAR - All Airports)')]")
WebElement goingtothecity;

@FindBy(xpath="//button[@id='d1-btn']")
WebElement dateField;

@FindBy(xpath="//button[@aria-label='Jun 22, 2021']")
WebElement departingdate;

@FindBy(xpath="//button[@aria-label='Jul 13, 2021']")
WebElement returningdate;

@FindBy(xpath="//span[contains(text(),'Done')]")
WebElement donebutton;

@FindBy(xpath="//a[@aria-label='Preferred flight class Economy']")
WebElement classselectionTab;

@FindBy(xpath="//span[text()='First class']")
WebElement passengerclass;

@FindBy(xpath="//button[text()='Search']")
WebElement searchbutton;

public ExpediaFlightSearchPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void enterleavingFromfield(String partialtext) {
	leavingFromfield.sendKeys(partialtext);
}
public void clickleavingfromthecity() {
	leavingfromthecity.click();
}
public void entergoingtofield(String partialtext) {
goingtoField.sendKeys(partialtext);	
}
public void clickgoingtothecity() {
	goingtothecity.click();
}
public void clickdateField() {
	dateField.click();
}
public void clickdepartingdate() {
	departingdate.click();
}
public void clickreturningdate() {
	returningdate.click();
}
public void clickdonebutton() {
	donebutton.click();
}
public void clickclassselectiontab() {
classselectionTab.click();
}
public void selectpassengerclass() {
	passengerclass.click();
}
public void clicksearchbutton() {
	searchbutton.click();
}
}
