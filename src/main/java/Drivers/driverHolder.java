package Drivers;
import org.openqa.selenium.WebDriver;
public class driverHolder {
    // TODO: define local thread from driver
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        driverHolder.driver.set(driver);
    }

}
