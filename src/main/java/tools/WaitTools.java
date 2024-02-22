package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTools {

    private WebDriver driver;

    public WaitTools(WebDriver driver){
        this.driver = driver;
    }

    public boolean waitForCondition(ExpectedCondition condition){
        try{
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(condition);
            return true;
        }
        catch(TimeoutException ignore){
            return false;
        }
    }

    public boolean waitNotElementPresent(By locator){
      return  this.waitForCondition(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(locator)));
    }

    public boolean waitElementPresent(By locator){
        return  this.waitForCondition(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
