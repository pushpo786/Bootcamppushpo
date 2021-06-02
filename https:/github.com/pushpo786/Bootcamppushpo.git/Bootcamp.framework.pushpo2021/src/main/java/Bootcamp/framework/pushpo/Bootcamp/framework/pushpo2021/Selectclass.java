package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectclass {
	WebDriver driver;
	@FindBy(xpath="(//button[@data-test-id='select-link'])[2]")
	WebElement selectdeltaforRT;

	@FindBy(xpath="//button[@data-test-id='select-button']")
	WebElement selectbuttonforBaggagefee;
	public Selectclass (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void selectDeltaFlightforRT() {
		selectdeltaforRT.click();
	}
	public void selectButtonForBaggagefee() {
		selectbuttonforBaggagefee.click();
	}
}