package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ContactListPage {
    private WebDriver driver;

    public ContactListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openContact(String contactName) {
        // Wait until contact list loads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Updated XPath — finds any element containing that contact name
        By contactLocator = By.xpath("//*[contains(text(),'" + contactName + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(contactLocator));

        WebElement contact = driver.findElement(contactLocator);
        contact.click();
    }
}
