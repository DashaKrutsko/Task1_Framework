package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends AbstractPage {

    private static final String NUMBER_GPU_XPATH = "//div[@id='select_container_509']//md-option[div[contains(text(),'%s')]]";
    private static final String USAGE_XPATH = "//div[@id='select_container_139']//md-option[div[contains(text(),'%s')]]";
    private static final String LOCATION_XPATH = "//div[@id='select_container_132']//md-option[div[contains(text(),'%s')]]";

    @FindBy(id = "myFrame")
    private WebElement searchFrameInner;

    @FindBy(xpath = "//button[@class = 'devsite-snackbar-action']")
    private WebElement searchButtonCookies;

    @FindBy(id = "input-0")
    private WebElement searchFieldComputeEngine;

    @FindBy(id = "input_98")
    private WebElement searchFieldNumberOfInstances;

    @FindBy(id = "select_115")
    private WebElement searchFieldProvisioningModel;

    @FindBy(id = "select_111")
    private WebElement searchFieldOperatingSystem;

    @FindBy(id = "select_121")
    private WebElement searchFieldMachineFamily;

    @FindBy(id = "select_123")
    private WebElement searchFieldSeries;

    @FindBy(id = "select_125")
    private WebElement searchFieldMachineType;

    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement searchCheckboxAddGPU;

    @FindBy(id = "select_506")
    private WebElement searchFieldTypeGPU;

    @FindBy(id = "select_508")
    private WebElement searchFieldNumberGPU;

    @FindBy(id = "select_465")
    private WebElement searchFieldSSD;

    @FindBy(id = "select_131")
    private WebElement searchFieldLocation;

    @FindBy(id = "select_138")
    private WebElement searchFieldUsage;

    @FindBy(xpath = "//button[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'add to estimate')]")
    private WebElement searchButtonAddToEstimate;

    @FindBy(xpath = "//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'total estimated cost')]")
    private WebElement searchEstimatedCost;

    @FindBy(id = "Email Estimate")
    private WebElement searchButtonEmailEstimate;

    @FindBy(id = "input_616")
    private WebElement searchFieldEmail;

    @FindBy(xpath = "//button[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'send email')]")
    private WebElement searchButtonSendEmail;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public CalculatorPage insertComputeEngine(String typeComputeEngine) {
        waitForVisibilityOfElement(searchFieldComputeEngine).sendKeys(typeComputeEngine);
        return this;
    }

    public CalculatorPage insertNumberOfInstances(String numberOfInstances) {
        waitForVisibilityOfElement(searchFieldNumberOfInstances).sendKeys(numberOfInstances);
        return this;
    }

    public CalculatorPage selectOperatingSystem(String option) {
        selectDropboxElement(searchFieldOperatingSystem, option);
        return this;
    }

    public CalculatorPage selectProvisioningModel(String option) {
        selectDropboxElement(searchFieldProvisioningModel, option);
        return this;
    }

    public CalculatorPage selectMachineFamily(String option) {
        selectDropboxElement(searchFieldMachineFamily, option);
        return this;
    }

    public CalculatorPage selectSeries(String option) {
        selectDropboxElement(searchFieldSeries, option);
        return this;
    }

    public CalculatorPage selectMachineType(String option) {
        selectDropboxElement(searchFieldMachineType, option);
        return this;
    }

    public CalculatorPage selectAddGPU(String option) {
        if (option.equals("1")) {
            waitForElementToBeClickable(searchCheckboxAddGPU).click();
        }
        return this;
    }

    public CalculatorPage selectTypeGPU(String option) {
        selectDropboxElement(searchFieldTypeGPU, option);
        return this;
    }

//    public CalculatorPage selectNumberGPU(String option) {
//        By optionLocator = By.xpath("//div[@id='select_container_509']//md-option[div[contains(text(),'"+option+"')]]");
//        selectDropboxElement(searchFieldNumberGPU, optionLocator);
//       return this;
//    }

    public CalculatorPage selectNumberGPU(String option) {
        By optionLocator = By.xpath(String.format(NUMBER_GPU_XPATH, option));
        selectDropboxElement(searchFieldNumberGPU, optionLocator);
        return this;
    }

    public CalculatorPage selectSSD(String option) {
        selectDropboxElement(searchFieldSSD, option);
        return this;
    }

    public CalculatorPage selectLocation(String option) {
        By optionLocator = By.xpath(String.format(LOCATION_XPATH, option));
        selectDropboxElement(searchFieldLocation, optionLocator);
        return this;
    }

    public CalculatorPage selectUsage(String option) {
        By optionLocator = By.xpath(String.format(USAGE_XPATH, option));
        selectDropboxElement(searchFieldUsage, optionLocator);
        return this;
    }

    public CalculatorPage clickAddToEstimate() {
        waitForElementToBeClickable(searchButtonAddToEstimate).click();
        logger.info("New estimate was added");
        return this;
    }

    public CalculatorPage clickButtonCookies() {
        waitForVisibilityOfElement(searchButtonCookies).click();
        return this;
    }

    public CalculatorPage selectFrames() {
        waitForVisibilityOfFrameAndSwitchToIt(0);
        waitForVisibilityOfFrameAndSwitchToIt(searchFrameInner);
        return this;
    }

    public String getStringEstimatedCost() {
        return waitForVisibilityOfElement(searchEstimatedCost).getText();
    }

    public void clickEmailEstimate() {
        waitForElementToBeClickable(searchButtonEmailEstimate).click();
    }

    public CalculatorPage insertEmail(String email) {
        switchToTab(0);
        selectFrames();
        waitForVisibilityOfElement(searchFieldEmail).sendKeys(email);
        return this;
    }

    public void sendEmail() {
        waitForElementToBeClickable(searchButtonSendEmail).click();
    }

    private void selectDropboxElement(WebElement dropboxElement, String  option) {
        waitForElementToBeClickable(dropboxElement).click();
        waitForElementToBeClickable(option).click();
    }

    private void selectDropboxElement(WebElement dropboxElement, By  optionLocator) {
        waitForElementToBeClickable(dropboxElement).click();
        waitForElementToBeClickable(optionLocator).click();
    }

}
