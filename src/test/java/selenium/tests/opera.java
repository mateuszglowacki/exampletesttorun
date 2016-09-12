package selenium.tests;

//Info: When you write your code IntelliJ automatically adds required classes
//Also you can select and add required classes by pressing ALT+Enter then select related class
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

/**
 * Created by ONUR BASKIRT on 26.08.2015.
 */
public class opera {

    @Rule
    public MethodRule watchman = new TestWatchman() {
        public void starting(FrameworkMethod method) {
            System.out.println("Starting test: " + method.getName());
        }
    };
    //We should add @Test annotation that JUnit will run below method
    @Test
    //Start to write our test method. It should ends with "Test"
    public void opera1Test(){
        System.setProperty("webdriver.opera.driver", "C:/operadriver.exe");
        WebDriver driver = new OperaDriver();
        //Step 1- Driver Instantiation: Instantiate driver object as FirefoxDriver
        //WebDriver driver = new FirefoxDriver();

        //Step 2- Navigation: Open a website
        driver.navigate().to("https://www.teknosa.com/");

        //Step 3- Assertion: Check its title is corFirstAutomationTestrect
        //assertEquals method Parameters: Message, Expected Value, Actual Value
        Assert.assertEquals("Title check failed!", "Teknsa Alışveriş Sitesi - Herkes İçin Teknoloji", driver.getTitle());

        //Step 4- Close Driver
        driver.close();

        //Step 5- Quit Driver
        driver.quit();
    }

    @Test
    public void opera2Test(){
        System.setProperty("webdriver.opera.driver", "C:/operadriver.exe");
        WebDriver driver = new OperaDriver();
        //Step 1- Driver Instantiation: Instantiate driver object as FirefoxDriver
        //WebDriver driver = new FirefoxDriver();

        //Step 2- Navigation: Open a website
        driver.navigate().to("http://google.om");

        //Step 3- Assertion: Check its title is corFirstAutomationTestrect
        //assertEquals method Parameters: Message, Expected Value, Actual Value
        //Assert.assertEquals("Title check failed!", "Teknosa Alışveriş Sitesi - Herkes İçin Teknoloji", driver.getTitle());

        //Step 4- Close Driver
        driver.close();

        //Step 5- Quit Driver
        driver.quit();
    }
}