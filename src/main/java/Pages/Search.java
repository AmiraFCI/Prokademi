package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Search {
    private WebDriver driver;
    private final By searchField = By.xpath("//body/app-root[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/app-main[1]/div[1]/div[1]/input[1]");
    private final By searchButton = By.xpath("//button[contains(text(),'Search')]");

    private final By courseName = By.partialLinkText("amira engli");
    private final By checkCoursePage = By.xpath("//h1[contains(text(),'amira english')]");
    private final By moduleName = By.partialLinkText("module 1 ami");
    private final By checkModulePage = By.xpath("//span[contains(text(),'module 1 amira')]");
    private final By bookName = By.linkText("amira 2");
    private final By checkBookPage = By.xpath("//h1[contains(text(),'amira 2')]");
    private final By activityName = By.linkText("amira usefull");
    private final By checkActivityPage = By.xpath("//h1[contains(text(),'amira usefull')]");
    private final By excursionName = By.linkText("amirae");
    private final By checkExcursionPage = By.xpath("//h1[contains(text(),'amirae')]");
    private final By lecturerName = By.xpath("//a[@href='lecturer/27']");
    private final By checklecturerPage = By.xpath("//h2[contains(text(),'amira')]");
    //private final By  assertion = By.xpath("//body/app-root[1]/nb-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nb-layout-column[1]/app-main[1]/app-search[1]/div[2]/div[1]");

    public Search(WebDriver driver) {
        this.driver=driver;
    }

    public Search SearchField(String itemName) {
        driver.findElement(this.searchField).sendKeys(itemName);
        return this;
    }

    public Search clickSearchButton() {
        driver.findElement(this.searchButton).click();
        return this;
    }
    /*public boolean assertFinditem()
    {

        return driver.findElements(this.assertion).contains("amira");
    }
*/

    public Search UserSelectcourseName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.courseName));
        driver.findElement(courseName).click();
return this;
    }
    public boolean checkifCOursepageopened()
    {
        try {
            return driver.findElement(this.checkCoursePage).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Search UserSelectmoduleName() {
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            while (true) {

                jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

                try {
                    // Check if the element is present
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(moduleName));
                    // If the element is found, break out of the loop
                    if (element.isDisplayed()) {
                        element.click();
                        break;
                    }
                } catch (org.openqa.selenium.TimeoutException e) {

                }

            }

            return this;
        }
    }
    public boolean checkifModulepageopened()
    {
        try {
            return driver.findElement(this.checkModulePage).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Search UserSelectbookName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(bookName));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }

        return this;
    }
    public boolean checkifBookpageopened()
    {
        try {
            return driver.findElement(this.checkBookPage).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Search UserSelectactivityName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(activityName));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }

        return this;
    }
    public boolean checkifActivitypageopened()
    {
        try {
            return driver.findElement(this.checkActivityPage).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Search UserSelectlecturerName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(lecturerName));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }

        return this;
    }
public boolean checkiflecturerpageopened()
{
    try {
        return driver.findElement(this.checklecturerPage).isEnabled();
    }
    catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
}
    public Search UserSelectExcursionName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {

            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            try {
                // Check if the element is present
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(excursionName));
                // If the element is found, break out of the loop
                if (element.isDisplayed()) {
                    element.click();
                    break;
                }
            } catch (org.openqa.selenium.TimeoutException e) {

            }

        }

        return this;
    }
    public boolean checkifExcursionpageopened()
    {
        try {
            return driver.findElement(this.checkExcursionPage).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}