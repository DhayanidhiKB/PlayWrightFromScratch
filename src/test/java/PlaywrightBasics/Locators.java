package PlaywrightBasics;

import com.microsoft.playwright.*;

import java.util.List;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://www.orangehrm.com/");

        Locator demoButton = page.locator("text=Book a Free Demo");

        demoButton.locator("nth=1").click();//nth= locator passing a zero-based index.

        Locator countryOptions= page.locator("select#Form_getForm_Country");
        countryOptions.click();
        Thread.sleep(5000);
        System.out.println(countryOptions.count());

        List<String> options=countryOptions.allTextContents();
        Thread.sleep(5000);
        for(String countries:options){
            System.out.println(countries);

        }
       // options.forEach(ele-> System.out.println(ele));



    }
}

/* Note: demoButton.hover();
        demoButton.click();*/
//Error Message:locator("text=Book a Free Demo") resolved to 2 elements:Then use
