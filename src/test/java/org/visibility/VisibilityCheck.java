package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityCheck {
  public static void main(String[]args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://travel.agileway.net/login");
	  WebElement login = driver.findElement(By.name("commit"));
	  System.out.println(login.isDisplayed());
	  System.out.println(login.isEnabled());
	  WebElement rememberMe = driver.findElement(By.id("remember_me"));
	  System.out.println(rememberMe.isSelected());
  }
}
