package Bootcamp.framework.pushpo.Bootcamp.framework.pushpo2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaPassengerInfo {
	WebDriver driver;
	
  @FindBy(xpath="//input[@id='firstname[0]']")
  WebElement firstname;
	
  @FindBy(xpath="//input[@id='middlename[0]']")
  WebElement middlename;
    
  @FindBy(xpath="//input[@id='lastname[0]']")  
  WebElement lastname;
  
  @FindBy(xpath="//select[@id='country_code[0]']")
  WebElement countrycode;
  
  @FindBy(xpath="//input[@id='phone-number[0]']")
  WebElement phonenumber;
  
  @FindBy(xpath="//input[@id='confirmation-sms-provider-checkbox']")
  WebElement checkbox;
  
  @FindBy(xpath="//select[@id='passport[0]']")
  WebElement passport;
  
  @FindBy(xpath="//input[@id='gender_female[0]']")
  WebElement gender;
  
  @FindBy(xpath="//select[@id='date_of_birth_month0']")
  WebElement dateofbirthmonth;
  
  @FindBy(xpath="//select[@id='date_of_birth_day[0]']")
  WebElement dateofbirthday;
  
  @FindBy(xpath="//select[@ id='date_of_birth_year[0]']")
  WebElement dateofbirthyear;
  
  @FindBy(xpath="//input[@id='no_insurance']")
  WebElement noinsurance;
  
  @FindBy(xpath="(//input[@ name='creditCards[0].cardholder_name'])[2]")
  WebElement creditcardholdername;
  
  @FindBy(xpath="//input[@name='creditCards[0].card_number']")
  WebElement creditcardnumber;
  
  @FindBy(xpath="//select[@name='creditCards[0].expiration_month']")
  WebElement creditcardexpirationmonth;
  
  @FindBy(xpath="//select[@name='creditCards[0].expiration_year']")
  WebElement creditcardexpirationyear;
  
  @FindBy(xpath="//input[@name='creditCards[0].new_card_security_code']")
  WebElement creditcardsecuritycode;
  
  @FindBy(xpath="//select[@name='creditCards[0].country']")
  WebElement creditcardcountryname;
  
  @FindBy(xpath="//input[@name='creditCards[0].street']")
  WebElement creditcardbillingaddressstreet1;
  
  @FindBy(xpath="//input[@name='creditCards[0].street2']")
  WebElement creditcardbillingaddressstreet2;
  
  @FindBy(xpath="//input[@name='creditCards[0].city']")
  WebElement creditcardcityname;
  
  @FindBy(xpath="//select[@class='billing-state-dropdown cko-field billing-state-select gb-whitelist']")
  WebElement creditcardstatename;
  
  @FindBy(xpath="//input[@name='creditCards[0].zipcode']")
  WebElement creditcardzipcode;
  
  @FindBy(xpath="(//input[@class='text cko-field always-include gb-whitelist'])[3]")
  WebElement email;
  
  @FindBy(xpath="//button[@id='complete-booking']")
  WebElement completebooking;
  
  public ExpediaPassengerInfo (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
  }
  public void enterFirstname() {
	 firstname.sendKeys("Miss");
  }
  public void enterMiddlename() {
     middlename.sendKeys("lipa");
  }
  public void enterLastname() {
	 lastname.sendKeys("Arman");
  } 
  public void enterCountrycode() {
	 countrycode.sendKeys("+88"); 
  }
  public void enterPhonenumber() {
	 phonenumber.sendKeys("01610456234"); 
  } 
  public void clickConformationCheckbox() {
	 checkbox.click();
  } 
  public void enterPassportcountryname() {
	 passport.sendKeys("Bangladesh");
  } 
  public void clickGender() {
	 gender.click();
  } 
  public void enterDateofBirthmonth() {
     dateofbirthmonth.sendKeys("04"); 
  } 
  public void enterDateofBirtday() {
	 dateofbirthday.sendKeys("10"); 
  }
  public void enterDateofBirthYear() {
     dateofbirthyear.sendKeys("1979"); 
  }
  public void clickNoInsurance() {
	     noinsurance.click(); 
	  }
  public void enterCreditcardholdername() {
	  creditcardholdername.sendKeys("miss Lipa Arman");
  }
  public void enterCreditcardnumber() {
	  creditcardnumber.sendKeys("03888234444");
  }
  public void enterCreditcardexpirationmonth() {
	  creditcardexpirationmonth.sendKeys("01");
}
  public void enterCreditcardexpirationyear() {
	  creditcardexpirationyear.sendKeys("2029");
}
  public void enterCreditcardsecuritycode() {
	  creditcardsecuritycode.sendKeys("123");
}
  public void enterCreditcardcountryname() {
	  creditcardcountryname.sendKeys("United States of America");
} 
  public void enterCreditcardbillingaddressstreetname1() {
	  creditcardbillingaddressstreet1.sendKeys("1123 forest road");
} 
  public void enterCreditcardbillingaddressstreetname2() {
	  creditcardbillingaddressstreet2.sendKeys("Apt12345");
}  
  public void enterCreditcardcityname() {
	  creditcardcityname.sendKeys("Richmond");
} 
  public void enterCreditcardstatename() {
	  creditcardstatename.sendKeys("VA");
}  
  public void enterCreditcardzipcode() {
	  creditcardzipcode.sendKeys("20226");
} 
  public void enterEmail() {
	  email.sendKeys("lipa@gmail.com");
}  
  public void clickCompletebooking() {
	  completebooking.click();
  }
  
}