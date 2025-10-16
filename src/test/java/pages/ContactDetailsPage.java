package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage {
    private WebDriver driver;

    private By editButton = By.id("edit-contact");
    private By deleteButton = By.id("delete");
    private By firstName = By.id("firstName");
    private By submitButton = By.id("submit");

    public ContactDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void editContact(String newName) {
        driver.findElement(editButton).click();
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(newName);
        driver.findElement(submitButton).click();
    }

    public void deleteContact() {
        driver.findElement(deleteButton).click();
        driver.switchTo().alert().accept();
    }
}
