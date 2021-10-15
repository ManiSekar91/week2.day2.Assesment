package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text() ='Phone']")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("7010423189");
driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
Thread.sleep(3000);
String lead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
System.out.println("Lead ID is:" + lead);
driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys(lead);
driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
driver.close();
}
	} 

