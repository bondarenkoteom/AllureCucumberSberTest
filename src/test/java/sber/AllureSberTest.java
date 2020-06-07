package sber;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import steps.BaseSteps;
import steps.MainPageSteps;
import steps.MortgagePageSteps;


public class AllureSberTest {
    private MainPageSteps mainPageSteps = new MainPageSteps();
    private MortgagePageSteps mortgagePageSteps = new MortgagePageSteps();

    @Before
    public void setUo() {
        BaseSteps.setUp();
    }

    @Test
    public void sberTest() {
        mainPageSteps
                .selectToMortgage() // В верхнем меню "навестись" на Ипотека | 2 пункт ДЗ
                .selectToMortgageHome(); // дождаться открытия выпадающего меню и выбрать 'Ипотека на готовое жилье' | 2 пункт ДЗ
        mortgagePageSteps
                .switchInFrameMort() // переходим к полю 'Рассчитайте ипотеку'
                .clearInputField("Стоимость недвижимости") // чистим поле 'Стоимость недвижимости'
                .inputInField("Стоимость недвижимости", "5_180_000") // Заполнить поля - Стоимость недвижимости 5 180 000 ₽ | 3 пункт ДЗ
                .clearInputField("Первоначальный взнос") // чистим поле 'Стоимость недвижимости'
                .inputInField("Первоначальный взнос", "3_058_000") // Заполнить поля - Первоначальный взнос 3 058 000 ₽ | 3 пункт ДЗ
                .clearInputField("Срок кредита") // чистим поле 'Стоимость недвижимости'
                .inputInField("Срок кредита", "30") // Заполнить поля - Срок кредита 30 лет | 3 пункт ДЗ
                .switchButton("2") // Снять галочку - есть зарплатная карта сбербанка | 3 пункт ДЗ
                .switchButton("3") // дождаться появления "есть возможность подтвердить доход справкой" | 3 пункт ДЗ
                .switchButton("6") // поставить галочку "молодая семья" | 3 пункт ДЗ
                .assertCreditCost("2 122 000 ₽") // проверяем поле 'Сумма кредита' на соответсвие
                .assertMonthlyPayment("16 922 ₽") // проверяем поле 'Ежемесячный платеж' на соответсвие
                .assertRequiredIncome("28 203 ₽") // проверяем поле 'Необходимый доход' на соответсвие
                .assertRate("11 %"); // проверяем поле 'Процентная ставка' на соответсвие

    }

    @After
    public void tearDown() {
        BaseSteps.tearDown();
    }
}
