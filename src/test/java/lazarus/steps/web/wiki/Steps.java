package lazarus.steps.web.wiki;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lazarus.steps.StepHelper;
import lazarus.steps.pages.wiki.MainPage;
import org.junit.Assert;

public class Steps extends StepHelper {

    @And("I go to the main web page {string}")
    public void i_go_to_the_main_web_page(String url) {

        logger.info("The web page, which should be checked, is: " + url);
        driver.get(url);

    }

    @Then("I start to check that in right top corner I have text {string} and link title {string}")
    public void iStartToCheckThatInRightTopCornerIHaveTextAndLinkTitle(String text, String title) {

        MainPage mainpage = new MainPage(driver);
        logger.info("Checking the greeting wording in the left top corner, that 'Welcome to' is " + "'" + mainpage.get_welcome_to() + "'");
        Assert.assertEquals("Welcome to", mainpage.get_welcome_to());
        logger.info("Checking the title 'Welcome', it should be the same: " + "'" + mainpage.get_welcome_title() + "'");
        Assert.assertEquals("Wikipedia", mainpage.get_welcome_title());

    }
}
