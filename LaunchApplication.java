package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("Demosalesmanager");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("crmsfa");
WebElement submit = driver.findElement(By.className("decorativeSubmit"));
submit.click();
	}

}
