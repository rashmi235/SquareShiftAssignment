package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WeatherPage {
    private static WebElement element = null;

    public static WebElement weatherCondition(WebDriver driver, String country) {

        List<WebElement> elements = driver.findElements(By.className("tabular-list__view--city"));
        for (int i=0;i<elements.size();i++) {

            if (elements.get(i).getText().equalsIgnoreCase(country)) {
                element=driver.findElements(By.className("tabular-list__view--condition")).get(i);
            }
        }
        return element;
    }
}
