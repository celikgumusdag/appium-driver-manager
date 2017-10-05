import Driver.DriverManager;
import Driver.DriverManagerFactory;
import org.openqa.selenium.WebDriver;

public class Run {

    protected static WebDriver driver;

    public static void main(String[] args) {
        DriverManager driverManager;
        driverManager = DriverManagerFactory.getManager();
        try {
            driver = driverManager.getDriver();
        } catch (Throwable ex) {
            System.out.println("Error: " + ex);
        }
    }
}