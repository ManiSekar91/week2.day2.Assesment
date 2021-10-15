package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		String name = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(name);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		if (driver.getPageSource().contains("404")) {
			System.out.println("The Page is error");
		}else {
			System.out.println("The Page is not error");
		}
		
	}

}
