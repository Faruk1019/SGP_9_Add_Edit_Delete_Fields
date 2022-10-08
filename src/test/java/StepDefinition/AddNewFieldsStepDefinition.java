package StepDefinition;

import POM.DialogContentElements;
import POM.LoginPageElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class AddNewFieldsStepDefinition {

    LoginPageElements loginPageElements;
    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPageElements = new LoginPageElements();
        loginPageElements.validateUserOnLoginPage();
    }

    @When("User enter admin credentials")
    public void user_enter_admin_credentials() {
        loginPageElements = new LoginPageElements();
        loginPageElements.userEnterAdminCredentials();
    }

    @And("User should login successfully")
    public void user_should_login_successfully() throws InterruptedException {
        loginPageElements = new LoginPageElements();
        loginPageElements.validateUserSuccessfullyLoggedIn();
    }

    @Then("User navigate to fields section")
    public void user_navigate_to_fields_section(){
        navigationBarElements = new NavigationBarElements();

        navigationBarElements.navigateToFieldsPage();
    }

    @Then("User create a new fields {string} and {string} and {string}")
    public void user_create_a_new_fields_and_and(String name, String code, String fieldType) throws InterruptedException {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        dialogContentElements.createFields(name, code, fieldType);

    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        dialogContentElements.validateSuccessMessage();

    }

}
