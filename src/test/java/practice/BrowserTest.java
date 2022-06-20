package practice;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Log4j
public class BrowserTest {

    ChromeDriver driver;
    @BeforeTest
    public void setProperties() {
//        System.setProperty("webdriver.chrome.silentOutput", "true");
    }
    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        log.info("Initialize ChromeWebDriver");
        this.driver = new ChromeDriver();
        driver.get("https://google.lv");

    }
    @Test
    public void chromeDriverTest() {
      Assert.assertEquals(driver.getTitle(), "Google");
      driver.manage().window().maximize();


   //     driver.getTitle();
   //   <title>Google</title>

      //  ChromeDriver driver = new ChromeDriver();
       // driver.get("https://google.lv");
      //  driver.close();
    }
    //@Test
    //public void chromeDriverTest2() {
    //    ChromeDriver driver = new ChromeDriver();
    //    driver.get("https://google.lv");
    //    driver.close();
    //}

    @AfterMethod(alwaysRun =true)
    public void closeBrowser() {
        log.info("Closing ChromeWebDriver");
        driver.close();

    }
}
