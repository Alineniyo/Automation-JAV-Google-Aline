package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;

public class PO_Home extends FW_Page {

    private static final String LO_LNK_GOOGLE_APPS = "//a[@aria-label='Google apps']";
    private static final String LO_EDT_SEARCH = "//textarea[@name='q']";
    private static final String LO_BUT_BASE_GOOGLE_SEARCH = "//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']";
    private static final String LO_BUT_GOOGLE_FEELING_LUCKY = "//input[@id='gbqfbb']";
    private static final String LO_Gmail = "//a[contains(text(),'Gmail')]";
    private static final String LO_About = "//a[contains(text(),'About')]";
    private static final String LO_Search_By_Voice = "//div[@aria-label='Search by voice']";
    public PO_Home(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage(){
        return validateLocatorExists(LO_LNK_GOOGLE_APPS, 10, 1);
    }

    public String enterSearch(String search){
        String result = setText(LO_EDT_SEARCH, search, 10, false);
        typeOnKeyboard("TAB"); // Close the dropdown if it exists
        return result;
    }

    public String clickBaseGoogleSearch(){
        return clickLocator(LO_BUT_BASE_GOOGLE_SEARCH, 10);
    }

    public String scroll_to_feeling_trendy_or_puzzled_or_curious(){
        return scrollToLocator(LO_BUT_GOOGLE_FEELING_LUCKY);
    }

    public String clickGoogleGmail(){
        return clickLocator(LO_Gmail, 10);
    }
    public String clickGoogleAbout(){
        return clickLocator(LO_About, 10);
    }
    public String clickGoogleSearchByVoice(){
        return clickLocator(LO_Search_By_Voice, 10);
    }

    }

