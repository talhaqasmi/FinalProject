package finalPr;

import java.time.Duration;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Final {
	WebDriver driver;
	Logger logger=Logger.getLogger("Final");
	
	
	@FindBy(xpath="//a[@id='PersonalBtn']")
	WebElement personal;
	
	@FindBy(xpath="//input[@name='vchLogin_Name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='vchPassword']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement login;
	
	@FindBy(xpath="//iframe[@id='fra_Menu_CureMD']")
	WebElement frame1;
	
	@FindBy(xpath="//a[@id='patientBtn']")
	WebElement patient;
	
	@FindBy(xpath="//iframe[@id='fraCureMD_Body']")
	WebElement frame2;
	
	//@FindBy(xpath="//iframe[@id='fraCureMD_Menu']")
	//WebElement frame3;
	
	
	@FindBy(xpath="//td[@class='ButtonItem' and @title='Add Patient']")
	WebElement Addbutton;
	
	@FindBy(xpath="//select[@id='cmbVTitle']")
	WebElement titleDropdown;
	
	
	@FindBy(xpath="//input[@name='txtVFNAME']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='txtVLNAME']")
	WebElement lastName;
	
	
	@FindBy(xpath="//select[@name='cmbVSEX']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@name='txtDDOB']")
	WebElement DOB;
	
	@FindBy(xpath="//span[@class='select2-selection__arrow']")
	WebElement locationDropdown;
	
	
	
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement location;
	
	@FindBy(xpath="//input[@name='txtVZIP']")
	WebElement zip1;
	
	
	@FindBy(xpath="//input[@name='txtVZIPCODEEXT']")
	WebElement zip2;
	
	@FindBy(xpath="//input[@name='txtvcity']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='txtVSTATE']")
	WebElement state;
	
	@FindBy(xpath="	//input[@name='txtVCOUNTY']")
	WebElement country;
	
	@FindBy(xpath="//input[@name='txtVEMAIL']")
	WebElement Email;
	
	@FindBy(xpath="//img[@id='imgpInsurance']")
	WebElement expandInsurance;
	
	@FindBy(xpath="//select[@id='cmbIPLANID']")
	WebElement PlanID;
	
	
	@FindBy(xpath="//select[@id='cmbPlanAdd']")
	WebElement PlanAddress;
	
	@FindBy(xpath="//input[@name='txtDSIGNONFILE']")
	WebElement SignOnDate;
	
	@FindBy(xpath="//img[@id='imgSInsurance']")
	WebElement expandInsurance2;
	
	@FindBy(xpath="//select[@name='cmbSECPLANID']")
	WebElement PlanID2;
	

	@FindBy(xpath="//select[@name='cmbSecPlanAdd']")
	WebElement PlanAddress2;
	
	
	@FindBy(xpath="//input[@name='txtSecDSIGNONFILE']")
	WebElement  SignOnDate2;
	
	
	@FindBy(xpath="//td[@id='tdsave']")
	WebElement  save;
	
	@FindBy( xpath ="//iframe[@id='DynamicBHdialogbox']")
	WebElement frame3;
	
	
	@FindBy( xpath ="//button[text()='Save as New']")
	WebElement SaveAsNew;
	
	@FindBy( xpath ="//iframe[@id='fraCureMD_Patient_Menu']")
	WebElement frame4;
	
	@FindBy( xpath ="//a[@id='Provider_Notes_anchor']")
	WebElement providernotes;
	
	@FindBy( xpath ="//a[@id='Provider_Notes_New_Case_anchor']")
	WebElement NewCase;
	
	@FindBy( xpath ="//input[@name='txtVCNAME']")
	WebElement caseName;
	
	@FindBy( xpath ="//input[@name='txtDSTART']")
	WebElement caseDate;
	
	@FindBy( xpath ="//td[@id='cmdSubmit']")
	WebElement caseSave;
	
	@FindBy( xpath ="//span[text()='Accident']")
	WebElement AccidentCase;
	
	@FindBy( xpath ="//a[@id='Provider_Notes_Provider_Notes_anchor']")
	WebElement providerNotes2;
	
	@FindBy( xpath ="//td[@id='SpAdd1']")
	WebElement AddProvider;
	
	
	@FindBy( xpath ="//input[@name='Sdate']")
	WebElement pDate;
	
	@FindBy( xpath ="//span[@id='select2-cmbProvider-container']")
	WebElement providerDropdown;
	
	@FindBy( xpath ="//input[@class='select2-search__field']")
	WebElement providerDropdownValue;
	
	@FindBy( xpath ="//select[@id='cmbRTemplate']")
	WebElement Template;
	
	@FindBy( xpath ="//select[@id='txtVREASON']")
	WebElement ReasonDropdown;
	
	@FindBy( xpath ="//span[@id='select2-cmbLocation-container']")
	WebElement Plocation;
	
	@FindBy( xpath ="//input[@class='select2-search__field']")
	WebElement Plocation2;
	
	@FindBy( xpath ="//td[@id='btnSave']")
	WebElement create;
	
	
	@FindBy( xpath ="//select[@id='cmbReportType']")
	WebElement noteType;
	
	@FindBy( xpath ="//span[text()='Injection Note']")
	WebElement Pverify;
	
	@FindBy( xpath ="//label[text()='Diagnoses']//following-sibling::a")
	WebElement smallAdd;
	
	
	@FindBy( xpath ="//input[@id='txtKeyword']")
	WebElement SearchField;
	
	@FindBy( xpath ="//img[@id='imgMaster']")
	WebElement SearchButton;
	
	@FindBy( xpath ="//a[@id='0']")
	WebElement SelectDiagnose;
	
	
	@FindBy( xpath ="//td[@id='tdSaveDiagnosis']")
	WebElement DiagnoseSave;
	
	@FindBy( xpath ="//td[@id='tdSoapAccept']")
	WebElement DiagnoseAccept;
	
	@FindBy( xpath ="//span[@title='Cholera due to Vibrio cholerae 01, biovar cholerae']")
	WebElement DiagnoseVerify;
	
	@FindBy( xpath ="//a[@id='Clinical_Lab_Order_7_anchor']")
	WebElement Orders;
	
	@FindBy( xpath ="//a[@id='OrderResult_8_2_anchor']//child::a[@style='cursor:pointer;color:green;font-size:10px;font-family:arial']")
	WebElement procedureADD;
	
	
	@FindBy( xpath ="//input[@id='txtSearch']")
	WebElement procedureSearch;
	
	
	@FindBy( xpath ="//div[@id='divFavlist']//child::a[@title='99211 - Office or other outpatient visit for the evaluation and management of an established patient, that may not require the presence of a physician or other qualified health care professional. Usually, the']")
	WebElement procedureSelect;
	
	@FindBy( xpath ="//td[@id='tdSaveDiagnosis']")
	WebElement procedureAccept;
	
	@FindBy( xpath ="//td[@id='sp_eSuperbill']")
	WebElement CreateSuperBill;
	
	
	@FindBy( xpath ="//td[@class='ButtonItem' and @onclick='javascript:SubmitForm()']")
	WebElement CreateBill;

	@FindBy( xpath ="//select[@id='cmdPatType']")
	WebElement PatientType;
	
	@FindBy( xpath ="//select[@id='ddleandm']")
	WebElement EVMDropdown;
	
	@FindBy( xpath ="//input[@name='chk99211']")
	WebElement checkBox;
	
	
	@FindBy( xpath ="//input[@name='gvSuperBill$ctl02$txtDxPointer']")
	WebElement ptr;
	
	@FindBy( xpath ="//div[@id='cntrDxPointerMapping_01']//child::input[@id='chkDxPointer_1']")
	WebElement checkbox2;
	
	
	@FindBy( xpath ="//input[@id='gvSuperBill_ctl02_txtAmount']")
	WebElement amount;
	
	
	@FindBy( xpath ="//li[@id='tdSave']")
	WebElement saveBill;
	
	@FindBy( xpath ="//iframe[@id='fPatHeader']")
	WebElement frame5;

	@FindBy( xpath ="//iframe[@id='fraCureMD_Patient_Header']")
	WebElement frame6;  //header frame

	@FindBy( xpath ="//span[@id='vchPat_Name1']")
	WebElement NmaeIcon;
	
	@FindBy( xpath ="//iframe[@id='frmclinicalsummary']")
	WebElement frame7;
	
	
Final (WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver,this);
}

public void login() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(username));
	//Thread.sleep(2000);
	username.sendKeys("ChargeNDC");
	logger.info("userName entered");
	wait.until(ExpectedConditions.visibilityOf(password));
	//Thread.sleep(2000);
	password.sendKeys("SuPPort.2014");
	//Thread.sleep(2000);
	logger.info("password entered");
	wait.until(ExpectedConditions.visibilityOf(login));
	//Thread.sleep(2000);
	login.click();
	logger.info("clicked on login");
	logger.info("logged in successfully");
	Thread.sleep(2000);
}
public void loginVerification() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	String origional=driver.getWindowHandle();
	Set<String> window=driver.getWindowHandles();
	for(String shift:window) {
		if(!shift.equals(origional)) {
			driver.switchTo().window(shift);
			wait.until(ExpectedConditions.visibilityOf(frame1));
			//Thread.sleep(3000);
			driver.switchTo().frame(frame1); 
			logger.info("switched frame 1");
			Thread.sleep(3000);
	Assert.assertTrue(driver.findElement(By.xpath("//a[@id='PersonalBtn']")).isDisplayed());
	logger.info("Verified that user has successfully logged in");
	System.out.println("Verified that user has successfully logged in");
	
}
}
}
public void PatientIcon() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(patient));
	//Thread.sleep(3000);
	patient.click();
	Thread.sleep(3000);
	logger.info("clicked on patient");
}
public void addPatient() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.switchTo().defaultContent();
	logger.info("switched to default frame");
	wait.until(ExpectedConditions.visibilityOf(frame2));
	driver.switchTo().frame(frame2);
	logger.info("switched to frame 2 (search based)");
	wait.until(ExpectedConditions.visibilityOf(Addbutton));
	//Thread.sleep(3000);
	Addbutton.click();
	logger.info("clicked on add patient");
	//Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOf(titleDropdown));
	Select title= new Select(titleDropdown); //title dropdown
	title.selectByVisibleText("Mr");
	//Thread.sleep(2000);
	logger.info("title selected");
	wait.until(ExpectedConditions.visibilityOf(firstName));
	firstName.sendKeys("Talha");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(lastName));
	lastName.sendKeys("Bakar");
	//Thread.sleep(2000);
	logger.info("Firstname and LastName added");
	wait.until(ExpectedConditions.visibilityOf(Gender));
	Select gender= new Select(Gender); //selecting gender
	gender.selectByVisibleText("Male");
	logger.info("gender of patient is selected");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(DOB));
	DOB.sendKeys("11/24/1987");
	logger.info("date of birth added");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(locationDropdown));
	locationDropdown.click();
	location.sendKeys("HOSPITAL",Keys.ENTER);
	logger.info("Hospital selected");
	wait.until(ExpectedConditions.visibilityOf(zip1));
	zip1.sendKeys("39050");
	//zip2.sendKeys("688");
	logger.info("zip code is entered");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(city));
	city.sendKeys("Lahore");
	logger.info("city entered");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(state));
	state.sendKeys("Punjab");
	logger.info("state entered");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(country));
	country.sendKeys("Pakistan");
	logger.info("counry entered");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(Email));
	Email.sendKeys("sample@gmail.com");
	logger.info("email entered");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(expandInsurance));
	expandInsurance.click(); //primary insurance
	logger.info("clicked on insurance expand arrow");
	Select plan= new Select(PlanID);   //plan name
	plan.selectByVisibleText("Atena");
	logger.info("plan selected");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(PlanAddress));
	Select planAdd= new Select(PlanAddress);
	Thread.sleep(2000);
	//plan address
	planAdd.selectByVisibleText("aetna");
	logger.info("plan Address selected");
	SignOnDate.sendKeys("12/15/2022");
	logger.info("date entered");
	expandInsurance2.click();  //secondary insurance
	Select plan2= new Select(PlanID2);   //plan name
	plan2.selectByVisibleText("AARP");
	logger.info("plan selected");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(PlanAddress2));
	Select planAdd2= new Select(PlanAddress2); //plan address
	Thread.sleep(2000);
	planAdd2.selectByVisibleText("P O BOX 1017");
	logger.info("plan Address selected");
	SignOnDate2.sendKeys("12/13/2022");
	logger.info("date entered");
	Thread.sleep(2000);
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame(frame3); 
	//WebElement l=save;
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_UP).build().perform();
	action.sendKeys(Keys.PAGE_UP).build().perform();
	action.sendKeys(Keys.PAGE_UP).build().perform();
	logger.info("page scrolled up");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(save));
	save.click();
	logger.info("clicked on svae");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(frame3));
	driver.switchTo().frame(frame3);
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(SaveAsNew));
	SaveAsNew.click();
	logger.info("patient added");
	Thread.sleep(2000);
	//Assertion
	driver.switchTo().defaultContent();
	logger.info("switched to default frame");
	driver.switchTo().frame(frame6);
	logger.info("switched to frame 6");
	Thread.sleep(3000);
	Actions action4 = new Actions(driver);
	action4.sendKeys(Keys.PAGE_UP).build().perform();
	action4.sendKeys(Keys.PAGE_UP).build().perform();
	logger.info("page scrolled up");
	Assert.assertTrue(driver.findElement(By.xpath("//span[@id='vchPat_Name1']")).isDisplayed());
	logger.info("Verified that patient is added successfully");
	System.out.println("Verified that patient is added successfully");
}
public void cases() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(frame4));
	driver.switchTo().frame(frame4);
	logger.info("frame shifted");
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(providernotes));
	providernotes.click();
	logger.info("clicked on provider notes");
	wait.until(ExpectedConditions.visibilityOf(NewCase));
	//Thread.sleep(3000);
	NewCase.click();
	logger.info("clicked on new case");
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.visibilityOf(frame2));
	//Thread.sleep(2000);
	driver.switchTo().frame(frame2);
	logger.info("frame shifted");
	caseName.sendKeys("Accident");
	caseDate.sendKeys("12/15/2022");
	logger.info("case name and start date added");
	wait.until(ExpectedConditions.visibilityOf(caseSave));
	//Thread.sleep(2000);
	caseSave.click();
	logger.info("clicked on save button");
	//verifying case added or not
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Accident']")).isDisplayed());
	logger.info("verified that case is added successfully");
	System.out.println("verified that case is added successfully");
}
public void providerNotes() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.visibilityOf(frame4));
	//Thread.sleep(2000);
	driver.switchTo().frame(frame4);
	logger.info("frame shifted");
	Thread.sleep(1000);
	//providernotes.click();
	logger.info("clicked on provider notes");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(providerNotes2));
	providerNotes2.click();
	logger.info("clicked on provider notes under provider notes");
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(frame2));
	driver.switchTo().frame(frame2);
	logger.info("frame shifted");
	AddProvider.click();
	pDate.sendKeys("12/15/2022");
	providerDropdown.click();
	providerDropdownValue.sendKeys("Davis, Miranda",Keys.ENTER);
	logger.info("Provider selected");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(Template));
	Select Tem= new Select(Template); //plan address
	Tem.selectByVisibleText("Family Field Max");
	logger.info("Template selected");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(ReasonDropdown));
	Select reason= new Select(ReasonDropdown); //plan address
	reason.selectByVisibleText("Shot activity");
	logger.info("Reason selected");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(Plocation));
	Plocation.click();
	Plocation2.sendKeys("cureLoc2",Keys.ENTER);
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(noteType));
	Select note= new Select(noteType); //selecting note type
	note.selectByVisibleText("Injection Note");
	logger.info("Note Type selected");
	wait.until(ExpectedConditions.visibilityOf(create));
	create.click();
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Injection Note']")).isDisplayed());
	logger.info("verified that Provider notes successfully created");
	System.out.println("verified that provider note created successfully");
}
public void Diagnosis() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(frame4));
	driver.switchTo().frame(frame4);
	logger.info("frame shifted");
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(smallAdd));
	smallAdd.click();
	logger.info("clicked on small add button besides Diagnosis");
	driver.switchTo().defaultContent();
	driver.switchTo().frame(frame3);
	SearchField.click();
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(SearchField));
	SearchField.sendKeys("A00.0");
	logger.info("searched by A00.0");
	SearchButton.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOf(SelectDiagnose));
	SelectDiagnose.click();
	wait.until(ExpectedConditions.visibilityOf(DiagnoseSave));
	DiagnoseSave.click();
	logger.info("clicked on save");
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(DiagnoseAccept));
	DiagnoseAccept.click();
	logger.info("Diagnosis added successfully");
	//driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	//driver.switchTo().frame(frame2);
	//logger.info("frame shifted");
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.xpath("//iframe[@id='fraCureMD_Body']")).isDisplayed()); //summary frame #7
	logger.info("verified that diagnosis is added");
	System.out.println("verified that diagnosis is created successfully");
}
public void addProedure() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(frame4));
	driver.switchTo().frame(frame4);
	logger.info("frame shifted");
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(Orders));
	Orders.click();
	//Thread.sleep(2000);
	logger.info("clicked on orderes under provider notes");
	wait.until(ExpectedConditions.visibilityOf(procedureADD));
	procedureADD.click();
	logger.info("clicked on procedure's add");
	driver.switchTo().defaultContent();
	driver.switchTo().frame(frame3);
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(procedureSearch));
	procedureSearch.click();
	logger.info("clicked on search");
	procedureSearch.sendKeys("99211");
	logger.info("searched by code");
	//Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOf(procedureSelect));
	procedureSelect.click();
	logger.info("clicked on searched procedure");
	wait.until(ExpectedConditions.visibilityOf(procedureAccept));
	//Thread.sleep(1000);
	procedureAccept.click();
	logger.info("procedure added successfully");
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.xpath("//iframe[@id='fraCureMD_Body']")).isDisplayed()); //summary frame #7
	logger.info("verified that diagnosis is added");
	System.out.println("verified that procedure is added successfully");
}
public void eBill() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(frame2));
	driver.switchTo().frame(frame2);
	logger.info("frame shifted");
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(CreateSuperBill));
	CreateSuperBill.click();
	logger.info("clicked on create super bill");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.visibilityOf(frame3));
	driver.switchTo().frame(frame3);
	logger.info("frame shifted");
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(PatientType));
	Select patientType= new Select(PatientType); //selecting note type
	patientType.selectByVisibleText("New Patient");
	logger.info("patient type is added");
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(CreateBill));
	CreateBill.click();
	logger.info("clicked on create bill button");
	Thread.sleep(2000);
	Actions action2 = new Actions(driver);
	action2.sendKeys(Keys.PAGE_DOWN).build().perform();
	logger.info("page scrolled down");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.visibilityOf(frame2));
	driver.switchTo().frame(frame2);
	logger.info("frame shifted");
	Select evaluationDropdown= new Select(EVMDropdown); //selecting note type
	evaluationDropdown.selectByValue("7");
	logger.info("selecting value from Evaluation and Management dropdown");
	checkBox.click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOf(ptr));
	ptr.click();
	Thread.sleep(1000);
	checkbox2.click();
	logger.info("selecting ptr value");
	Actions action5 = new Actions(driver);
	action5.doubleClick(amount).perform();
	//amount.click();
	//Thread.sleep(1000);
	//amount.clear();
	//Thread.sleep(1000);
	amount.sendKeys("10");
	logger.info("amount entered");
	Actions action3 = new Actions(driver);
	action3.sendKeys(Keys.PAGE_UP).build().perform();
	logger.info("page scrolled up");
	saveBill.click();
	logger.info("bill saved successfully");
	//Assertion
	Thread.sleep(3000);
	Assert.assertTrue(driver.findElement(By.xpath("//iframe[@id='fraTab']")).isDisplayed());
	System.out.println("verified that bill is added successfully");
}
}

