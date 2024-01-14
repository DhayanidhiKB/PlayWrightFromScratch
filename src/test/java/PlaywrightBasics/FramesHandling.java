package PlaywrightBasics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FramesHandling {

    public static void main(String[] args){

        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page= browser.newPage();
        page.navigate("https://londonfreelance.org/courses/frames/");

        String valueInsideFrame=page.frameLocator("xpath=//frame[@name='main']").locator("h2").textContent();
        //System.out.println(valueInsideFrame);

        String valueInsideFrame2=page.frame("main").locator("h2").textContent();
        System.out.println(valueInsideFrame2);

    }
}
