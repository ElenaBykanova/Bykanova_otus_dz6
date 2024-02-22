package common;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import tools.WaitTools;

public abstract class AbsCommon {
    protected WebDriver driver;
    protected WaitTools waitTools;

     public AbsCommon(WebDriver driver) {
        this.driver = driver;
        waitTools = new WaitTools(driver);
    }

}
