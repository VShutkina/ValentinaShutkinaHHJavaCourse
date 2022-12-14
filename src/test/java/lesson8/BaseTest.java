package lesson8;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson8.utils.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
  protected WebDriver driver;

  @BeforeSuite
  public void suiteSetUp() {
    Logger.restrictNettyLogger();
    WebDriverManager.chromedriver().setup();
  }

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
  }

}
