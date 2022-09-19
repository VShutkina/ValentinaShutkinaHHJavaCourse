package lesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {

  @FindBy(xpath = "//li[contains(@class,'serp-item_card')]//h2")
  List<WebElement> searchResults;

  protected SearchPage(WebDriver driver) {
    super(driver);
  }

  public boolean isSearchPageDisplayed() {
    return driver.getCurrentUrl().contains("https://yandex.ru/search");
  }

  public boolean isSearchResultDisplayed(String value) {
    return searchResults.stream().anyMatch(e -> e.getText().contains(value));
  }


}
