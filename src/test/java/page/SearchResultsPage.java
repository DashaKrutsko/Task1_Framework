package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(@data-ctorig, 'calculator')]")
    private WebElement searchCalculatorPage;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public CalculatorPage getCalculatorPage() {
        waitForElementToBeClickable(searchCalculatorPage).click();
        return new CalculatorPage(driver);
    }

}
