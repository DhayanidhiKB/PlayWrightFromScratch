package PlaywrightBasics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDOM {

    public static void main(String[] args){

        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page= browser.newPage();
        page.navigate("https://books-pwakit.appspot.com/");
        page.locator("book-app[apptitle='BOOKS'] #input").fill("Praveenautomation");

        //If Shadown dom is present inside Iframe then use
        //page.frameLocator("locator value").locator("book-app[apptitle='BOOKS'] #input").fill("Praveenautomation");

    }
}
