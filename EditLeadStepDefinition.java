package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadStepDefinition {
	ChromeDriver driver;

	@Given("Load the leaftaps url")
	public void loginLeafTaps() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@And("Enter the username {string}")
	public void getUserName(String userid) {
		driver.findElement(By.id("username")).sendKeys(userid);
	}

	@And("Enter the password {string}")
	public void getPassword(String pswd) {

		driver.findElement(By.id("password")).sendKeys(pswd);
	}

	@When("click on login button")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Go to homepage page")
	public void checkHomepage() {
		String title = driver.getTitle();
		if (title.contains("TestLeaf Automation")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}
	@When("click on CRMSFA")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@Then("Go to LeadsPage page")
	public void checkLeadMain() {
		String title1 = driver.getTitle();
		if (title1.contains("My Home")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}
	@When("click on leads")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();

	}
	@Then("Go to leadsmain page")
	public void checkLeadPage() {
		String title1 = driver.getTitle();
		if (title1.contains("My Leads")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}
}
	@When("click on findleads")
	public void clickFindLead() {
	
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("Go to findleads page")
	public void checkFindLead() {
		String title2 = driver.getTitle();
		if (title2.contains("Find Leads ")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}
	@When("click on phno")
	public void clickPhNo() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@Given("enter the phno {string}")
	public void getPhno(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}
	@When("click on findleads ")
	public void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@When("click on firstLeadid")
	public void clickLeadId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@Then("Go to editlead page")
	public void checkEditLeadPage()
	{
	String title2 = driver.getTitle();
	if (title2.contains("View Lead ")) {
		System.out.println("Title verified");
	} else {
		System.out.println("Not verified");
	}
	
	}
	@When("click on editbutton")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
}
	@Then("Go to editleadId page")
	public void checkEditLead() {
		String title3 = driver.getTitle();
		if (title3.contains("opentaps CRM")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}
	@Given("Add value to cmpname {string}")
	public void editCompName(String cmpname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cmpname);
	}
	@When("click on submitbutton")
	public void clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("changed leadpage displayed")
	public void checkChan() {
		
		String title4 = driver.getTitle();
		if (title4.contains("View Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}
	}
}