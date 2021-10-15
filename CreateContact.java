package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.xpath("//div[@for = 'crmsfa']/a")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");
driver.findElement(By.id("lastNameField")).sendKeys("Sekar");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mani");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sekar");
driver.findElement(By.name("departmentName")).sendKeys("Selenium");
driver.findElement(By.name("description")).sendKeys("Learn Selenium");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mani@gmail.com");
WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
Select drpdwn = new Select(dropdown);
drpdwn.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateContactForm_description")).clear();
driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated");
driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
System.out.println("The Title is:" + driver.getTitle());

	}

}
