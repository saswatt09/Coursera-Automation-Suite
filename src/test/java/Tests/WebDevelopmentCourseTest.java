package Tests;

import Config.BaseTest;
import Pages.CourseResultPage;
import Pages.FilterPage;
import Pages.HomePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class WebDevelopmentCourseTest extends BaseTest {
    @Epic("Identify Courses")
    @Feature("verify WebDev Courses")
    @Test
    public void verifyWebDevCourses() throws InterruptedException {

        test = extent.createTest("Web Development Course Test");

        HomePage home = new HomePage(driver);
        FilterPage filter = new FilterPage(driver);
        CourseResultPage result = new CourseResultPage(driver);


        home.searchCourse("Web development");
        Thread.sleep(5000);

        filter.selectBeginnerLevel();
        Thread.sleep(5000);

        filter.selectFirstLanguage();
        Thread.sleep(5000);

        result.printTopTwoCourses();

        test.pass("Top 2 courses printed");
    }
}
