package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ExpediaSearchFlightForRT {
  
WebDriver driver;

  @Test
  public void Test() throws InterruptedException {
	 ExpediaHomePage home=new ExpediaHomePage(driver);
	 ExpediaFlightSearchPage fsrt=new ExpediaFlightSearchPage(driver);
	 Expedialowfare lf=new Expedialowfare(driver);
	 Selectclass sc=new Selectclass(driver);
	 Expediacheckout co=new Expediacheckout(driver);
	 ExpediaPassengerInfo pi=new ExpediaPassengerInfo(driver);
	home.clickFlightTab();
	Thread.sleep(6000);
	fsrt.enterleavingFromfield("IAD");
	Thread.sleep(6000);
	fsrt.clickleavingfromthecity();
	Thread.sleep(6000);
	fsrt.entergoingtofield("PAR");
	Thread.sleep(6000);
	fsrt.clickgoingtothecity();
	fsrt.clickdateField();
	Thread.sleep(6000);
	fsrt.clickdepartingdate();
	fsrt.clickreturningdate();
	Thread.sleep(6000);
	fsrt.clickdonebutton();
	fsrt.clickclassselectiontab();
	fsrt.selectpassengerclass();
	Thread.sleep(6000);
	fsrt.clicksearchbutton();
	lf.selectFare();
	Thread.sleep(6000);
	lf.selectButtonfield();
	sc.selectDeltaFlightforRT();
	Thread.sleep(6000);
	sc.selectButtonForBaggagefee();
	co.clickCheckoutbutton();
	Thread.sleep(6000);
	co.clickContinuebooking();
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
		  driver.get("https://www.expedia.com/");
	    }
  
	  
  @AfterTest
  public void afterTest() {
	  //driver.close();
        }
  }



	

  
