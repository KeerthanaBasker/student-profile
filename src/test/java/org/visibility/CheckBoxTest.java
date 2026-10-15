package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {
  public static void main(String[]args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://travel.agileway.net/login");
	  WebElement rememberMe = driver.findElement(By.id("remember_me"));
	  rememberMe.click();
	  System.out.println(rememberMe.isSelected());
  }
}
