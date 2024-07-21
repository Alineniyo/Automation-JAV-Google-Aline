package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;

public class PO_About extends FW_Page {

    private static final String LO_LNK_About_Products = "//a[contains(text(),'Products')]";

    public PO_About(WebDriver driver) {     
        super(driver);
    }

    public String validateOnPage() {
        return validateLocatorExists(LO_LNK_About_Products, 10, 1);
    }

    public String clickProducts() {
        return clickLocator(LO_LNK_About_Products, 10);
    }
}