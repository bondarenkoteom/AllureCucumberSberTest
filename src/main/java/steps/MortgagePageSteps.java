package steps;

import io.qameta.allure.Step;
import sber.pages.MortgagePage;
import org.junit.Assert;
import utils.AllureUtils;

public class MortgagePageSteps {

    @Step("Переходим к полю 'Рассчитайте ипотеку'")
    public MortgagePageSteps switchInFrameMort() {
        MortgagePage mortgagePage = new MortgagePage();
        mortgagePage.switchInFrameMort();
        return this;
    }

    @Step("Чистим поле {nameField}")
    public MortgagePageSteps clearInputField(String nameField) {
        MortgagePage mortgagePage = new MortgagePage();
        mortgagePage.clearInputField(nameField);
        return this;
    }

    @Step("Вводим в поле {nameField} тестовые данные {count}")
    public MortgagePageSteps inputInField(String nameField, String count) {
        MortgagePage mortgagePage = new MortgagePage();
        mortgagePage.inputInField(nameField, count);
        return this;
    }

    @Step("Выставляем верные значения чекбоксов")
    public MortgagePageSteps switchButton(String buttonNumber) {
        MortgagePage mortgagePage = new MortgagePage();
        mortgagePage.switchButton(buttonNumber);
        return this;
    }


    @Step("Проверяем поле 'Сумма кредита' {value}")
    public MortgagePageSteps assertCreditCost(String value) {
        MortgagePage mortgagePage = new MortgagePage();
        Assert.assertEquals("Поле 'Сумма кредита' не соответствует ожиданию", value, mortgagePage.assertCreditCost());
        return this;
    }

    @Step("Поверяем поле 'Ежемесячный платеж' {value}")
    public MortgagePageSteps assertMonthlyPayment(String value) {
        MortgagePage mortgagePage = new MortgagePage();
        Assert.assertEquals("Поле 'Ежемесячный платеж' не соответствует ожиданию", value, mortgagePage.assertMonthlyPayment());
        return this;
    }

    @Step("Проверяем поле 'Необходимый доход' {value}")
    public MortgagePageSteps assertRequiredIncome(String value) {
        MortgagePage mortgagePage = new MortgagePage();
        Assert.assertEquals("Поле 'Необходимый доход' не соответствует ожиданию", value, mortgagePage.assertRequiredIncome());
        return this;
    }

    @Step("Проверяем поле Процентная ставка' {value}")
    public MortgagePageSteps assertRate(String value) {
        MortgagePage mortgagePage = new MortgagePage();
        AllureUtils.addScreen();
        Assert.assertEquals("Поле 'Процентная ставка' не соответствует ожиданию", value, mortgagePage.assertRate());
        return this;
    }
}
