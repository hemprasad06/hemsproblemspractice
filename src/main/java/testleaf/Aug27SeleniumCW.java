package testleaf;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Aug27SeleniumCW {
	public ChromeDriver driver;

	@BeforeMethod
	public boolean salesForceLogin() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("learners@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		return true;

	}

	@AfterMethod
	public void driverQuit() {
		driver.quit();

	}

	@Test
	public void testCase1() {
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("(//button[@class=\"slds-button\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@class=\"slds-input\"]")).sendKeys("legal");
		driver.findElement(By.xpath("(p[@class='slds-truncate'])[2]")).click();

	}


}
