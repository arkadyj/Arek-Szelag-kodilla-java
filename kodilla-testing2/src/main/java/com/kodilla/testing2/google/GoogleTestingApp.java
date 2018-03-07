package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static final String SEARCHFIELDS = "lst-ib";

    public static void main(String[] args) {


        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELDS));
        searchField.sendKeys("Kodilla");
        searchField.submit();

        /*WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.google.com");*/

        /*System.setProperty("webdriver.gecko.driver","e:\\Moje\\programowanie\\Selenium-drivers\\Firefox\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","e:\\Moje\\programowanie\\Selenium-drivers\\Chrome\\chromedriver.exe");*/
    }
}
