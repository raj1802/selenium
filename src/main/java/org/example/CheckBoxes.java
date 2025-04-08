package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();









        //browser manupulation method

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        driver.manage().window().maximize();

        WebElement firstCheckbox = driver.findElement(By.cssSelector("#checkboxes"));

        System.out.println(firstCheckbox.isDisplayed());
        System.out.println(firstCheckbox.isEnabled());
        System.out.println(firstCheckbox.isSelected());
        firstCheckbox.click();
        System.out.println(firstCheckbox.isSelected());





        Thread.sleep(5000);








        driver.quit();
    }
}


