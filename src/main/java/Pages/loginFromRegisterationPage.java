package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginFromRegisterationPage {
    private WebDriver driver;
    private final By registerbutton=By.xpath("//a[contains(text(),'Register')]");
    private final By loginLink=By.xpath("//nb-card-body/nb-auth-block[1]/app-register[1]/section[1]/a[1]");
    private  By usernameField = By.cssSelector("#input-email");
    private  By passwordField = By.cssSelector("#input-password");
    public By LoginButton = By.xpath("//button[contains(text(),'Log In')]");

    public loginFromRegisterationPage(WebDriver driver)
    {
        this.driver=driver;
    }

  public  loginFromRegisterationPage clickonregisterBtn()
     {
        driver.findElement(this.registerbutton).click();
        return this;
    }

    public loginFromRegisterationPage UserClickOnLoginfromReg() {
        driver.findElement(this.loginLink).click();
        return this;
    }
    public loginFromRegisterationPage enterEmail(String email) {
        driver.findElement(this.usernameField).sendKeys(email);
        return this;
    }

    public loginFromRegisterationPage enterPassword(String Password) {
        driver.findElement(this.passwordField).sendKeys(Password);
        return this;
    }
    public loginFromRegisterationPage clickLoginButton() {
        driver.findElement(this.LoginButton).click();
        return this;
    }

    public boolean checkErrorMailorpasswordMessage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nb-card-body/nb-auth-block[1]/app-login[1]/nb-alert[1]")));
        String s = we.getText();
        System.out.println(s);
        Boolean pass = s.contains("Oh snap!\n" + "Invalid email or password");
        return pass ;
    }

}
