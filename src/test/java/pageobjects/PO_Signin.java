package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;
import framework.utilities.FW_ConfigMgr;
import framework.utilities.FW_StringUtils;

public class PO_Signin extends FW_Page {

    private static final String LO_LNK_GMAIL_TEXT = "//input[@type='email']";
    private static final String LO_LNK_GMAIL_NEXT = "//span[contains(text(),'Next')]";
    private static final String LO_LNK_GMAIL_VERIFY = "//span[contains(text(),'to continue to Gmail')]";


    public PO_Signin(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage() {
        return validateLocatorExists(LO_LNK_GMAIL_VERIFY, 10, 1);
    }

    public String enterEmail(String email) {
        String result = setText(LO_LNK_GMAIL_TEXT, email, FW_ConfigMgr.getDefaultTimeout(), false);
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String clickNext() {
        return clickLocator(LO_LNK_GMAIL_NEXT, 10);
    }
}
