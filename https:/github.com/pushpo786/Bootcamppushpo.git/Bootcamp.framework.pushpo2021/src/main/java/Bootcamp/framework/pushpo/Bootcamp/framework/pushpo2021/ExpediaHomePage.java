package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomePage {
 WebDriver driver;	
  @FindBy(xpath="(//a[@class='uitk-tab-anchor'])[2]")
  WebElement flightTab;
public ExpediaHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public void clickFlightTab() {
		flightTab.click();
	}
}

