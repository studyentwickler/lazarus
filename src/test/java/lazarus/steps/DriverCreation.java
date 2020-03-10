package lazarus.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class DriverCreation extends StepHelper{

    private static final String MAC_DRIVER_PATH = "src/test/resources/drivers/chromedriver";

    @Given("I am using the browser Chrome")
    public void i_am_using_the_browser_Chrome() {

        System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);

        // Start block to make logging off

        /*
        *  ####### Make off the logging out in console of Selenium #######
        * Mär 10, 2020 9:01:34 AM org.openqa.selenium.remote.ProtocolHandshake createSession
        * INFORMATION: Detected dialect: W3C
        * */

        System.setProperty("webdriver.chrome.silentOutput", "true");
        System.setProperty("webdriver.chrome.silentLogging", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        // End of block


        ChromeOptions options = new ChromeOptions();

        options.addArguments("test-type");
        options.addArguments("--js-flags=--expose-gc");
        options.addArguments("--enable-precise-memory-info");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-default-apps");
        options.addArguments("test-type=browser");
        options.addArguments("--disable-notifications");
        options.addArguments("window-size=1900,1084");
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");
        //options.addArguments("--headless");

        logger.info("############ Opening a browser Chrome ############");

        driver = new ChromeDriver(options);

    }

}
