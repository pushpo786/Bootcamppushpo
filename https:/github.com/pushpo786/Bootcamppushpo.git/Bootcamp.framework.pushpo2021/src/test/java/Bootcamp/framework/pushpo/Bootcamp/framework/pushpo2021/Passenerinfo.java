package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Passenerinfo {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  ExpediaPassengerInfo pi=new ExpediaPassengerInfo(driver); 
	  pi.enterFirstname();
		Thread.sleep(6000);
		pi.enterMiddlename();
		pi.enterLastname();
		Thread.sleep(6000);
		pi.enterCountrycode();
		pi.enterPhonenumber();
		Thread.sleep(6000);
		pi.clickConformationCheckbox();
		pi.enterPassportcountryname();
		Thread.sleep(6000);
		pi.clickGender();
		pi.enterDateofBirthmonth();
		Thread.sleep(6000);
		pi.enterDateofBirtday();
		pi.enterDateofBirthYear();
		Thread.sleep(6000);
		pi.clickNoInsurance();
		pi.enterCreditcardholdername();
		pi.enterCreditcardnumber();
		Thread.sleep(6000);
		pi.enterCreditcardexpirationmonth();
		pi.enterCreditcardexpirationyear();
		Thread.sleep(6000);
		pi.enterCreditcardsecuritycode();
		pi.enterCreditcardcountryname();
		Thread.sleep(6000);
		pi.enterCreditcardbillingaddressstreetname1();
		pi.enterCreditcardbillingaddressstreetname2();
		Thread.sleep(6000);
		pi.enterCreditcardcityname();
		pi.enterCreditcardstatename();
		Thread.sleep(6000);
		pi.enterCreditcardzipcode();
		Thread.sleep(6000);
		pi.enterEmail();
		Thread.sleep(6000);
		pi.clickCompletebooking();
		
		 
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	
		  System.setProperty("webdriver.chrome.driver", "/Users/khadizapushpo/Downloads/chromedriver");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.expedia.com/Checkout/V1/FlightCheckout?tripid=3bf95154-642a-56a3-b46a-19a98dff602b&c=5fc3784b-fddc-4e13-b95f-0ba3e7cd33ac");
	    }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
