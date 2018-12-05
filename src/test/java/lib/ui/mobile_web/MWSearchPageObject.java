package lib.ui.mobile_web;

import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWSearchPageObject extends SearchPageObject {

    static {
        SEARCH_INIT_ELEMENT = "css:#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_CANCEL_BUTTON = "css:button.cancel";
        SEARCH_RESULT_BY_STRING_TPL = "xpath://*[contains(@class,'wikidata-description')][contains(text(), '{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "css:ul.page-list>li.page-summary";
        SEARCH_EMPTY_RESULT_ELEMENT = "css:p.without-results";
        SEARCH_LIST_ITEM_TITLE = "id:org.wikipedia:id/page_list_item_title";
        SEARCH_RESULT_BY_STRING_AND_DESCRIPTION_TPL = "xpath://*[@resource-id='org.wikipedia:id/page_list_item_container'] and contains(., '{SUBSTRING}') and contains(., '{DESCRIPTION}')]";
    }

    public MWSearchPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
