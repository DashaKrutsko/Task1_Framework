package test;

import model.Product;
import org.testng.annotations.Test;
import page.HomePage;
import page.CalculatorPage;
import page.YopmailPage;
import service.ProductCreator;
import steps.CommonSteps;
import util.Utils;

public class TestOfCorrectCostCalculation extends CommonConditions{
    private static final String FLAG_NEW_MAIL = "1 mail";

    @Test(description = "Check the costs is calculated and equals")
    public void checkCostIsCalculated() {
        CalculatorPage newPaste = new HomePage(driver)
                .openPage()
                .enterSearchString(SEARCH_STRING)
                .getCalculatorPage();
        Product product = ProductCreator.createFromProperty();
        product.setCost(new CommonSteps(product,newPaste).calculateCost());
        boolean expectedCostConditions =  Utils.checkConditionsOfCorrectCost(product.getCost());
        softAssertion.assertTrue(expectedCostConditions, "The price hasn't been calculated");

        newPaste.clickEmailEstimate();
        YopmailPage newYopmailPage = new YopmailPage(driver)
                .openPage()
                .acceptCookies()
                .clickRandomEmailGenerator();

        String newRandomEmail = newYopmailPage.copyEmail();
        newPaste.insertEmail(newRandomEmail).sendEmail();

        String costEmailedString = newYopmailPage
                .checkInbox()
                .waitEmail(FLAG_NEW_MAIL)
                .getCostFromEmail();

        Double costEmailed = Utils.getDoubleCost(costEmailedString);

        softAssertion.assertEquals(costEmailed, product.getCost(), "Costs aren't equal");
        softAssertion.assertAll();

    }

}