package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgetPassword {
    private WebDriver driver;
private final By Email=By.xpath("//input[@id='input-email']");
    private final By btnRequestpass=By.xpath("//button[contains(text(),'Request password')]");
    public forgetPassword(WebDriver driver){
        this.driver=driver;
    }
    public forgetPassword enterEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
        return this;
    }
    public forgetPassword UserClickOnrequestPassword() {
        driver.findElement(this.btnRequestpass).click();
        return this;
    }
}
