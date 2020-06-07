package sber.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Ипотека')]")
    public WebElement mortgage;

    @FindBy(xpath = "//li[@class = 'lg-menu__sub-item']/a[contains(text(), 'Ипотека на готовое жильё')]")
    public WebElement mortgageForReadyHome;

    public void moveToMortgage() { // метод движения курсора до навазния 'Ипотека'
        moveTo(mortgage);
    }

    public void mortgageHome() { // метод перехода на вкладку 'Ипотека на готовое жилье' и клик на нее
        visibilityElement(mortgageForReadyHome);
        moveTo(mortgageForReadyHome);
        waitClickElement(mortgageForReadyHome).click();
    }


}
