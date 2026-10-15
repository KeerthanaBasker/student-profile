package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropdownSelection {
     public static void main(String[]args) {
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://www.stadsolution.com/automation-testing-practice/");
    	 WebElement dropDown = driver.findElement(By.xpath("//select[@id='f-country']"));
         Select country = new Select(dropDown);
         country.selectByVisibleText("India");
         country.selectByVisibleText("United States");
         country.selectByVisibleText("Canada");
         System.out.println("Country Selection done");
     }
}
