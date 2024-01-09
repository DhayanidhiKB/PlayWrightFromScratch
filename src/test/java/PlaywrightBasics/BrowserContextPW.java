package PlaywrightBasics;


import com.microsoft.playwright.*;

public class BrowserContextPW {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext context= browser.newContext();

        // Create a new page inside context.
        Page page1 = context.newPage();
        page1.navigate("https://www.youtube.com/");
       // Dispose context once it is no longer needed.
        context.close();

       BrowserContext context2=browser.newContext();
       Page page2=context2.newPage();
       page2.navigate("https://www.facebook.com/");
       context2.close();


    }
}
