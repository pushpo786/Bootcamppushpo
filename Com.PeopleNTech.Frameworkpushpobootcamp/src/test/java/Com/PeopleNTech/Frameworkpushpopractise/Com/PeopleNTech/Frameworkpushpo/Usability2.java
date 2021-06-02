package Com.PeopleNTech.Frameworkpushpopractise.Com.PeopleNTech.Frameworkpushpo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Usability2 {
  public WebDriver driver;
  @Parameters({"browser","website"})

  @BeforeClass
  public void beforeClass(String browser,String website) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "/Users/khadizapushpo/Downloads/chromedriver");
		  driver=new ChromeDriver();
		  driver.get(website);
	  }else if(browser.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "/Users/khadizapushpo/Downloads/geckodriver");
		  driver=new FirefoxDriver();
		  driver.get(website);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
