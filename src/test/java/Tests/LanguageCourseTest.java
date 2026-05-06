package Tests;

import Config.BaseTest;
import Pages.FilterPage;
import Pages.FilterPageResult;
import Pages.HomePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LanguageCourseTest extends BaseTest {

    @Epic("Identify Courses")
    @Feature("verifyLanguage")
    @Test
    public void verifyLanguageAndLevels() throws InterruptedException {

        test = extent.createTest("Language Learning Filter Test");
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));

        HomePage home = new HomePage(driver);
        FilterPage filter = new FilterPage(driver);

        home.searchCourse("Language Learning");
        test.pass("Searched Language Learning");
        //Language
        Thread.sleep(5000);

        filter.selectFirstLanguage();
        test.pass("Language selected");

        //Level
        Thread.sleep(5000);
        filter.selectBeginnerLevel();
        test.pass("Beginner level selected");



        //finding language result
        Thread.sleep(5000);
        FilterPageResult lngResult = new FilterPageResult(driver);
        lngResult.findLanguageList();
        lngResult.findLevelList();


    }
}