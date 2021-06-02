package Com.PeopleNTech.Frameworkpushpopractise.Com.PeopleNTech.Frameworkpushpo;

import org.testng.annotations.Test;

public class HomeDepotCreate1 extends Usability2{
  @Test
  public void f() throws InterruptedException {
	  Home1 home=new Home1(driver);
	  CrateanAccount1 Create=new CrateanAccount1(driver);
	  home.MyAccountclick.click();
	  Thread.sleep(10000);
	  home.Registration.click();
	  Thread.sleep(10000);
	 Create.CreateanAccountButton.click();
	 Create.EmailfieldSendkeys("jami@gmail.com");
	 Create.PasswordFieldsendkeys("jami12");
	 Thread.sleep(10000);
	 Create.Zipcodesendkeys("12345");
	 Create.PhonenumberSendkeys("9292346784");
	 Create.signedofclicks();
	 Create.mobiles();
	// Create.robotfieldclick();
	 Create.CreateButtonclick();
  }
}
