package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    public static WebDriver browser;

    @BeforeClass
    public static void BrowserOpen() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        browser = new ChromeDriver();
    }

    @AfterClass
    public static void teardown(){
        browser.quit();
    }

}
