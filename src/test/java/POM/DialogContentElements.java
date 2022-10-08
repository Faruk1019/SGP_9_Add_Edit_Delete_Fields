package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;

public class DialogContentElements extends BasePOM{

    public DialogContentElements(){PageFactory.initElements(driver, this);}

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement fieldNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement fieldCodeInput;

    @FindBy(css = "div[id='mat-select-value-9']")
    public WebElement selectFieldTypeDropdown;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='key']")
    private WebElement listOfValueKeyInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.VALUE']")
    private WebElement listOfValueValueInput;

    @FindBy(xpath = "//ms-button[@icon='plus']")
    private WebElement listOfValueAddButton;

    @FindBy(xpath = "(//ms-add-button[@tooltip='GENERAL.BUTTON.ADD'])[2]")
    private WebElement listOfValueAfterAddButton;

    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted'])[11]")
    private WebElement listOfValueEditButton;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[11]")
    private WebElement listOfValueDeleteButton;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()='Child field']")
    private WebElement childFieldInput;

    @FindBy(xpath = "//div[@fxflexalign='center']//ms-button")
    private WebElement childFieldAddButton;

    @FindBy(css = "input[id='ms-text-field-0']")
    private WebElement searchNameInput;

    @FindBy(css = "input[id='ms-text-field-1']")
    private WebElement searchCodeInput;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']//button")
    private WebElement fieldsEditButton;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement fieldsDeleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement afterClickDeleteButton;

    @FindBy(xpath = "//span[text()=' Integer ']")
    private WebElement integerField;

    @FindBy(xpath = "//span[text()=' Number ']")
    private WebElement numberField;

    @FindBy(xpath = "//span[text()=' Text ']")
    private WebElement textField;

    @FindBy(xpath = "//span[text()=' List of Value ']")
    private WebElement listOfValueField;

    @FindBy(xpath = "//span[text()=' Date ']")
    private WebElement dateField;

    @FindBy(xpath = "//span[text()=' Logical ']")
    private WebElement logicalField;

    @FindBy(xpath = "//span[text()=' Memo Field ']")
    private WebElement memoField;

    @FindBy(xpath = "//span[text()=' Composite ']")
    private WebElement compositeField;

    @FindBy(xpath = "(//div//mat-select)[3]")
    private WebElement childFieldDropDown;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[5]")
    private WebElement childFieldName;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.NAME']")
    private WebElement fieldsNameSearchInput;

    public void createFields(String name, String code, String fieldType) throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(addButton));
        Thread.sleep(1000);

        addButton.click();
        Thread.sleep(1000);

        wait.until(ExpectedConditions.visibilityOf(fieldNameInput));
        fieldNameInput.sendKeys(name);
        Thread.sleep(1000);

        fieldCodeInput.sendKeys(code);
        Thread.sleep(1000);

        selectFieldTypeDropdown.click();
        Thread.sleep(1000);

        if (Objects.equals(fieldType, "Integer")){
            integerField.click();
        } else if (Objects.equals(fieldType, "Number")) {
            numberField.click();
        } else if (Objects.equals(fieldType, "Text")) {
            textField.click();
        } else if (Objects.equals(fieldType, "List Of Value")) {
            listOfValueField.click();
            listOfValueKeyInput.sendKeys("Test");
            listOfValueValueInput.sendKeys("Test1");
            listOfValueAddButton.click();

        } else if (Objects.equals(fieldType, "Date")) {
            dateField.click();
        } else if (Objects.equals(fieldType, "Logical")) {
            logicalField.click();
        } else if (Objects.equals(fieldType, "Memo Field")) {
            memoField.click();
        } else if (Objects.equals(fieldType, "Composite")) {

            compositeField.click();
            Thread.sleep(1000);

            childFieldInput.click();
            Thread.sleep(1000);

            childFieldName.click();
            childFieldAddButton.click();
        }
        saveButton.click();
    }


    public void validateSuccessMessage(){
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        Assert.assertTrue(searchButton.isDisplayed());
        Assert.assertTrue(searchButton.getText().toLowerCase().contains("search"));
    }

    public void editFields(String name, String code) throws InterruptedException {
        Thread.sleep(1500);

        searchNameInput.sendKeys("Frank");
        Thread.sleep(1000);

        searchButton.click();
        Thread.sleep(1000);

        fieldsEditButton.click();
        Thread.sleep(1000);

        fieldNameInput.clear();
        Thread.sleep(1000);

        fieldNameInput.sendKeys(name);
        Thread.sleep(1000);

        fieldCodeInput.clear();
        Thread.sleep(1000);

        fieldCodeInput.sendKeys(code);
        Thread.sleep(1000);

        saveButton.click();

    }

    public void deleteFields(String name) throws InterruptedException {

        searchNameInput.sendKeys(name);
        Thread.sleep(1000);

        searchButton.click();
        Thread.sleep(1000);

        fieldsDeleteButton.click();
        Thread.sleep(1000);

        afterClickDeleteButton.click();

    }








}
