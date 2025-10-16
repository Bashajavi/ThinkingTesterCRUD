package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import java.time.Duration;

public class ContactCRUDTest extends BaseTest {

    @Test
    public void testContactCRUDFlow() throws InterruptedException {
        // Step 1️⃣: Login
        LoginPage login = new LoginPage(driver);
        login.login("javithbasha.u@gmail.com", "Javithbasha@B12");
        Thread.sleep(2000);

        // Step 2️⃣: Add contact
        HomePage home = new HomePage(driver);
        home.clickAddContact();

        AddContactPage add = new AddContactPage(driver);
        add.createFullContact(
                "John", "Doe", "1990-05-15",
                "john.doe@example.com", "9876543210",
                "123 Main Street", "Apt 2B", "New York",
                "NY", "10001", "USA"
        );
        Thread.sleep(3000);

        // Step 3️⃣: View & Edit contact
        ContactListPage list = new ContactListPage(driver);
        list.openContact("John");

        ContactDetailsPage details = new ContactDetailsPage(driver);
        details.editContact("Johnny");
        Thread.sleep(2000);

        // Step 4️⃣: Delete contact
        details.deleteContact();
        Thread.sleep(2000);

        // Step 5️⃣: Logout
        home.logout();

        // Step 6️⃣: Verify logout (check login field instead of URL)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean loginVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).isDisplayed();

        Assert.assertTrue(loginVisible, "❌ Logout failed — login form not visible.");
        System.out.println("✅ Logout successful, back to login screen!");
    }
}
