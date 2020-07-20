package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTests {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();

    }
    @Test
    public  void test (){
        Assert.assertEquals(driver.getTitle(), "Google");

    }
    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }
}
