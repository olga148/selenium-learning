package ru.stqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WalkingToMenu {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeAll
    static void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void goToAppearence() {
        driver.findElement(By.xpath("//li[@id='app-']/a/span[@class='name']")).click();
        driver.findElement(By.id("doc-template")).click();
        Assertions.assertEquals("Template", "Template");
        driver.findElement(By.id("doc-logotype")).click();
        Assertions.assertEquals("Logotype", "Logotype");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }


}
