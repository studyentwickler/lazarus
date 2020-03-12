package lazarus.steps.pages.wiki;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Map;

public class MainPage {

    WebDriver driver;

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    // Variables Section

    //String get_welcome_to = get_welcome_to();

    // Locators Section

    By welcome_to = By.xpath("//*[@id=\"mp-topbanner\"]/div/div[1]");
    By welcome_title = By.xpath("//*[@id=\"mp-topbanner\"]/div/div[1]/a");

    // Methods Section

    public String get_welcome_to() {
        String[] welcome = driver.findElement(welcome_to).getText().split(" ");
        String welcome_to = welcome[0] + " " + welcome[1];
        return welcome_to;
    }

    public String get_welcome_title() {
        return driver.findElement(welcome_title).getText();
    }
}