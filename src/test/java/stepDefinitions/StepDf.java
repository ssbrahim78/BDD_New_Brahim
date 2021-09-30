package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPages.AmazonHomePage;

import java.io.IOException;

public class StepDf extends AmazonHomePage {


    @Given("load the data with the data with {string}")
    public void load_the_data_with_the_data_with(String string) {

    }
    @Given("with data file prefixed with {string} and json file is {string}")
    public void with_data_file_prefixed_with_and_json_file_is(String string, String string2) {

    }
    @Then("call apis and validate with all the data provided")
    public void call_apis_and_validate_with_all_the_data_provided() {
    }
    @Given("the user lands to the Amazon home page")
    public void the_user_lands_to_the_amazon_home_page() {
        System.out.println(driver.getTitle());
        try {
            System.out.println(loadProperties("src/test/resources/configJ.properties").getProperty("ImplicitlyWaitTime"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @When("user enter {string}")
    public void user_enter(String input) {

        SearchBox.sendKeys(input);
        SearchBoxButton.click();
    }
    @Then("user should see a corespending {string}")
    public void user_should_see_a_corespending(String string) {
        System.out.println(driver.getTitle());
    }
}
