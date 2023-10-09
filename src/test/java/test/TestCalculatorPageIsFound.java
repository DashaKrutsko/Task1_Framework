package test;

import org.testng.annotations.Test;
import page.CalculatorPage;
import page.HomePage;

public class TestCalculatorPageIsFound extends CommonConditions{

    @Test(description = "Check Calculator page is found")
    public void calculatorPageIsFound() {
        CalculatorPage newPaste = new HomePage(driver)
                .openPage()
                .enterSearchString(SEARCH_STRING)
                .getCalculatorPage();

        String pageTitleActual = driver.getTitle();
        String pageTitleExpected = "Google Cloud Pricing Calculator";
        softAssertion.assertEquals(pageTitleActual, pageTitleExpected,"Calculator page wasn't found" );

    }
}
