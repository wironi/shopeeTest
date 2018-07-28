package GistQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatePublicGist {
	
	public static void main(String[] args) {
		String exePath = "C:\\Users\\styletheory\\eclipse-workspace\\ShopeeQATest\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://shopee.co.id/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.partialLinkText("Login")).click();
	}
	
	
}
