package Driver;

import io.appium.java_client.ios.IOSDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
public class IphoneManager extends DriverManager {

    @Override
    public void createDriver() throws Exception {
        capabilities.setCapability("deviceName", "device");
        capabilities.setCapability("platformName", "iOS");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}