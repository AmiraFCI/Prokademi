package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FooterSection {
    WebDriver driver;
    private final By instaLink = By.xpath("//img[@height='30' and @src='assets/images/instagram.svg']");
    private final By faceLink = By.xpath("//img[@height='30' and @src='assets/images/fb.svg']");
    private final By twitterLink = By.xpath("//a[@href='https://twitter.com/akademia_online' and @target='_blank']/img[@height='30' and @src='assets/images/twitter.svg']");
    private final By FAQ = By.linkText("Frequently Asked Questions");
    private final By askTheAcademyForAnything = By.partialLinkText("Ask the Academy for anything ");
    private final By email = By.xpath("//p[contains(text(), 'Email:') and contains(text(), 'prokademi.al@gmail.com')]");
    private final By phone = By.xpath("//p[contains(text(), 'Tel. Nr:') and contains(text(), '+355 67 733 2440')]");
    private final By logo = By.xpath("//img[@height='110' and @src='assets/images/logo2.jpg']");
    private final By GooglePlayLink = By.xpath("//img[@height='30' and @src='assets/images/google_play.svg']");
public FooterSection(WebDriver driver){
    this.driver=driver;
}

    public Boolean getGooglePlayLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        Boolean txtExist;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {

                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(GooglePlayLink));
                String text = element.getText();
                System.out.println(text);
                txtExist = text.contains("asd");
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }
        }

        return txtExist;
    }
    /*public WebElement getAppleStoreLink() {
        return driver.findElement(By.xpath("//a[contains(@href, 'apps.apple.com')]"));
    }*/

}