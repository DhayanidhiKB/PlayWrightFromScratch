package PlaywrightBasics;

import com.microsoft.playwright.*;

public class TxtSelectors {

    public static void main(String[] args){

        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page= browser.newPage();
        page.navigate("https://demo.opencart.com/"); //https://www.orangehrm.com/

        //Commented method works with OrangeHRM website
      /*  Locator links=page.locator("text=Privacy Policy");

        for(int i=0;i< links.count();i++){
            String text=links.nth(i).textContent();
            if(text.contains("Service Privacy Policy")){
                links.nth(i).click();
                break;
            }
        }*/
        String footer=page.locator("h5:has-text('Customer Service')").textContent(); //<h5> Customer Service,</h5>
        //String footer=page.locator("div.row h5:has-text('Customer Service')").textContent(); //<div row </div> below <h5> Customer Service,</h5>
        page.locator("'Your Store'").textContent(); // page.locator("'Your Store'")=page.locator("text=Your Store")
        System.out.println(footer);

    }
}
