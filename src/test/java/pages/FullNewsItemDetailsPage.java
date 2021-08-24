package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FullNewsItemDetailsPage {

    private static WebElement element = null;

    public static WebElement fullNewsItemDetailsPageTitle(WebDriver driver) {
        element = driver.findElement(By.className("h1--page-title"));
        return element;
    }

    public static WebElement secondArticleReadFullStoryButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"block-mc-cna-theme-mainpagecontent\"]/article[3]/div[2]/div/a"));
        return element;
    }

    public static WebElement secondArticleHeadline(WebDriver driver) {
        element = driver.findElement(
                By.xpath("//*[@id=\"block-mc-cna-theme-mainpagecontent\"]/article[3]/div[1]/div[2]/div/section/div/h1"));
        return element;
    }

    public static WebElement articleNavigationHeadLine(WebDriver driver) {
        element = driver.findElement(By.className("article-navigation__heading"));
        return element;
    }
}
