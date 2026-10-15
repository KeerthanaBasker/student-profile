package org.visibility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeTable {
  public static void main(String[]args) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.stadsolution.com/automation-testing-practice/");
	  WebElement table = driver.findElement(By.xpath("//div[@class='tw']//table"));
	  List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
	  System.out.println("Row Count: " + rows.size());
	  List<WebElement> columns = table.findElements(By.xpath(".//thead/tr/th"));
	  System.out.println("Column count:" + columns.size());
	  System.out.println("\nComplete Table Data");
	  for (WebElement row : rows) {
		  List<WebElement> cells = row.findElements(By.xpath("./td"));
	for (WebElement cell : cells) {
		System.out.println(cell.getText()+ "|");
	}
	System.out.println();
	  }
  }
}
