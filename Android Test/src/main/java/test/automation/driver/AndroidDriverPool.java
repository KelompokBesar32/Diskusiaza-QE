package test.automation.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverPool {
    public static AndroidDriver create() {
        AndroidDriver<AndroidElement> driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();
        String appiumUrl = "http://127.0.0.1:4723/wd/hub/";

        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.NO_RESET, false);
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/diskus.apk");
        caps.setCapability("unicodeKeyboard",true);
        caps.setCapability("resetKeyboard",true);
        caps.setCapability("connectHardwareKeyboard", false);
        try {
            driver = new AndroidDriver<AndroidElement>(new URL(appiumUrl), caps);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.hideKeyboard();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

}
