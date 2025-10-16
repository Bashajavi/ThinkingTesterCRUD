package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContactPage {
    private WebDriver driver;

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By birthDate = By.id("birthdate");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By street1 = By.id("street1");
    private By street2 = By.id("street2");
    private By city = By.id("city");
    private By stateProvince = By.id("stateProvince");
    private By postalCode = By.id("postalCode");
    private By country = By.id("country");
    private By submitButton = By.id("submit");

    public AddContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createFullContact(
            String fName, String lName, String bDate, String emailAddr,
            String phoneNum, String addr1, String addr2, String cityName,
            String state, String postal, String countryName) {

        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(birthDate).sendKeys(bDate);
        driver.findElement(email).sendKeys(emailAddr);
        driver.findElement(phone).sendKeys(phoneNum);
        driver.findElement(street1).sendKeys(addr1);
        driver.findElement(street2).sendKeys(addr2);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(stateProvince).sendKeys(state);
        driver.findElement(postalCode).sendKeys(postal);
        driver.findElement(country).sendKeys(countryName);
        driver.findElement(submitButton).click();
    }
}
