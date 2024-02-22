package factory.impl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class FirefoxSettings implements iDriverSettings {

    {
        WebDriverManager.firefoxdriver().setup();
    }
    @Override
    public AbstractDriverOptions settings() {
        return new FirefoxOptions();
    }
}
