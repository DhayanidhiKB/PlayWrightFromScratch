package PlaywrightBasics;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;


public class RecordTool {

    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://www.facebook.com/");
            page.getByTestId("open-registration-form-button").click();
            page.getByPlaceholder("First name").fill("Dhaya");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Surname")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Surname")).fill("KB");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number or email address")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number or email address")).fill("7200358428");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Month")).selectOption("5");
            page.getByLabel("Male", new Page.GetByLabelOptions().setExact(true)).check();
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Year")).selectOption("1998");
            page.locator("img").nth(2).click();

            //mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="codegen https://naveenautomationlabs.com/"
        }
    }
}

