package org.visibility;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
    System.out.println("Total rows:" + rows.size());
    List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
    System.out.println("Total columns:" + columns.size());
    for (WebElement row : rows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
    for (WebElement cell : cells) {
    System.out.print(cell.getText() + " | ");
        }
     System.out.println();
         }
    System.out.println("\n--- Books written by Amit ---");
    for (WebElement row : rows) {
     List<WebElement> cells = row.findElements(By.tagName("td"));
    if (cells.size() >= 2 && cells.get(1).getText().equals("Amit")) {
    System.out.println("Book Name: " + cells.get(0).getText());
        }
    }
    boolean found = false;
    for (WebElement row : rows) {
    	List<WebElement> cells = row.findElements(By.tagName("td"));
    	if (!cells.isEmpty() &&cells.get(0).getText().equals("Learn Java")) {
      found = true;
            break;
        }
    }
    System.out.println("\nLearn Java present: " + found);
    System.out.println("\n--- Price Values ---");
    for (WebElement row : rows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
      if (cells.size() >= 4) {
     System.out.println(cells.get(3).getText());
      }
    }
	}
}


