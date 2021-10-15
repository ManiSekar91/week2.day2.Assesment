package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select drpdwn = new Select(dropdown);
		drpdwn.selectByIndex(1);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name = 'dropdown2']"));
		Select drpdwn1 = new Select(dropdown1);
		drpdwn1.selectByVisibleText("Appium");
		WebElement dropdown2 = driver.findElement(By.id("dropdown3"));
		Select drpdwn2 = new Select(dropdown2);
		drpdwn2.selectByValue("1");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@class = 'dropdown']"));
		Select drpdwn3 = new Select(dropdown3);
		int result = drpdwn3.getOptions().size();
		System.out.println(result);
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//option[text() = 'Select your programs']")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//option[@value = '2'])[6]")).click();
	
	}

}
