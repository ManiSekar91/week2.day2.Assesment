package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver mani = new ChromeDriver();
mani.get("http://leaftaps.com/opentaps/");

WebElement username = mani.findElement(By.xpath("//input[@id= 'username']"));
username.sendKeys("Demosalesmanager");
WebElement password = mani.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("crmsfa");
mani.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
mani.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

mani.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
mani.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Integra Software Services");
mani.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Manikandan");
mani.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sekar");
mani.findElement(By.xpath("//option[@value='LEAD_EMPLOYEE']")).click();
mani.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']")).sendKeys("Computer Hardware");
mani.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']")).sendKeys("Demo Marketing Campaign");

	}

}
