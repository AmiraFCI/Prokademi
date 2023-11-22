package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterationPage {
    private WebDriver driver;
    private final By fullName = By.xpath("//input[@id='input-name']");
    private final By email = By.xpath("//input[@id='input-email']");
    private final By password = By.xpath("//input[@id='input-password']");
    private final By confPassword = By.xpath("//input[@id='input-re-password']");

    private final By registerationButtonAfterfilldata = By.xpath("//button[contains(text(),'Register')]");
    private final By errorMessage = By.cssSelector("nb-alert[outline='danger']");
private final By checkterms=By.tagName("span");

    public RegisterationPage(WebDriver driver) {
        this.driver=driver;
    }

    public RegisterationPage enterfullName(String NAME) {
        driver.findElement(this.fullName).sendKeys(NAME);
        return this;
    }
    public RegisterationPage enterEmail(String Email) {
        driver.findElement(this.email).sendKeys(Email);
        return this;
    }

    public RegisterationPage enterPassword(String Pssword) {
        driver.findElement(this.password).sendKeys(Pssword);
        return this;
    }

    public RegisterationPage enterConfPassword(String CofPASS) {
        driver.findElement(this.confPassword).sendKeys(CofPASS);
        return this;
    }
    public RegisterationPage clickregisterationafterfilldataButton() {
        driver.findElement(this.registerationButtonAfterfilldata ).click();
        return this;
    }
    public RegisterationPage acceptionOfterms() {
        driver.findElement(this.checkterms).click();
        return this;}



    public boolean ErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nb-card-body/nb-auth-block[1]/app-register[1]/nb-alert[1]")));
        String s = we.getText();
        System.out.println(s);
        Boolean pass = s.contains("Oh snap!\n" +
                "\n" +
                "Email exists");
        return pass ;

    }
}
