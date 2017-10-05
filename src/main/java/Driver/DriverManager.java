package Driver;

import Helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class DriverManager {

    protected WebDriver driver;
    protected DesiredCapabilities capabilities = new DesiredCapabilities();

    protected abstract void createDriver() throws Exception;

    public WebDriver getDriver() throws Exception {
        if (null == driver) {
            capabilities.setCapability("app", PropertyReader.getProperties("application"));
            createDriver();
        }
        return driver;
    }
}