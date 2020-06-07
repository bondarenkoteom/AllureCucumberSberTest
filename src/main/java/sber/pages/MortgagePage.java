package sber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class MortgagePage extends BasePage {

    public MortgagePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    private static String fieldName = "//div[./div[contains(text(),'%s')]]//input";
    private static String moveButton = "(//span[@class = 'dcCalc_switch__control'])[%s]";

    private static String creditCost = "//div[./div[contains(text(), 'Сумма кредита')]]//span";
    private static String monthlyPayment = "//div[./div[contains(text(), 'Ежемесячный платеж')]]//span";
    private static String requiredIncome = "//div[./div[contains(text(), 'Необходимый доход')]]//span";
    private static String rate = "//div[./div[contains(text(), 'Процентная ставка')]]//span";


    @FindBy(xpath = "//div//iframe")
    WebElement form;

    public void switchInFrameMort() { // переходим к полю 'Рассчитайте ипотеку'
        moveTo(form);
        switchInFrame(form);
    }

    public void clearInputField(String nameField) { // находим поле , чистим его от внесенных в него значений
        By place = By.xpath(String.format(fieldName, nameField));
        WebElement price = BaseSteps.getDriver().findElement(place);
        changeWait();
        moveTo(price);
        waitClickElement(price);
        price.click();
        waitClickElement(price).sendKeys(Keys.CONTROL + "a"); // выбираем текст
        waitClickElement(price).sendKeys(Keys.DELETE); // чистим

    }

    public void inputInField(String nameField, String count) { // вводим в поле нужные нам значения
        By place = By.xpath(String.format(fieldName, nameField));
        WebElement price = BaseSteps.getDriver().findElement(place);
        moveTo(price);
        waitClickElement(price).sendKeys(count);

    }

    public void switchButton(String buttonNumber) {  // метод выбора чекбоксов
        By place = By.xpath(String.format(moveButton, buttonNumber));
        WebElement buttonSwitch = BaseSteps.getDriver().findElement(place);
        changeWait();
        moveTo(buttonSwitch);
        waitClickElement(buttonSwitch);
        buttonSwitch.click();

    }


    public String assertCreditCost() {
        changeWait();
        return BaseSteps.getDriver().findElement(By.xpath(creditCost)).getText();
    }

    public String assertMonthlyPayment() {
        changeWait();
        return BaseSteps.getDriver().findElement(By.xpath(monthlyPayment)).getText();
    }

    public String assertRequiredIncome() {
        changeWait();
        return BaseSteps.getDriver().findElement(By.xpath(requiredIncome)).getText();
    }

    public String assertRate() {
        return BaseSteps.getDriver().findElement(By.xpath(rate)).getText();
    }


}
