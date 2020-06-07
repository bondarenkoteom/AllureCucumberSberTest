package steps;

import io.qameta.allure.Step;
import sber.pages.MainPage;

public class MainPageSteps {


    @Step("выбрать на главной странице вкладку 'Ипотека'")
    public MainPageSteps selectToMortgage() {
        MainPage mainPage = new MainPage();
        mainPage.moveToMortgage();
        return this;
    }

    @Step("выбрать в всплывающем окне вкладку 'Ипотека на готовое жилье'")
    public MainPageSteps selectToMortgageHome() {
        MainPage mainPage = new MainPage();
        mainPage.mortgageHome();
        return this;
    }
}
