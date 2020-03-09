package lazarus.steps;

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
}
