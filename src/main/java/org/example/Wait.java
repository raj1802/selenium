package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Wait {
    public static void main(String[] args) {

        // Automatically manage chromedriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Login
        driver.get("https://practice.bpbonline.com/");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.name("email_address")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("tdb5")).click();

        // Logout
        driver.findElement(By.linkText("Log Off")).click();
        driver.findElement(By.linkText("Continue")).click();

        driver.quit();
    }
}
