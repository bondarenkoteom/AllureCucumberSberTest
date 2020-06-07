package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseSteps {
    private static WebDriver driver;
    public static WebDriverWait wait;

    private static String mainPage = "https://www.sberbank.ru/ru/person";

    public static void setUp() {


        String browser = System.setProperty("browser", "chrome");

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "opera":
                System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
                driver = new OperaDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get(mainPage);
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }


}
