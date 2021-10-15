package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("Demosalesmanager");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
			WebElement submit = driver.findElement(By.className("decorativeSubmit"));
			submit.click();
			WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
			crm.click();
			WebElement leads = driver.findElement(By.linkText("Leads"));
			leads.click();
			WebElement createlead = driver.findElement(By.linkText("Create Lead"));
			createlead.click();
			WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
			companyname.sendKeys("TestLeaf");
			WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
			firstname.sendKeys("Manikandan");
			WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
			lastname.sendKeys("Sekar");
			
			WebElement drpdwn = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dropdown = new Select(drpdwn);
			dropdown.selectByVisibleText("Direct Mail");
			
			WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select industry1 = new Select(industry);
			industry1.selectByIndex(7);
			
			WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select own = new Select(ownership);
			own.selectByValue("OWN_PARTNERSHIP");
			
			WebElement marketcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			marketcamp.sendKeys("Affiliate Sites");
			
			//WebElement smallsubmit = driver.findElement(By.className("smallSubmit"));
			//smallsubmit.click();
	}

}
