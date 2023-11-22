package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddcourseTowishlist {

        private final WebDriver driver;
        private final JavascriptExecutor javascriptExecutor;

        private final  By addcourseToWishlistBtn  =By.linkText("Save on your wishlist");
        private final By redirectionTologinfromwishlistbtn=By.cssSelector("p.sub-title");
        private final By openProfile=By.xpath("//a[ @routerlink='/profile' ]");
      private final By OpenWishListTab=By.xpath("//span[@_ngcontent-ail-c17 and @style='line-height:45px;vertical-align:top;']");
    private final By checkCourseExist=By.cssSelector("span[_ngcontent-cwv-c5][style='color:#b51e2d;'][class='ng-star-inserted']");

    public AddcourseTowishlist(WebDriver driver){
            this.driver=driver;
            this.javascriptExecutor = (JavascriptExecutor) driver;
        }

        public AddcourseTowishlist addcourseToWishlistBtn() {
            driver.findElement(this.addcourseToWishlistBtn).click();
            return this;
        }

    public boolean isElementPresent() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(this.addcourseToWishlistBtn));
        System.out.println(element.isDisplayed());

        return element.isDisplayed();


    }
        public boolean isforwardtologin() {
            try {
                WebElement element = driver.findElement(redirectionTologinfromwishlistbtn);
                return element.isDisplayed();
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
        public AddcourseTowishlist openWishListTab(){
  driver.findElement(this.OpenWishListTab).click();
        return this;
        }
    public AddcourseTowishlist openProfileTShowWishList(){
        driver.findElement(openProfile).click();
        return this;
    }
  public boolean checkIfCourseexistTWishlistTab()
        {
            try {
            WebElement element = driver.findElement(checkCourseExist);
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
        }


     /*   public boolean cofMesageforAdding(){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(this.configMessage));
            String s = we.getText();
            System.out.println(s);
            Boolean pass = s.contains("the course added to cart successfully");
            return pass ;
*/
        }






