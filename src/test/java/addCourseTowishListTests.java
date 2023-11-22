import Pages.AddcourseTowishlist;
import Pages.LoginPage;
import Pages.addModuleToWishList;
import Pages.constantHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addCourseTowishListTests extends testBase {

    @Test
    public void addCourseTowishListBtnexist() {
        new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
        new AddcourseTowishlist(driver).isElementPresent();
        Assert.assertTrue(new AddcourseTowishlist(driver).isElementPresent(), "add to wishlist btn isn't exist");


    }

    @Test
    public void addCourseTowishlistfowardtoLoginAsGuest() {
        new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
        new AddcourseTowishlist(driver).addcourseToWishlistBtn();
        Assert.assertTrue(new constantHelper(driver).isforwardtologin(), "as a guest ,user doesn't forward to login when clicking on add to wish list ");


    }
@Test

   public void addCourseTowishlistfowardtoLoginAsUser()
    {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new constantHelper(driver) .openCousesTab().UserClickOncategory().UserSelectCourse();
       // new AddcourseTowishlist(driver).addcourseToWishlistBtn().openProfileTShowWishList().openWishListTab().checkIfCourseexistTWishlistTab();
        //Assert.assertTrue(new AddcourseTowishlist(driver).checkIfCourseexistTWishlistTab(),"the course isn't exist");


    }

    @Test
    public void checkifCourseaddedtoWishList() {

        new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
        new AddcourseTowishlist(driver).addcourseToWishlistBtn();

        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        Assert.assertTrue(new AddcourseTowishlist(driver).checkCourseexistAtWishlist(), "the module didn't added to Wishlist ");


    }
}