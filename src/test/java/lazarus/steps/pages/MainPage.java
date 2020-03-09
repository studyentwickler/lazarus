package lazarus.steps.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;

public class MainPage {

    WebDriver driver;

    protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Variables Section

    //Locators Section

    By signIn = By.xpath("");

    //Methods Section

}
