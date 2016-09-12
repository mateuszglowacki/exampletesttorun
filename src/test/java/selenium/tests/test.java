package selenium.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import java.io.File;

public class test {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
    }

    // If uploading to a Grid node or Sauce Labs, check out driver.setFileDetector()
    // https://saucelabs.com/resources/articles/selenium-file-upload

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void uploadFile() throws Exception {
        String filename = "some-file.txt";
        File file = new File(filename);
        String path = file.getAbsolutePath();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys(path);
        driver.findElement(By.id("file-submit")).click();
        String text = driver.findElement(By.id("uploaded-files")).getText();
        assertThat(text, is(equalTo(filename)));
    }

}
