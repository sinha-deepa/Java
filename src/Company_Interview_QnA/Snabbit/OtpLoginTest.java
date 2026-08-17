package Company_Interview_QnA.Snabbit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class OtpLoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("platformName", getProperty("platformName", "Android"));
        capabilities.setCapability("appium:automationName", getProperty("automationName", "UiAutomator2"));
        capabilities.setCapability("appium:deviceName", getProperty("deviceName", "Android Emulator"));
        capabilities.setCapability("appium:appPackage", getRequiredProperty("appPackage"));
        capabilities.setCapability("appium:appActivity", getRequiredProperty("appActivity"));

        driver = new RemoteWebDriver(
                new URL(getProperty("appiumServerUrl", "http://127.0.0.1:4723")),
                capabilities
        );
    }

    @Test
    public void validateOtpLoginFlow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private String getRequiredProperty(String propertyName) {
        String propertyValue = System.getProperty(propertyName);
        if (propertyValue == null || propertyValue.trim().isEmpty()) {
            throw new IllegalArgumentException("Missing required system property: " + propertyName);
        }
        return propertyValue;
    }

    private String getProperty(String propertyName, String defaultValue) {
        String propertyValue = System.getProperty(propertyName);
        return propertyValue == null || propertyValue.trim().isEmpty() ? defaultValue : propertyValue;
    }
}
