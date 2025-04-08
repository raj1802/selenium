package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActionsOnWebElements {

    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();



        System.setProperty("webdriver.driver.chrome", "driverexes\\chrome driver.exe");


        WebDriver driver = new ChromeDriver();


        //browser manupulation method

        driver.get("https://practice.bpbonline.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        if(driver.getPageSource().contains("Welcome to BPB Online")) System.out.println("bpbpnline page is loaded");

        WebElement searchFeild = driver.findElement(By.name("keywords"));

        //clear action
        searchFeild.clear();

        //type action
        searchFeild.sendKeys("mouse");

        WebElement quickFind = driver.findElement(By.xpath("//input[@title= ' Quick Find ']"));

        System.out.println(quickFind.getAttribute("alt"));
        System.out.println(quickFind.getTagName());
        System.out.println(quickFind.getText());
        System.out.println(quickFind.getCssValue("background-color"));
        System.out.println(quickFind.getSize().height);
        System.out.println(quickFind.getRect().height);




        //click action

        quickFind.click();






        driver.quit();
    }
}
