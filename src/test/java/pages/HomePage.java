package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By addContactButton = By.id("add-contact");
    private By logoutButton = By.id("logout");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddContact() {
        driver.findElement(addContactButton).click();
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }
}
