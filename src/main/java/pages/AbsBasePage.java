package pages;

import common.AbsCommon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsBasePage extends AbsCommon {

    private String BASE_URL = System.getProperty("base.url");

    public AbsBasePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open(){
        driver.get(BASE_URL);
    }

    public void open(String path){
        driver.get(BASE_URL + path);
    }

}
