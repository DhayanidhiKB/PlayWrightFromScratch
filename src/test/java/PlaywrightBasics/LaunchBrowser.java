package PlaywrightBasics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {

    public static void main(String[] args){

        Playwright playwright=Playwright.create(); //create a playwright server

        //Browser browser=playwright.chromium().launch();//Runs chrome browser in headless mode(first time it downloads chrome binaries)
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));//Opens chrome
        Page page= browser.newPage(); //Page class is used to perform operations in webPage
        page.navigate("https://www.amazon.in/"); //used to launch URL

        String title=page.title();
        System.out.println("Title of page is "+title);

        String url=page.url();
        System.out.println("URL of page is "+url);

        browser.close(); //close browser
        playwright.close(); //close playwirhgt server
    }
}
