package testleaf;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SalesforceCombinedTesting {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.findElement(By.id("username")).sendKeys("learners@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		// clicking waffle icon

		WebElement viewAll = driver.findElement(By.xpath("(//button[@class='slds-button'])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.visibilityOf(viewAll)).click();
		// wait.until(ExpectedConditions.visibilityOf(viewAll)).click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("legal");
		// Clicking the text box and entering search keyword

		driver.findElement(By.xpath("(//p[@class='slds-truncate'])[2]")).click();
		// clicking on the Legal Entity ( 02 index)

		driver.findElement(By.xpath("//div[@title='New']")).click();
		// Clicking in the new button

		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"))
				.sendKeys("Salesforce Automation by Hem Prasad");
		// entering the name of the person working on the automation

		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		// clicking on save button

		String actualtext = driver
				.findElement(By.xpath("//lightning-formatted-text[text()=\"Salesforce Automation by Hem Prasad\"]"))
				.getText();
		// getting the text that is entered

		// below is for validating whether the entered text is saved successfully
		Assert.assertEquals(actualtext, "Salesforce Automation by Hem Prasad");
		/*
		 * if(actualtext.equals("Salesforce Automation by Hem Prasad")) { System.out.
		 * println("Test Case Passed & the legal entry is created sucessfully"); }
		 * 
		 * else System.out.println("Test Case failed");
		 */

		// TC002
		// ChromeDriver driver = new ChromeDriver(options);
		// driver.get("https://login.salesforce.com/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		// driver.findElement(By.id("username")).sendKeys("learners@testleaf.com");
		// driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		// driver.findElement(By.id("Login")).click();

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();// clicking waffle icon
		driver.findElement(By.xpath("//div[@class='slds-size_medium']//button")).click();// clicking "View all" button
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		// WebElement inputbox =
		// driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
		// wait.until(ExpectedConditions.visibilityOf(inputbox));
		// inputbox.sendKeys("legal");

		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("legal");
		// Clicking the text box and entering search keyword

		driver.findElement(By.xpath("(//p[@class='slds-truncate'])[2]")).click();
		// clicking on the Legal Entity ( 02 index)

		WebElement automationName = driver.findElement(By.xpath("(//a[text()='Salesforce Automation by Hem Prasad'])[1]"));
		//WebDriverWait waitForName = new WebDriverWait(driver, Duration.ofMillis(10000));
		//waitForName.until(ExpectedConditions.visibilityOf(automationName)).click();
		// clicking on the name to enter into the edit page
		
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		execute.executeScript("arguments[0].click()", automationName);

		driver.findElement(By.xpath("(//button[@title='Edit Name'])[2]")).click();
		// click on edit option in front of the text box

		// driver.findElement(By.xpath("//li[@class='uiMenuItem']")).click();
		// clicking on edit button on the arrow mark

		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).clear();
		// clearing the existing text

		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Testleaf007");
		// entering the text "Testleaf"

		driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
		// clicking on save button

		//WebElement actualtextTC002 = driver.findElement(By.xpath("(//a[text()='Testleaf007'])[2]"));
		// getting the text that is entered
		// below is for validating whether the entered text is saved successfully
		
		WebElement fetchResultText = driver.findElement(By.xpath("//a[@data-refid='recordId']"));
		JavascriptExecutor validateTest = (JavascriptExecutor) driver;
		validateTest.executeScript("arguments[0].click()", fetchResultText);
		//driver.findElement(By.xpath("(//button[@title='Edit Name'])[2]")).click();
		String actualValue = driver.findElement(By.xpath("//lightning-formatted-text[text()='Testleaf007']")).getText();
		if (actualValue.equals("Testleaf007")) {
			System.out.println("Test Case Passed & the legal entry is created sucessfully");
		}

		else
			System.out.println("Test Case failed");
		
		driver.quit();

	}

}
