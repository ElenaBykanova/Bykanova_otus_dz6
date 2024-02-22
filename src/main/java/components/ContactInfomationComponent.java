package components;

import common.AbsCommon;
import data.CommunicationMethodData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ContactInfomationComponent extends AbsCommon {

    public ContactInfomationComponent(WebDriver driver) {
        super(driver);
    }

    public ContactInfomationComponent selectCommunicationMethod(int nomer, CommunicationMethodData communicationMethodData, String nikName) {

        //тут кликаем в выпадашку "Способ связи"
        WebElement selectCommunicationMethodElement = driver.findElement
                (By.xpath(String.format("//input[contains(@name,'contact-%s-service')]/following-sibling::div", nomer)));
        selectCommunicationMethodElement.click();

        //тут нужно дождаться когда откроется список
        WebElement communicationMethodContainer = driver.findElement
                (By.xpath(String.format("//input[contains(@name,'contact-%s-service')]/../following-sibling::div", nomer)));
        waitTools.waitForCondition(ExpectedConditions.not(ExpectedConditions.attributeContains(communicationMethodContainer,"class","hide")));

        //тут выбираем элемент из списка
        List<WebElement> communicationMethodItemElement = driver.findElements
                (By.cssSelector(String.format("[title='%s']", communicationMethodData.getName())));
        communicationMethodItemElement.get(nomer).click();

        //тут ждем когда список закроется
        waitTools.waitForCondition(ExpectedConditions.attributeContains(communicationMethodContainer,"class","hide"));

        driver.findElement
                (By.xpath(String.format("//input[contains(@name,'contact-%s-value')]", nomer))).sendKeys(nikName);

        return this;

    }

    public ContactInfomationComponent addAnotherCommunicationMethod(){
        driver.findElement
                (By.xpath("//p[.='Контактная информация']/..//button[.='Добавить']")).click();

        return this;
    }

}
