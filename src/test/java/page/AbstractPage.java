package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPage {
    private static final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(10);
    private static final String COMMON_OPTION_XPATH =  "//md-option[div[contains(text(),'%s')]]";
    protected final Logger logger = LogManager.getRootLogger();
    protected WebDriver driver;

    public void switchToTab(int tabIndex) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        try {
            driver.switchTo().window(tabs.get(tabIndex));
        } catch (IndexOutOfBoundsException e) {
            driver.switchTo().window(tabs.get(0));
        }
    }

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForVisibilityOfElement(WebElement webElement) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.visibilityOf(webElement));
    }

    protected WebElement waitForElementToBeClickable(WebElement webElement) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected WebElement waitForElementToBeClickable(By locator) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement waitForElementToBeClickable(String option) {
        By locator = By.xpath(String.format(COMMON_OPTION_XPATH, option));
        return waitForElementToBeClickable(locator);
    }

    protected void waitForVisibilityOfFrameAndSwitchToIt(WebElement webElement) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
    }

    protected void waitForVisibilityOfFrameAndSwitchToIt(int index) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

}