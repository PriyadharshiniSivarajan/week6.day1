package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadStepDefinition {
	ChromeDriver driver;

	@Given("Load the createLead {string}")
	public void getURL(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@And("Give the username {string}")
	public void getUserName(String uname) {

		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@And("Give the password {string}")
	public void getPassword(String pswd) {
		driver.findElement(By.id("password")).sendKeys(pswd);

	}

	@When("Click on the login button")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage page is displayed")
	public void checkHomepage() {
		String title = driver.getTitle();
		if (title.contains("TestLeaf Automation Platform")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}

	@When("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@Then("Leads page  is displayed")
	public void checkLeadsPage() {
		{
			String title1 = driver.getTitle();
			if (title1.contains("opentaps CRM")) {
				System.out.println("Title verified");
			} else {
				System.out.println("Not verified");
			}

		}
	}
	@When("Click on createlead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Then("Createlead page is displayed")
	public void checkCreateLead() {
		{
			String title2 = driver.getTitle();
			if (title2.contains("Create Lead")) {
				System.out.println("Title verified");
			} else {
				System.out.println("Not verified");
			}

		}

}
	@Given("Give the company {string}")
	public void getComName(String cmpname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpname);

	}
	@And("Give the first name {string}")
	public void getFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}
	@And("Give the last name {string}")
	public void getLastName(String lname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@And("Give the phone no {string}")
	public void getPhNo(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);

	}
	@When("Click on the submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();	
	}
	@Then("Leadcreated page is displayed")
	public void checkLeadCreate() {
		String title3 = driver.getTitle();
		if (title3.contains("View Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}

	}
	
