package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonHelpers {
    public static void scrollToTheBottomOfPage(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            Thread.sleep(1000);
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,1000)");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
