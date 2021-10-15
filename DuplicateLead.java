package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
driver.findElement(By.xpath("//span[text() = 'Email']")).click();
driver.findElement(By.name("emailAddress")).sendKeys("manimani@gmail.com");
driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();

Thread.sleep(2000);
String name = driver.findElement(By.xpath("(//a[@class = 'linktext'])[6]")).getText();
System.out.println("Name is: " + name);

Thread.sleep(3000);
driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).click();
driver.findElement(By.linkText("Duplicate Lead")).click();
System.out.println("Title is:" + driver.getTitle());
driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text() = 'Email']")).click();
driver.findElement(By.name("emailAddress")).sendKeys("manimani@gmail.com");
driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();

Thread.sleep(2000);
String name1 = driver.findElement(By.xpath("(//a[@class = 'linktext'])[12]")).getText();
System.out.println("Duplicate name is: " + name1);
if (name.equals(name1)) {
	System.out.println("Both the Names are same");
} else {
	System.out.println("The names are different");
}
	}

}
