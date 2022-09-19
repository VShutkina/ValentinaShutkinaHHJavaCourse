package lesson8;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DzenSearchTest extends BaseTest {

  private static final String SEARCH_VALUE = "холодильник";

  private HomePage homePage;
  private SearchPage searchPage;

  @Override
  @BeforeMethod
  public void setUp() {
    super.setUp();
    homePage = new HomePage(driver);
    searchPage = new SearchPage(driver);
  }

  @Test(description = "Проверить поиск на сайте dzen.ru")
  public void checkSearch() {
    // открываем dzen.ru
    homePage.openURL();
    Assert.assertEquals(driver.getTitle(), "Дзен", "Название страницы не совпадает");
    // переходим на нужный iframe
    homePage.switchToIframe();
    // вводим текст в строку поиска
    homePage.fillSearchField(SEARCH_VALUE);
    Assert.assertTrue(homePage.isAutoSuggestResultsDisplayed(SEARCH_VALUE),
        "Автосаджесты не верны");
    homePage.clickSubmitButton();
    // выходим из iframe
    homePage.switchToOriginalWindow();
    //переключаемся на новую открытую страницу поиска
    homePage.switchToOpenedTab();
    Assert.assertTrue(searchPage.isSearchPageDisplayed(),
        "Поисковая страница yandex не открылась");
    Assert.assertTrue(searchPage.isSearchResultDisplayed(SEARCH_VALUE),
        "Результаты поиска на страницу яндекса не верны");
  }
}
