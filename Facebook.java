package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("Manikandan");
driver.findElement(By.name("lastname")).sendKeys("Sekar");
driver.findElement(By.name("reg_email__")).sendKeys("7010423189");
driver.findElement(By.id("password_step_input")).sendKeys("password@123");
driver.findElement(By.id("day")).sendKeys("30");
driver.findElement(By.id("month")).sendKeys("April");
driver.findElement(By.id("year")).sendKeys("1991");
driver.findElement(By.xpath("//label[text()= 'Male']")).click();

	}

}
