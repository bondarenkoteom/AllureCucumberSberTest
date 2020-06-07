package stepsdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.MainPageSteps;
import steps.MortgagePageSteps;
import utils.AllureUtils;

public class StepsDefinitions {

    private MainPageSteps mainPageSteps = new MainPageSteps();
    private MortgagePageSteps mortgagePageSteps = new MortgagePageSteps();


    @When("Выбрано поле 'Ипотека'")
    public void selectToMortgage() {
        mainPageSteps.selectToMortgage();
    }

    @When("Выбрано поле 'Ипотека на готовое жилье'")
    public void selectToMortgageHome() {
        mainPageSteps.selectToMortgageHome();
    }

    @When("Переходим к полю 'Рассчитайте ипотеку'")
    public void switchInFrameMort() {
        mortgagePageSteps.switchInFrameMort();
    }

    @When("Чистим поле {string}")
    public void clearInputField(String nameField) {
        mortgagePageSteps.clearInputField(nameField);
    }

    @When("Вводим в поле {string} тестовые данные {string}")
    public void inputInField(String nameField, String count) {
        mortgagePageSteps.inputInField(nameField, count);
    }

    @When("Выставляем верные значения чекбоксов {string}")
    public void switchButton(String buttonNumber) {
        mortgagePageSteps.switchButton(buttonNumber);
    }

    @Then("Проверяем поле 'Сумма кредита'")
    public void assertCreditCost(String value) {
        mortgagePageSteps.assertCreditCost(value);
    }

    @Then("Поверяем поле 'Ежемесячный платеж'")
    public void assertMonthlyPayment(String value) {
        mortgagePageSteps.assertMonthlyPayment(value);
    }

    @Then("Проверяем поле 'Необходимый доход'")
    public void assertRequiredIncome(String value) {
        mortgagePageSteps.assertRequiredIncome(value);
    }

    @Then("Проверяем поле 'Процентная ставка'")
    public void assertRate(String value) {
        mortgagePageSteps.assertRate(value);
    }

}
