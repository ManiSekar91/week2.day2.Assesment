package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");

WebElement dropdown = driver.findElement(By.xpath("//div[@class='example']//select")); 
Select drpdwn = new Select(dropdown);
List<WebElement> options = drpdwn.getOptions();
int size = options.size();
drpdwn.selectByIndex(size-2);
	}

}
