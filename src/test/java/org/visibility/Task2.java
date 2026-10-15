package org.visibility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
       public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        List<WebElement> rows = driver.findElements(By.xpath("//table//tbody/tr"));
        System.out.println("Total rows: " + rows.size());
        System.out.println("\n--- All Records ---");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println();
        }
        WebElement cierraRow = driver.findElement(By.xpath("//table//tbody/tr[td[1]='Cierra']"));
        System.out.println("\nCierra found: " + cierraRow.isDisplayed());
        WebElement email = cierraRow.findElement(By.xpath("./td[4]"));
        System.out.println("Cierra Email: " + email.getText());
        WebElement deleteButton = cierraRow.findElement(By.xpath(".//span[@title='Delete']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", deleteButton);
        List<WebElement> rowsAfterDelete = driver.findElements(By.xpath("//table//tbody/tr"));
        System.out.println("Rows after delete: " + rowsAfterDelete.size());
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Keerthana");
        driver.findElement(By.id("lastName")).sendKeys("Test");
        driver.findElement(By.id("userEmail")).sendKeys("keerthana@test.com");
        driver.findElement(By.id("age")).sendKeys("24");
        driver.findElement(By.id("salary")).sendKeys("50000");
        driver.findElement(By.id("department")).sendKeys("Testing");
        driver.findElement(By.id("submit")).click();
        WebElement newRecord = driver.findElement(By.xpath("//table//tbody/tr[td[1]='Keerthana']"));
        System.out.println("New record added: " + newRecord.isDisplayed());
}
}