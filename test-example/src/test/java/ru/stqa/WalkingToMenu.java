package ru.stqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WalkingToMenu extends TestBase {

    @Test
    public void goToAppearence() {
        driver.findElement(By.xpath("//li[@id='app-']/a/span[@class='name']")).click();
        driver.findElement(By.id("doc-template")).click();
        Assertions.assertEquals("Template", "Template");
        driver.findElement(By.id("doc-logotype")).click();
        Assertions.assertEquals("Logotype", "Logotype");
    }

    @Test
    public void goToCatalog() {

    }


}
