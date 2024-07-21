package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;

public class PO_Gmail extends FW_Page {

    private static final String LO_LNK_GMAIL_SIGNIN = "//a[contains(text(),'Sign in')]";
    private static final String LO_LNK_GMAIL_TEXT = "//input[@type='email']";
    private static final String LO_LNK_GMAIL_NEXT = "//span[@jsname='V67aGc']";


    public PO_Gmail(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage() {
        return validateLocatorExists(LO_LNK_GMAIL_SIGNIN, 10, 1);
    }

    public String clickSignIn() {
        return clickLocator(LO_LNK_GMAIL_SIGNIN, 10);
    }

    public String enterText() {
      return clickLocator(LO_LNK_GMAIL_TEXT, 10);
    }

    public String clickNext() {
        return clickLocator(LO_LNK_GMAIL_NEXT, 10);
    }
}

