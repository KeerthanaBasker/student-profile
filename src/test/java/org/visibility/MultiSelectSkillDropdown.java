package org.visibility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectSkillDropdown {
   public static void main(String[]args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.stadsolution.com/automation-testing-practice/");
	   WebElement DropDown = driver.findElement(By.id("f-colors"));
	   Select skills = new Select(DropDown);
	   skills.selectByVisibleText("Selenium");
	   skills.selectByVisibleText("Cypress");
	   skills.selectByVisibleText("Playwright");
	   System.out.println("\nSelected Skills:");
	   List<WebElement> selectedOptions = skills.getAllSelectedOptions();
	   for (WebElement option : selectedOptions) {
		   System.out.println(option.getText());
	   }
	   skills.deselectByVisibleText("Selenium");
	   skills.deselectByIndex(2);
	   skills.deselectByVisibleText("Playwright");
	   skills.deselectAll();
	   System.out.println("\nAll skills deselected");
	   }
   }
