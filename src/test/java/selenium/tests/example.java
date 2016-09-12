package selenium.tests;

/**
 * Created by Mateusz Głowacki on 10.09.2016.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import static org.junit.Assert.*;
public class example {
    private WebDriver driver;
    @Test
    public void testEasy() {
        driver.get("http://www.guru99.com/selenile.um-tutorial.html");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Free Selenium Tutorials"));
    }
    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
    }
    @After
    public void afterTest() {
        driver.quit();
    }
}
