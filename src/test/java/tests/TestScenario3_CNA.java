package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.AllSectionsMenuPage;
import pages.CNAHomePage;
import pages.WeatherPage;

public class TestScenario3_CNA extends BaseTest {
    @Test
    public void verifyWeatherConditionsForSingapore() {
        driver.get("https://www.channelnewsasia.com/news/international");
        CNAHomePage.allSectionsLink(driver).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                AllSectionsMenuPage.weatherLink(driver));
        System.out.println("Weather for Singapore city is  " +
                WeatherPage.weatherCondition(driver, "singapore").getText());
    }


}
