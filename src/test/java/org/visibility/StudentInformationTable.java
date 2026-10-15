package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentInformationTable {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.stadsolution.com/automation-testing-practice/");
        WebElement studentRow = driver.findElement(By.xpath("//div[@class='tw']//tbody/tr[td[2]='Arjun Mehta']"));
        String studentName = studentRow.findElement(By.xpath("./td[2]")).getText();
        String trainer = studentRow.findElement(By.xpath("./td[3]")).getText();
        String course = studentRow.findElement(By.xpath("./td[4]")).getText();
        String batch = studentRow.findElement(By.xpath("./td[5]")).getText();
        System.out.println("Student Name: " + studentName);
        System.out.println("Trainer: " + trainer);
        System.out.println("Course: " + course);
        System.out.println("Batch: " + batch);

}
}
