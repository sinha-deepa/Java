/*
"Write Appium code to automate selecting a service from the catalogue, choosing a slot, and confirming the booking.
How would you validate that the booking confirmation screen shows the correct slot?"
 */

package Company_Interview_QnA.Snabbit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Booking_Appium_Code_Test {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("platformName", getProperty("platformName", "Android"));
        capabilities.setCapability("appium:automationName", getProperty("automationName", "UiAutomator2"));
        capabilities.setCapability("appium:deviceName", getProperty("deviceName", "Android Emulator"));
        capabilities.setCapability("appium:appPackage", getRequiredProperty("appPackage"));
        capabilities.setCapability("appium:appActivity", getRequiredProperty("appActivity"));

        driver = new RemoteWebDriver(new URL(getProperty("appiumServerUrl", "http://127.0.0.1:4723")), capabilities);
    }

    @Test
    public void validateServiceBookingFlow() {
        // 1. Select a service from the catalogue
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        List<WebElement> serviceCards = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.snabbit:id/service_card")));

        WebElement targetService = serviceCards.stream()
                .filter(element -> element.getText().equalsIgnoreCase("Home Cleaning"))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Home Cleaning service not found in catalogue"));
        targetService.click();

        // 2. Choose a slot
        WebElement availableSlot = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                "//android.widget.TextView[@resource-id='com.snabbit:id/slot_time' and @enabled='true']")));
        String selectedSlotText = availableSlot.getText();
        availableSlot.click();

        // 3. Proceed to confirm booking
        WebElement confirmButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("com.snabbit:id/btn_confirm_booking")));
        confirmButton.click();

        // 4. Validate booking confirmation screen shows the correct slot
        WebElement confirmationSlotText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("com.snabbit:id/confirmation_slot_text")));
        Assert.assertEquals(
                confirmationSlotText.getText().trim(),
                selectedSlotText.trim(),
                "Booking confirmation slot does not match the slot selected by the user");

        // Bonus: validate booking ID/reference is generated (not just UI text match)
        WebElement bookingReferenceId = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("com.snabbit:id/booking_reference_id")));
        Assert.assertFalse(bookingReferenceId.getText().trim().isEmpty(), "Booking reference ID should be generated");
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
