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

public class OtpLoginTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        MutableCapabilities capabilities = new MutableCapabilities();

        capabilities.setCapability(
                "platformName",
                getProperty("platformName", "Android")
        );

        capabilities.setCapability(
                "appium:automationName",
                getProperty("automationName", "UiAutomator2")
        );

        capabilities.setCapability(
                "appium:deviceName",
                getProperty("deviceName", "Android Emulator")
        );

        capabilities.setCapability(
                "appium:appPackage",
                getRequiredProperty("appPackage")
        );

        capabilities.setCapability(
                "appium:appActivity",
                getRequiredProperty("appActivity")
        );

        driver = new RemoteWebDriver(
                new URL(
                        getProperty(
                                "appiumServerUrl",
                                "http://127.0.0.1:4723"
                        )
                ),
                capabilities
        );
    }

    @Test
    public void validateOtpLoginFlow() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));

        // ------------------------------------------------
        // 1. Enter phone number
        // ------------------------------------------------

        WebElement phoneNumberField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("com.snabbit:id/phone_number")
                )
        );

        phoneNumberField.clear();
        phoneNumberField.sendKeys(
                getRequiredProperty("testPhoneNumber")
        );


        // ------------------------------------------------
        // 2. Click Continue / Get OTP
        // ------------------------------------------------

        WebElement continueButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("com.snabbit:id/btn_continue")
                )
        );

        continueButton.click();


        // ------------------------------------------------
        // 3. Wait for OTP screen
        // ------------------------------------------------

        WebElement otpField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("com.snabbit:id/otp_input")
                )
        );


        // ------------------------------------------------
        // 4. Get dynamic OTP
        // ------------------------------------------------

        String otp = getOtp();

        Assert.assertNotNull(
                otp,
                "OTP should not be null"
        );

        Assert.assertFalse(
                otp.trim().isEmpty(),
                "OTP should not be empty"
        );


        // ------------------------------------------------
        // 5. Enter OTP
        // ------------------------------------------------

        otpField.clear();
        otpField.sendKeys(otp);


        // ------------------------------------------------
        // 6. Click Login / Verify OTP
        // ------------------------------------------------

        WebElement verifyButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("com.snabbit:id/btn_verify_otp")
                )
        );

        verifyButton.click();


        // ------------------------------------------------
        // 7. Validate successful login
        // ------------------------------------------------

        WebElement homeScreen = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("com.snabbit:id/home_screen")
                )
        );

        Assert.assertTrue(
                homeScreen.isDisplayed(),
                "Home screen should be displayed after successful OTP login"
        );
    }


    // ====================================================
    // Dynamic OTP handling
    // ====================================================

    private String getOtp() {

        /*
         * IMPORTANT:
         *
         * In a real automation framework, we should NOT
         * hardcode the OTP.
         *
         * OTP can be obtained through a test-controlled
         * mechanism such as:
         *
         * 1. Test API / backend test hook
         * 2. Dedicated test OTP service
         * 3. Database/test environment
         * 4. SMS interception in a controlled environment
         *
         * Here we are using a system property so that the
         * actual OTP source can be plugged into the framework.
         */

        return System.getProperty("testOtp");
    }


    // ====================================================
    // Required property
    // ====================================================

    private String getRequiredProperty(String propertyName) {

        String propertyValue =
                System.getProperty(propertyName);

        if (propertyValue == null ||
                propertyValue.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Missing required system property: "
                            + propertyName
            );
        }

        return propertyValue;
    }


    // ====================================================
    // Optional property with default value
    // ====================================================

    private String getProperty(
            String propertyName,
            String defaultValue) {

        String propertyValue =
                System.getProperty(propertyName);

        return propertyValue == null ||
                propertyValue.trim().isEmpty()
                ? defaultValue
                : propertyValue;
    }


    // ====================================================
    // Tear down
    // ====================================================

    @AfterClass(alwaysRun = true)
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}


/*
Your final 45-second interview answer

If they ask you to write the code and explain it, I'd present the code in this order:

"I start the Android Appium session in @BeforeClass. In the test, I use an explicit WebDriverWait rather
than hard sleeps. I locate the phone number field, enter a test number, request the OTP, wait for the OTP screen,
retrieve the OTP through a test-controlled mechanism rather than hardcoding it, enter it, and click Verify.
Finally, I assert that the expected post-login screen is displayed. In production-grade automation, I would keep
OTP retrieval separate from the UI layer and use a backend/test hook or controlled SMS mechanism.
I also use @AfterClass(alwaysRun=true) to ensure the Appium session is terminated even when the test fails."
 */