package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
driver.findElement(By.name("UserFirstName")).sendKeys("Manikandan");
driver.findElement(By.name("UserLastName")).sendKeys("Sekar");
//driver.findElement(By.name("email")).sendKeys("mani@gmail.com");
driver.findElement(By.name("UserEmail")).sendKeys("mani@gmail.com");
driver.findElement(By.name("UserTitle")).sendKeys("IT_Manager_AP");
driver.findElement(By.name("CompanyName")).sendKeys("Integra");
driver.findElement(By.name("CompanyEmployees")).sendKeys("101 - 500 employees");
driver.findElement(By.name("UserPhone")).sendKeys("7010423189");
driver.findElement(By.name("CompanyCountry")).sendKeys("India");
driver.findElement(By.name("CompanyState")).sendKeys("Pondicherry");
driver.findElement(By.className("checkbox-ui")).click();
driver.close();

	}

}
