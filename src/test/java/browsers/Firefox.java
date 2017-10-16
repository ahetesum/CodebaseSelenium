package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by A.Biswas on 10/16/2017.
 */
public class Firefox
{
    //Initialize Your Firefox Driver
    public static WebDriver getFirefoxDriver(WebDriver webDriver)
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\A.biswas\\Desktop\\Softwares\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        webDriver= new FirefoxDriver();
        return webDriver;
    }
}
