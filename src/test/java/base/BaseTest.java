package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

    public void setup() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                caps);
    }

    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }
}