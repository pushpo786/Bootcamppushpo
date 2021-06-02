package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedialowfare {
	 WebDriver driver;
	 
@FindBy(xpath="//button[@class='uitk-card-link']")
WebElement selectfare;

@FindBy(xpath="//button[@aria-label='Select']")
WebElement selectbutton;

@FindBy(xpath="(//button[@class='uitk-card-link'])[1]")
WebElement selectdeltaforRT;

@FindBy(xpath="//button[@aria-label='Select']")
WebElement selectbuttonforBaggagefee;

public Expedialowfare (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void selectFare() {
   	selectfare.click();
}
public void selectButtonfield() {
	selectbutton.click();
}
//public void selectDeltaFlightforRT() {
//	selectdeltaforRT.click();
//}
//public void selectButtonForBaggagefee() {
//	selectbuttonforBaggagefee.click();
//}
}
