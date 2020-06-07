package sber.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.BaseSteps;


public class BasePage {



    public WebElement waitClickElement(WebElement element) {   // метод ожидания кликабельности элемента и клик на этот элемент
        return BaseSteps.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement visibilityElement(WebElement element) { // метод ожидания видимости элемента
        return BaseSteps.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void moveTo(WebElement element) {  // метод движения курсора до элемента
        Actions actions = new Actions(BaseSteps.getDriver());
        actions.moveToElement(element).perform();
    }

    public void switchInFrame(WebElement element) {
        BaseSteps.getDriver().switchTo().frame(element);
    }

    public void changeWait() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
