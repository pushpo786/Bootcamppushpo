package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expediacheckout {
	WebDriver driver;
	
    @FindBy(xpath="//button[@aria-label='Continue to checkout']")
	WebElement checkoutbutton;
	
    @FindBy(xpath="//button[@class='btn-secondary btn-action  delayed-prompt-continue-booking-cta']")
    WebElement continuebooking;
    
    public Expediacheckout (WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);  
	

  }
    public void clickCheckoutbutton() {
    	checkoutbutton.click();
  }
    public void clickContinuebooking() {
    	continuebooking.click();
    }
}
