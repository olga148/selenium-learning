package ru.stqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WalkingToMenu extends TestBase {

    @Test
    public void goToAppearence() {
        driver.findElement(By.xpath("//li[@id='app-']/a/span[@class='name']")).click();
        driver.findElement(By.id("doc-template")).click();
        driver.findElement(By.tagName("h1"));
        driver.findElement(By.id("doc-logotype")).click();
        driver.findElement(By.tagName("h1"));
    }

    @Test
    public void goToCatalog() {
        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
        driver.findElement(By.id("doc-catalog")).click();
        driver.findElement(By.tagName("h1"));

    }


}
