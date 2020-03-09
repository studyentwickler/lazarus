package lazarus.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverCreation extends StepHelper{

    private static final String MAC_DRIVER_PATH = "src/test/resources/drivers/chromedriver";

    @Given("I am using the browser Chrome")
    public void i_am_using_the_browser_Chrome() {

        System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);

        ChromeOptions options = new ChromeOptions();

        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("--js-flags=--expose-gc");
        options.addArguments("--enable-precise-memory-info");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-default-apps");
        options.addArguments("test-type=browser");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("window-size=1900,1084");
        //options.addArguments("--headless");

        logger.info("############ Opening a browser Chrome ############");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Point point = new Point(500, 4);
        driver.manage().window().setPosition(point);
    }


    @And("I close the browser Chrome")
    public void i_close_the_browser_Chrome() {

        logger.info("############ Closing a browser Chrome ############");
        driver.close();

    }
}
