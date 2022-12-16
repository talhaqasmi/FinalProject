package finalPr;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FinalPOM {
	WebDriver driver;
	Final object;
	@BeforeTest
	public void before() {
	driver =new ChromeDriver();
	driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
	driver.manage().window().maximize();
	PropertyConfigurator.configure("log4j.properties");
	}
	@Test(priority=0)
	public void login1() throws InterruptedException {
	object=new Final(driver);
	object.login();
	object.loginVerification();
	object.PatientIcon();
    object.addPatient(); 
	}
	@Test(priority=1)
	public void addCases() throws InterruptedException {
	object=new Final(driver);
	object.cases();
	}
	@Test(priority=2)
	public void PNotes() throws InterruptedException {
	object=new Final(driver);
	 object.providerNotes();
	
	}
	@Test(priority=3)
	public void addDiagnosis() throws InterruptedException {
	object=new Final(driver);
	 object.Diagnosis();
	
	}
	@Test(priority=4)
	public void addproc() throws InterruptedException {
	object=new Final(driver);
	object.addProedure();
	
	}
	@Test(priority=5)
	public void bill() throws InterruptedException {
	object=new Final(driver);
	object.eBill();
	
	}
	@AfterTest
	public void closetab() {
		driver.close();
	}

}
