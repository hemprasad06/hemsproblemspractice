package testleaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KishoreSeleniumExercise {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
	WebElement e = driver.findElement(By.className("ui-selectonemenu"));
	e.click();
	Select dropdown = new Select(e);
	List<WebElement> options = dropdown.getOptions();
		System.out.println(options);
	driver.quit();
	
	}

}
