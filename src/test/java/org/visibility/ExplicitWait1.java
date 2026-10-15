package org.visibility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {
   public static void main(String[]args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demoqa.com/dynamic-properties");
	   driver.manage().window().maximize();
	   WebElement button = driver.findElement(By.id("enableAfter"));
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(d -> button.isEnabled());
	   System.out.println("Button Enabled:" + button.isEnabled());
   }
}
