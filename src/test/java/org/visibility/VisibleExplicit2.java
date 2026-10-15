package org.visibility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibleExplicit2 {
   public static void main(String[]args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/dynamic-properties");
	   driver.manage().window().maximize();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement visible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
	   System.out.println("Element visible:" + visible.isDisplayed());
	 
	  
	  
   }
}
