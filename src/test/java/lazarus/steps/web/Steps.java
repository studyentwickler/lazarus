package lazarus.steps.web;

import io.cucumber.java.en.Given;
import lazarus.steps.StepHelper;

public class Steps extends StepHelper {

    @Given("I go to the main {string}")
    public void i_go_to_the_main(String url) {

        logger.info("The opened URL is : " + url);
        driver.get(url);
    }

}
