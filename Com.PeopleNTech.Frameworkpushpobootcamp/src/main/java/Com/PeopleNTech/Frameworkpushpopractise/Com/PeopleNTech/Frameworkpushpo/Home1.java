package Com.PeopleNTech.Frameworkpushpopractise.Com.PeopleNTech.Frameworkpushpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1 {
	public WebDriver driver;
@FindBy(xpath="//*[text()='My Account']")
WebElement MyAccountclick;
@FindBy(xpath="//*[text()='Register']")
WebElement Registration;

public Home1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
			
}
public void MyAccountclick() {
	MyAccountclick.click();
}
public void Registrationbuttonclick() {
	Registration.click();
}
}
