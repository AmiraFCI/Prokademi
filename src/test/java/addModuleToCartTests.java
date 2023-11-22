import Pages.LoginPage;
import Pages.addCousreToCart;
import Pages.constantHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addModuleToCartTests extends testBase {


    @Test
    public void  checkAddTocartAsguest() {
        new constantHelper(driver).openModuleTab().UserClickOnModulecategory();


    }
   @Test
    public void  checkAddTocartAsuser() {
       new constantHelper(driver).UserClickOnLogin();
       new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new constantHelper(driver).openModuleTab().UserClickOnModulecategory();


    }
}