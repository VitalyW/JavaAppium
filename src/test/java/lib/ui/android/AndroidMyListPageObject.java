package lib.ui.android;

import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMyListPageObject extends MyListsPageObject {

     static {
         FOLDER_BY_NAME_TMP = "xpath://*[@text='{FOLDER_NAME}']";
         ARTICLE_BY_TITLE_TMP = "xpath://*[@text='{TITLE}']";
     }

    public AndroidMyListPageObject(RemoteWebDriver driver) {
        super(driver);
    }

}
