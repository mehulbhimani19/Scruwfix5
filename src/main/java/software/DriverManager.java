package software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.lift.find.PageTitleFinder;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DriverManager
{

    public  static WebDriver driver;


    public static void setUp()
    {
        driver=new FirefoxDriver();
      Utility.WaitImplicitly(10);
      //  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        driver.get("http://www.screwfix.com");
         driver.navigate().to("http://www.screwfix.com");
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public static void ScreenShortWhenFail (ITestResult result )
    {
        if (ITestResult.FAILURE==result.getStatus())
        {
            Utility.captureScreenShort( driver,result.getName());
        }
        driver.quit();
    }

}
