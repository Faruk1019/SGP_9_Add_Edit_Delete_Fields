package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.Then;

public class EditFieldsStepDefinition {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;


    @Then("User should edit the fields {string} and {string}")
    public void user_should_edit_the_fields_and_and(String name, String code) throws InterruptedException {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        dialogContentElements.editFields(name, code);

    }

}
