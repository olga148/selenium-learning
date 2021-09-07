package ru.stqa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WalkingToMenu extends TestBase {

    @Test
    public void walkThrouhgTheMenu() {
        List<WebElement> links = driver.findElements(By.id("app-"));
        List<WebElement> number = driver.findElements(By.className("docs"));
        int countOfElements = links.size();
        int numbersOfElements = number.size();
        for (int i=0; i<countOfElements; i++) {
            links = driver.findElements(By.id("app-"));
            links.get(i).click();
            for (int n=0; n<numbersOfElements; n++) {
                number = driver.findElements(By.className("docs"));
                number.get(n).click();
                driver.findElement(By.tagName("h1"));
            }
        }
    }
}
