package lesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
  private static final String URL = "https://dzen.ru/";
  @FindBy(xpath = "//li[contains(@class, 'mini-suggest__item')]")
  List<WebElement> autoSuggestList;
  //  @FindBy(xpath = "//input[@aria-label='Запрос']")
  @FindBy(xpath = "//form/input")
  private WebElement searchField;
  @FindBy(xpath = "//iframe[contains(@class, 'dzen-search')]")
  private WebElement iframe;
  @FindBy(xpath = "//button[@class='arrow__button']")
  private WebElement submitButton;

  protected HomePage(WebDriver driver) {
    super(driver);
  }

  public void openURL() {
    driver.get(URL);
  }

  public void switchToIframe() {
    driver.switchTo().frame(iframe);
  }

  public void fillSearchField(String input) {
    WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(ExpectedConditions.elementToBeClickable(searchField));
    searchField.clear();
    searchField.sendKeys(input);
  }

  public void clickSubmitButton() {
    submitButton.click();
  }

  public void switchToOriginalWindow() {
    driver.switchTo().defaultContent();
  }

  public boolean isAutoSuggestResultsDisplayed(String input) {
    WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(ExpectedConditions.visibilityOfAllElements(autoSuggestList));
    return autoSuggestList.stream().anyMatch(e -> e.getText().contains(input));
  }

  public void switchToOpenedTab() {
    List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(browserTabs.get(0));
    //закрываем первую табу
    driver.close();
    driver.switchTo().window(browserTabs.get(1));
  }
}
