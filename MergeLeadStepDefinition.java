package MergeLeadSteps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeadStepDefinition {
	ChromeDriver driver;
	Set<String> allWindows;
	List<String> allhandles;
	Set<String> allWindows2;
	List<String> allhandles2;
	String leadID;
	String text1;
	
	@Given("Get the leaptaps {string}")
	 public  void loadLeafTapsPage(String url) {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@Given("Get the username1 {string}")
	public void getUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}
	@And("Get the password1 {string}")
	public void getPassword(String pswd) {
		driver.findElement(By.id("password")).sendKeys(pswd);

	}
	@When("Click on login link")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("CRMSFA should be displayed")
	public void checkHomepage() {
		String title = driver.getTitle();
		if (title.contains("TestLeaf Automation Platform")) {
			System.out.println("Title verified");
		} 
		else {
			System.out.println("Not verified");
		}

	}

	@When("Click on CRMSFA1 link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@Then("HomePage should be displayed")
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
	@When("Click on leads link")
	public void clickLeadsLink() {
		
		driver.findElement(By.linkText("Leads")).click();
	}
	@Then("My Leads should be displayed")
	public void checkHomePage() {
		{
			String title2 = driver.getTitle();
			if (title2.contains("My Leads")) {
				System.out.println("Title verified");
			} else {
				System.out.println("Not verified");
			}

		}
		
		}
	@When("Click on MergeLeads link")
	public void clickFromMergeLead() {
		
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@Then("MergeLeadspage should be displayed")
		public void checkMergeLead() {
			{
				String title2 = driver.getTitle();
				if (title2.contains("Merge Lead")) {
					System.out.println("Title verified");
				} else {
					System.out.println("Not verified");
				}

			}
			
			
		}
	@When("Click on fromLeadWidget link")
	public void clickFromWidget() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@Then("Switch to windowhandle1")
	public void switchWindowHnadle1() {
	   allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@Then("FindLeads should be displayed")
	public void checkFindLead() {
		
		String title3 = driver.getTitle();
				if (title3.contains("Find Lead")) {
					System.out.println("Title verified");
				} else {
					System.out.println("Not verified");
				}

			}
	@Given("Get name in firstName {string}")
	public void getFirstName(String name1) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name1);
	

	}
	

	
	@When("Click on findLeads")
	public void clickFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@Then("get the value of leadid1")
	public void getLeadId() {
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();

	}
	@When("Click on firstLeadId")
	public void clickFirstLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	
	
	@Then("Switch to windowhandle0")
	public void switchWindowHnadle0() {
		driver.switchTo().window(allhandles.get(0));

	}
	/*
	 * @Then("MergeLeadspage should be displayed") public void verifyMergeLead() {
	 * String title3 = driver.getTitle(); if (title3.contains("Merge Lead")) {
	 * System.out.println("Title verified"); } else {
	 * System.out.println("Not verified"); }
	 * 
	 * }
	 */
	
	
	@When("Click on ToLeadWidget")
	public void clickToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}

	/*
	 * @Then("FindLeads should be displayed") public void verifyFindLeads() { String
	 * title3 = driver.getTitle(); if (title3.contains("Find Lead")) {
	 * System.out.println("Title verified"); } else {
	 * System.out.println("Not verified"); } }
	 */
	@When("Get windowHandles")
	public void getHandles() {
		
		 allWindows2 = driver.getWindowHandles();
		 allhandles2 = new ArrayList<String>(allWindows2);
		
	}
	@Then("Switch to windowHandle2")
	public void switchWindowHnadle2() {
		driver.switchTo().window(allhandles2.get(1));

	}
	@Given("Type the firstName {string}")
	public void getTheLead2(String name2) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name2);

	}

	
	/*
	 * @Given("Click on findLeads1") public void clickFindLead1() {
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * 
	 * }
	 */
	 
	@Given("Click on firstLead1")
	public void clickFirstLead1() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	
	  @When("Switch to windowHandle3") public void switchHandle() throws InterruptedException {
	 Thread.sleep(2000);
	  driver.switchTo().window(allhandles2.get(0));
	  
	  }
	 
	@When("Click on mergeLeadbutton link")
	public void clickMerge() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

	}
	
	@Then("Accept the alert")
	public void alertHandle() {
		driver.switchTo().alert().accept();
	}
	@When("Click on findLeads Link")
	public void clickFindLeadLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Then("ViewLead Should be displayed")
	public void checkViewLead() {
		String title4 = driver.getTitle();
		if (title4.contains("View Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Not verified");
		}

	}

	/*
	 * @When("Click on findLeads1") public void clickFindLead1() {
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 * 
	 * }
	 */
@Given("Enter the leadid")
public void checkLeadId() {
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

}


/*
 * @When("Click on findLeads button") public void clickFindLeadButton() {
 * driver.findElement(By.linkText("Find Leads")).click();
 * 
 * }
 */
 
@When("Get the value of records")
public void GetRecords() {
	text1 = driver.findElement(By.className("x-paging-info")).getText();
}
@Then("Verify the text matches")
public void verifyText() {
	if (text1.contains("No records")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}

}
	}

	
	
	
	
	
