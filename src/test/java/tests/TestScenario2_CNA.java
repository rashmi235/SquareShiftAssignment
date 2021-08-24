package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CNAHomePage;
import pages.FullNewsItemDetailsPage;
import utils.CommonHelpers;

public class TestScenario2_CNA extends BaseTest {

    @Test
    public void verifyHeadlineNewsItemTitleSingaporeEdition() {
        driver.get("https://www.channelnewsasia.com/news/international");
        CNAHomePage.singaporeLink(driver).click();
        String headLineNewsItemTitleSingaporePage = CNAHomePage.headLineNewsItemTitleSingaporePage(driver)
                .getText();
        CNAHomePage.headLineNewsItemTitleSingaporePage(driver).click();
        Assert.assertEquals(headLineNewsItemTitleSingaporePage,
                FullNewsItemDetailsPage.fullNewsItemDetailsPageTitle(driver).getText(),
                "We are not on the expected news item page.");
        CommonHelpers.scrollToTheBottomOfPage(driver);
        String secondArticleHeadline = FullNewsItemDetailsPage.secondArticleHeadline(driver)
                .getText();
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",
                FullNewsItemDetailsPage.readFullStorySection(driver));

        FullNewsItemDetailsPage.secondArticleReadFullStoryButton(driver).click();
        Assert.assertEquals(secondArticleHeadline,
                FullNewsItemDetailsPage.articleNavigationHeadLine(driver).getText(),
                "We have not navigated on the expected news item.");


    }


}
