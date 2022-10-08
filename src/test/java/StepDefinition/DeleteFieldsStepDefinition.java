package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.Then;

public class DeleteFieldsStepDefinition {
    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @Then("User should delete the fields {string}")
    public void user_should_delete_the_fields(String name) throws InterruptedException {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        dialogContentElements.deleteFields(name);

    }





}


