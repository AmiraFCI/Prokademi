package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addCousreToCart {

    private final WebDriver driver;
    private final JavascriptExecutor javascriptExecutor;
    private final By addcourseToCartBtn = By.linkText("Buy now");
    private final By configMessage = By.cssSelector("nb-toast.danger .message");
    private final By openCart =By.cssSelector("svg[data-prefix='fas'][data-icon='cart-shopping']");
    private final By numsAtCart=By.xpath("//span[contains(text(),'1')]");
    private final By checkCourseAtcart = By.xpath("//td[contains(text(), 'amira english')]");
    private final By messageWhenAddingpurchasedcourseTocart = By.xpath("//nb-toast[@class='danger']//i[contains(@class, 'nb-danger')]");
private final By loginTitleWhenOppeningCartAsguest=By.className("title");
    public addCousreToCart(WebDriver driver) {
        this.driver = driver;
        this.javascriptExecutor = (JavascriptExecutor) driver;
    }


    public addCousreToCart addCousreToCart() {
        driver.findElement(this.addcourseToCartBtn).click();
        return this;
    }

    public boolean isElementPresent() {
        try {
            WebElement element = driver.findElement(addcourseToCartBtn);
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isBuyButtonClickable() {
        try {
            WebElement element = driver.findElement(addcourseToCartBtn);
            return element.isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean cofMesageforAdding() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.configMessage));
        String s = we.getText();
        System.out.println(s);
        Boolean pass = s.contains("This Item Course with dataId 245 is purchased before!'");
        return pass;

    }

    //clicking on cart mark
    public addCousreToCart openCart() {
        driver.findElement(this.openCart).click();

        return this;
    }
    //in case logged in as user

    public boolean checkCourseexist() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(this.checkCourseAtcart));

            return element.isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    //in case as guest forward to log in page
    public boolean forwardToLogin()
    {
        try {
       return driver.findElement(this.loginTitleWhenOppeningCartAsguest).isEnabled();
    }
        catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
    }

    public boolean checkifthecoursepurchased() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.messageWhenAddingpurchasedcourseTocart));
        String s = we.getText();
        System.out.println(s);
        Boolean pass = s.contains("This Item Course with dataId 245 is purchased before!'");
        return pass;

    }
public int getCartItemCount()
{
    String cartcountText=numsAtCart.toString();
    return Integer.parseInt(cartcountText);

}
}