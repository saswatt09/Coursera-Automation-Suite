package Pages;

import Utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Handles Enterprise form
 */
public class EnterprisePage {

    WebDriver driver;
    WebDriverWait wait;

    public EnterprisePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By enterpriseLink = By.xpath("//li[contains(@class,'rc-SubFooterSection__content-column-link-item')]/a[text()='For Enterprise']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By submitButton = By.xpath("//span[@class='mktoButtonWrap mktoSimple']//button\n");
    By emailError = By.xpath("//*[@id='ValidMsgEmail']");

    /**
     * Submit enterprise form with invalid email
     */
    public void submitForm() {
        WaitUtil.click(driver,enterpriseLink,20);
        WaitUtil.sendKeys(driver,firstName,"Cognizant",20);
        driver.findElement(lastName).sendKeys("pvt");
        driver.findElement(email).sendKeys("123");
        WaitUtil.click(driver,submitButton,20);
        System.out.println(WaitUtil.waitForVisibility(driver,emailError,20).getText());
    }
}