import Pages.AddcourseTowishlist;
import Pages.LoginPage;
import Pages.addModuleToWishList;
import Pages.constantHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addModuleToWishListTests extends testBase {


    @Test
    public void addModuleToWishListAsGuest() {
        new constantHelper(driver).openModuleTab().UserClickOnModulecategory();
        new addModuleToWishList(driver).addWishListBtn();
        Assert.assertTrue(new constantHelper(driver).isforwardtologin(), "as a guest ,user doesn't forward to login when clicking on add to wish list ");


    }

    @Test
    public void checkifModuleaddedtoWishList() {

        new constantHelper(driver).openModuleTab().UserClickOnModulecategory();
        new addModuleToWishList(driver).addWishListBtn();

        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        Assert.assertTrue(new addModuleToWishList(driver).checkModuleexistAtWishlist(), "the module didn't added to Wishlist ");


    }

    @Test
    public void addModuleToWishListAsuser() {

        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();

    }
}