package lazarus.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.PropertyConfigurator;
import java.util.Properties;

public class StepDefinitions extends StepHelper {

    @Before
    public void setupBefore() {

        Properties log4jProp = new Properties();
        log4jProp.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(log4jProp);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties");

    }

    @After
    public void afterMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            logger.info("⛔ ############################## ⛔ ");
            logger.info("Starting to finish the execution");
            logger.info("⛔ ############################## ⛔ ");
            logger.info("Test completed starting closing the driver");

        } else {

            logger.info("✅ ############################## ✅ ");
            logger.info("Test completed starting closing the driver");

        }

        try {

            driver.quit();

        } catch (Exception e) {
            //
        }

        logger.info("Test completed.");

    }
}
