package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CNAHomePage;
import pages.FullNewsItemDetailsPage;
import utils.CommonHelpers;


public class TestScenario1_CNA extends BaseTest {
    
    @Test
    public void verifyHeadlineNewsItemTitleInternationalEdition() {
        driver.get("https://www.channelnewsasia.com/");
        String headlineTitleTextFromHomePage = CNAHomePage.headLineNewsItemTitle(driver).getText();
        CNAHomePage.headLineNewsItemTitle(driver).click();
        Assert.assertEquals(headlineTitleTextFromHomePage,
                FullNewsItemDetailsPage.fullNewsItemDetailsPageTitle(driver).getText(),
                "We are not on the expected news item.");
        CommonHelpers.scrollToTheBottomOfPage(driver);
        String secondArticleHeadline = FullNewsItemDetailsPage.secondArticleHeadline(driver)
                .getText();
        FullNewsItemDetailsPage.secondArticleReadFullStoryButton(driver).click();
        Assert.assertEquals(secondArticleHeadline,
                FullNewsItemDetailsPage.articleNavigationHeadLine(driver).getText(),
                "We have not navigated on the expected news item.");

    }




}
