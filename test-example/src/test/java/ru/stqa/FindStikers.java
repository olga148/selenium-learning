package ru.stqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindStikers {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeAll
    static void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://localhost/litecart/en/");
    }

    @Test
    public void testToFindStikers(){
        driver.findElements(By.cssSelector("div.sticker new"));
    }

    @Test
    public void test2(){
        driver.findElements(By.cssSelector("div.sticker sale"));
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
