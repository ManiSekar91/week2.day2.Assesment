package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");

		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img"))
				.click();
		driver.findElement(By.xpath("//img[@src='images/image.png']")).click();
		// driver.findElement(By.xpath("//label[text()='Click on this image to go home
		// page']/following-sibling::img")).click();
		// if(driver.getCurrentUrl())
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"))
				.click();

	}

}
