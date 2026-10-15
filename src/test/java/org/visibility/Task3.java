package org.visibility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select select = new Select(dropdown);
        System.out.println("Is Multi-Select: " + select.isMultiple());
        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Saab");
        select.selectByVisibleText("Opel");
        List<WebElement> selectedOptions =select.getAllSelectedOptions();
        System.out.println("\nSelected Options:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        System.out.println("\nFirst Selected Option: "+ select.getFirstSelectedOption().getText());
        select.deselectAll();
        System.out.println("\nAll options deselected.");
    }
}