package DeleteLeadStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadStepDefinition {
	ChromeDriver driver;
	String leadID;
	@Given("Load leaftaps link {string}")
	public void load_leaftaps_link(String string) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("Give the username {string}")
	public void give_the_username(String string) {
		driver.findElement(By.id("username")).sendKeys(string);
	}
	@Given("Give the password {string}")
	public void give_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("LeafTaps page is displayed")
	public void leaf_taps_page_is_displayed() {
			String title = driver.getTitle();
			if (title.contains("TestLeaf Automation Platform")) {
				System.out.println("Title verified");
			} else {
				System.out.println("Not verified");
			}
	}
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("Homepage page  is displayed")
	public void homepage_page_is_displayed() {
			String title1 = driver.getTitle();
			if (title1.contains("opentaps CRM")) {
				System.out.println("Title verified");
			} else {
				System.out.println("Not verified");
			}

	}
	@When("Click on Lead link")
	public void click_on_lead_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@Then("Lead page  is displayed")
	public void lead_page_is_displayed() {
		String title2 = driver.getTitle();
		if (title2.contains("My Leads ")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}
	}
	@When("Click on findLeads link")
	public void click_on_find_leads_link() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("FindLead page is displayed")
	public void find_lead_page_is_displayed() {
		String title3 = driver.getTitle();
		if (title3.contains("Find Leads")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}
	}
	@When("Click on phone link")
	public void click_on_phone_link() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Give the phone number {string}")
	public void give_the_phone_number(String string) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(string);

	}
	@When("Click on findLeads button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Get the first leadId")
	public void get_the_first_lead_id() throws InterruptedException {
		Thread.sleep(2000);
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 System.out.println(leadID);
	}
	@When("Click the first leadid")
	public void click_the_first_leadid() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("View Lead should be displayed")
	public void view_lead_should_be_displayed() {
		String title3 = driver.getTitle();
		if (title3.contains("View Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}
	}
	@When("Click on delete button")
	public void click_on_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Then("My Lead should be displayed")
	public void my_lead_should_be_displayed() {
		String title3 = driver.getTitle();
		if (title3.contains("My Leads")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}
	}
	@When("Click on findLeads Link1")
	public void click_on_find_leads_link1() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Give input id")
	public void give_input_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	
	@When("Click on find button")
	public void click_on_find_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Get the records")
	public void get_the_records() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.contains("No records")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
