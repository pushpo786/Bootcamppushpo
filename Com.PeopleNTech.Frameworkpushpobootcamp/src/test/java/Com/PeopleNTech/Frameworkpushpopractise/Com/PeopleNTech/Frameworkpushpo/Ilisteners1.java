package Com.PeopleNTech.Frameworkpushpopractise.Com.PeopleNTech.Frameworkpushpo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Ilisteners1 extends Usability2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		String sn=dt.toString().replace(" ", "_").replace(":", "_");
		this.driver=((Usability2)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File("/Users/khadizapushpo/Downloads/passed/"+sn+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		String sn=dt.toString().replace(" ", "_").replace(":", "_");
		this.driver=((Usability2)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File("/Users/khadizapushpo/Downloads/failed/"+sn+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	
	}
}
