package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();



        System.setProperty("webdriver.driver.chrome", "driverexes\\chrome driver.exe");


        WebDriver driver = new ChromeDriver();


        //browser manupulation method

        driver.get("https://practice.bpbonline.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        System.out.println("Page Title: " + driver.getTitle());


        if(driver.getPageSource().contains("Welcome to BPB Online")) System.out.println("bpbpnline page is loaded");

        driver.manage().window().maximize();


        // xpath locator strategy to find all links on the Web page.
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        for(WebElement lnk:allLinks) System.out.println(lnk.getText());

        WebElement myAccountLink = driver.findElement(By.linkText("My Account")); // returns type WebElement
        myAccountLink.click();





        // To learn getCurrenturl method
//        driver.navigate().to("http://www.selenium.dev");
//
//        if(driver.getCurrentUrl().contains("selenium")) System.out.println("page is now changed to seleniun website");



        driver.quit();
    }
}

