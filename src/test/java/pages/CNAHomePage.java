package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CNAHomePage {
    private static WebElement element = null;

    public static WebElement headLineNewsItemTitle(WebDriver driver) {
        element = driver.findElement(By.className("feature-card__heading-link--"));
        return element;
    }

    public static WebElement headLineNewsItemTitleSingaporePage(WebDriver driver) {
        element = driver.findElement(By.className("list-object__heading-link"));
        return element;
    }

    public static WebElement singaporeLink(WebDriver driver) {
        element = driver.findElement(By.linkText("Singapore"));
        return element;
    }



    public static WebElement allSectionsLink(WebDriver driver) {
        element = driver.findElement(By.className("all-section-menu"));
        return element;
    }


}
