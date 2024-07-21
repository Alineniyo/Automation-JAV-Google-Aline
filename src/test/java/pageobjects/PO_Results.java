package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;

public class PO_Results extends FW_Page {

    private static final String LO_SEARCH_BY_VOICE = "//div[@class='microphone']";

    public PO_Results(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage(){
        return validateLocatorExists(LO_SEARCH_BY_VOICE, 10, 1);
    }

}