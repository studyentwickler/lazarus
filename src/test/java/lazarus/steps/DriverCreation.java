package lazarus.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class DriverCreation extends StepHelper {

    private static final String MAC_DRIVER_PATH = "src/test/resources/drivers/chromedriver_mac";
    private static final String WIN_DRIVER_PATH = "src/test/resources/drivers/chromedriver_win.exe";
    private static final String LINUX_DRIVER_PATH = "src/test/resources/drivers/chromedriver_linux";

    @Given("I am using the browser Chrome")
    public void i_am_using_the_browser_Chrome() {

        String oS = System.getProperty("os.name").toLowerCase();

        if (oS.contains("windows")) {

            System.setProperty("webdriver.chrome.driver", WIN_DRIVER_PATH);

        } else if (oS.contains("mac")) {

            System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);

        } else if (oS.contains("linux")) {

            System.setProperty("webdriver.chrome.driver", LINUX_DRIVER_PATH);

        } else {

            logger.info("This is the OS: " + oS);
            logger.info("OS is not compatible, you need define the path of the chromedriver_mac again");
            System.exit(0);

        }

        // Start block to make logging off

        /*
         *  ####### Make off the logging out in the console of Selenium #######
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
        options.addArguments("--no-sandbox"); //fix launch on linux
        //options.addArguments("--disable-dev-shm-usage"); //fix launch on linux
        //options.addArguments("--headless");

        logger.info("############ Opening a browser Chrome ############");

        driver = new ChromeDriver(options);

    }

}
