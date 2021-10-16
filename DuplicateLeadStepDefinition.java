package DuplicateLeadStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadStepDefinition {
	ChromeDriver driver;
@Given("Get leafTaps {string}")
public void get_leaf_taps(String string) {
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
public void leafTaps_page_is_displayed1() {
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
@Then("Give the phone number {string}")
public void give_the_phone_number(String string) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(string);
}
@When("Click on findleadbutton link")
public void click_on_findleadbutton_link() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
}
@When("Click on firstLead link")
public void click_on_first_lead_link() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

}
@Then("ViewLead is displayed")
public void view_lead_is_displayed() {
	String title4= driver.getTitle();
	if (title4.contains("View Lead")) {
		System.out.println("Title verified");
	} else {
		System.out.println("Not verified");
	}
}
@When("Click on duplicateLeadButton link")
public void click_on_duplicate_lead_button_link() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
}
@Then("DuplicateLead id displayed")
public void duplicate_lead_id_displayed() {
	String title5= driver.getTitle();
	if (title5.contains("Duplicate Lead")) {
		System.out.println("Title verified");
	} else {
		System.out.println("Not verified");
	}
}
@When("Click on submitButton link")
public void click_on_submit_button_link() {
	driver.findElement(By.name("submitButton")).click();
}
@Then("ViewLead page is displayed")
public void view_lead_page_is_displayed() {
	String title6= driver.getTitle();
	if (title6.contains("View Lead")) {
		System.out.println("Title verified");
	} else {
		System.out.println("Not verified");
	}
}

}
