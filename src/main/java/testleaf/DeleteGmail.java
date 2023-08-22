package testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteGmail {
	public static void main(String[] args) {

		ChromeDriver gmail = new ChromeDriver();
		gmail.get("https://mail.google.com/mail/u/0/#search/select+all+older_than%3A10y");
		gmail.manage().window().maximize();
		gmail.findElement(By.id("identifierId")).sendKeys("hem.flame@gmail.com");
WebElement nextButton = gmail.findElement(By.className("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
nextButton.click();
		
		System.out.println(gmail.getTitle());
	}
	

}
