package browsers;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static utils.Constants.APP_START_URL;
import static utils.Constants.LANDING_PAGE_TITLE;

/**
 * Created by A.Biswas on 10/16/2017.
 */
@Test(groups = {"mac", "windows"})
public class ApplicationStart
{
    private WebDriver webDriver=null;

    @BeforeTest
    public void setUpBrowser()
    {
        //Initialize Browser and get the driver here
        webDriver=Crome.getChromeDriver(webDriver);
        // webDriver=Firefox.getFirefoxDriver(webDriver);
    }

    @Test
    public void homeTitleTestCase()
    {
        //Start calling your test Case methods
        webDriver.get(APP_START_URL);
        String pageTitle=webDriver.getTitle();
        Assert.assertEquals(pageTitle,LANDING_PAGE_TITLE);
    }


    @AfterTest
    public void testTeardown(){

        //Complete and exit the test cases
        webDriver.quit();
    }

}
