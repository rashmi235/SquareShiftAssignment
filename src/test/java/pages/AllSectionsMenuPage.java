package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllSectionsMenuPage {
    private static WebElement element = null;

    public static WebElement weatherLink(WebDriver driver) {
        element = driver.findElement(By.linkText("Weather"));
        return element;
    }
}
