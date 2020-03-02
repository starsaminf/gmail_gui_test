package hook;

import core.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

public class Hook {

    private WebDriver webDriver;

    public Hook() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    @After(order = 0, value = "@cleam")
    public void tearDown() {
        WebDriverManager.getInstance().quitDriver();
    }
}