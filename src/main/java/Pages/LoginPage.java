package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    private By usernameField = By.cssSelector("#input-email");
    private By passwordField = By.cssSelector("#input-password");
    public By LoginButton = By.xpath("//button[contains(text(),'Log In')]");
    public By logOutButton = By.linkText("Log out");

private final By WelcomAfterlogin=By.cssSelector("a.header-menu-link.active-menu-link");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage enterEmail(String email) {
        driver.findElement(this.usernameField).sendKeys(email);
        return this;
    }

    public LoginPage enterPassword(String Password) {
        driver.findElement(this.passwordField).sendKeys(Password);
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(this.LoginButton).click();
        return this;
    }

    public boolean checkLogoutButton() {

        return driver.findElement(logOutButton).isDisplayed();
    }

    public boolean checkErrorMailorpasswordMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nb-alert[@outline='danger']")));
        String s = we.getText();
        System.out.println(s);
        Boolean pass = s.contains("Oh snap!\n" + "Invalid email or password");
        return pass ;
    }


    public boolean AfterLogin()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.WelcomAfterlogin));
      boolean b=we.isEnabled();
      System.out.println(b);
            return we.isEnabled();

}}





