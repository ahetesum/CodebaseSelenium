package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by A.Biswas on 10/16/2017.
 */
public class Crome {
    //Initialize Your Firefox Driver
    public static WebDriver getChromeDriver(WebDriver webDriver)
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\A.biswas\\Desktop\\Softwares\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        webDriver= new ChromeDriver(options);

        return webDriver;
    }
}
