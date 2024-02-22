package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends AbsBasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private String login = System.getProperty("login");
    private String password = System.getProperty("password");
    private final Logger logger = LogManager.getLogger(MainPage.class);


    //динамический элемент. Работа с дин. элементом происходит в методе
//    private String searchFieldSelector = ".search";

    //статика хранится в стеке выполнения. Так нельзя. Стек нерасширяемый
    //private static String searchFieldSelector = ".search";

    //шаблон локатор
//    private String courseTypeLocatorTemplate="//secrion//*[text()='%s']";

    //статический элемент'
//    @FindBy(xpath = "//button[text()='Войти']")
//    private WebElement LoginButtonLocator;

    String LoginButtonLocator = "//button[text()='Войти']";

//    @FindBy(css = "h3")
//    private List<WebElement> headerTitleElement2;

    public MainPage loginClick() {
        waitTools.waitElementPresent(By.xpath(LoginButtonLocator));
        driver.findElement(By.xpath(LoginButtonLocator)).click();
        logger.info("Кликнули по кнопке войти");
        return this;
    }

    public MainPage doAuth() {
        driver.findElement(By.xpath("//div[./input[@name='email']]")).click();
        WebElement elInputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        waitTools.waitForCondition(ExpectedConditions.visibilityOf(elInputEmail));
        elInputEmail.sendKeys(login);

        driver.findElement(By.xpath("//div[./input[@type='password']]")).click();
        WebElement elInputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        waitTools.waitForCondition(ExpectedConditions.visibilityOf(elInputEmail));
        elInputPassword.sendKeys(password);
        logger.info("Ввели логин и пароль");

        driver.findElement(By.cssSelector("#__PORTAL__ button")).click();
        logger.info("Авторизовались");


        return this;
    }

    public void goToMyProfile() {
        ///img/blue-
        String blueOwlImgLocator = "//img[contains(@src,'owl')]";
        waitTools.waitForCondition(ExpectedConditions.elementToBeClickable(By.xpath(blueOwlImgLocator)));
        driver
                .findElement(By.xpath(blueOwlImgLocator))
                .click();

        String enterLocator="//a[@href='https://otus.ru/lk/biography/personal']";
        waitTools.waitForCondition(ExpectedConditions.elementToBeClickable(By.xpath(enterLocator)));
        driver
                .findElement(By.xpath(enterLocator))
                .click();

        logger.info("Перешли в личный кабинет");

    }

}
