package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();



        System.setProperty("webdriver.driver.chrome", "driverexes\\chrome driver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.bpbonline.com/");

        Thread.sleep(5000);

        System.out.println("Page Title: " + driver.getTitle());



        driver.quit();
    }
}

