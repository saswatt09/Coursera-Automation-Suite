package Tests;

import Config.BaseTest;
import Pages.EnterprisePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class EnterpriseFormTest extends BaseTest {
    @Epic("Identify Courses")
    @Feature("verifyEnterprise")
    @Test
    public void verifyEnterpriseFormValidation() {

        test = extent.createTest("Enterprise Form Validation Test");

        EnterprisePage enterprise = new EnterprisePage(driver);
        enterprise.submitForm();

        test.pass("Validation message verified");
    }
}
