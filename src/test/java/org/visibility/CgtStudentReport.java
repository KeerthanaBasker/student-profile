package org.visibility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CgtStudentReport {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.stadsolution.com/automation-testing-practice/");
        WebElement table = driver.findElement(By.xpath("//div[@class='tw']//table"));
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        System.out.println("CGT Student Report");
        System.out.println("-------------------");
        for (WebElement row : rows) {
        List<WebElement> cells = row.findElements(By.xpath("./td"));
        for (WebElement cell : cells) {
        System.out.print(cell.getText() + " | ");
            }
        System.out.println();
        }

	}
	}
