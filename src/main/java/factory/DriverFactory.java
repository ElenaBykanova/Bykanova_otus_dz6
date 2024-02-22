package factory;

import exceptions.BrowserNotFoundException;
import factory.impl.ChromeSettings;
import factory.impl.FirefoxSettings;
import factory.impl.iDriverSettings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    private String browserName = System.getProperty("browser.name");

    public WebDriver create(String mode){
        browserName = browserName.trim().toLowerCase();
        switch (browserName){
            case "chrome":{
                ChromeOptions options = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                options.addArguments(mode);
                return new ChromeDriver(options);
            }
        }
        throw new BrowserNotFoundException(browserName);
    }

    public WebDriver create(){
        browserName = browserName.trim().toLowerCase();

        switch (browserName){
            case "chrome":{
                return new ChromeDriver((ChromeOptions)new ChromeSettings().settings());
            }

            case "firefox":{
                return new FirefoxDriver((FirefoxOptions)new FirefoxSettings().settings());
            }
        }
        throw new BrowserNotFoundException(browserName);
    }

}
