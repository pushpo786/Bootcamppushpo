package Com.PeopleNTech.Frameworkpushpopractise.Com.PeopleNTech.Frameworkpushpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrateanAccount1 {
	public WebDriver driver;
@FindBy(xpath="(//*[text()='Select & Continue'])[1]")
WebElement CreateanAccountButton;
@FindBy(name="email")
WebElement EmailFieldEnter;
@FindBy(name="password")
WebElement PasswordFieldEnter;
@FindBy(name="zipcode")
WebElement Zipcodeenter;
@FindBy(name="phone")
WebElement Phonenumberenter;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]")
WebElement Signed;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]")
WebElement mobiles;
//@FindBy(xpath="(//*[@class='recaptcha-checkbox-border'])[1]")
//WebElement robotfieldclick;
@FindBy(xpath="(//*[text()='Create an Account'])[2]")
WebElement Create;

public CrateanAccount1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void CreateanAccountButton() {
	CreateanAccountButton.click();
}
public void EmailfieldSendkeys(String email) throws InterruptedException {
	Thread.sleep(1000);
	EmailFieldEnter.sendKeys(email);
}

public void PasswordFieldsendkeys(String password) {
	PasswordFieldEnter.sendKeys(password);
}
public void Zipcodesendkeys(String zipcode) {
	Zipcodeenter.sendKeys(zipcode);
	
}
public void PhonenumberSendkeys(String phone) {
	Phonenumberenter.sendKeys(phone);
}
public void signedofclicks() {
	Signed.click();
}
public void mobiles() {
mobiles.click();
}
/*public void robotfieldclick() {
	robotfieldclick.click();
}*/
public void CreateButtonclick() {
	Create.click();
}
}