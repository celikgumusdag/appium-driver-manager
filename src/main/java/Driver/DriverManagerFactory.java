package Driver;

import Helper.PropertyReader;

public class DriverManagerFactory {

    public static DriverManager getManager() {

        DriverManager driverManager;

        DriverType type = DriverType.valueOf(PropertyReader.getProperties("driver").toUpperCase());

        switch (type) {
            case ANDROID:
                driverManager = new AndroidManager();
                break;
            case IOS:
                driverManager = new IphoneManager();
                break;
            default:
                driverManager = new AndroidManager();
                break;
        }
        return driverManager;
    }
}