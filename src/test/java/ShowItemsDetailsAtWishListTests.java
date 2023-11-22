import Pages.LoginPage;
import Pages.ShowItemsDetailsAtWishList;
import Pages.constantHelper;
import org.testng.annotations.Test;

public class ShowItemsDetailsAtWishListTests extends testBase{



   @Test
    public void checkIfUserCanOpenCourseDetails()
    {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        new ShowItemsDetailsAtWishList(driver).clickOnEyeMark();
    }
    @Test
    public void checkIfUserCanOpenModuleDetails()
    {

    }
    @Test
    public void checkIfUserCanOpenBookDetails()
    {

    }
    @Test
    public void checkIfUserCanOpenMemorizationCourseDetails()
    {

    }
    @Test
    public void checkIfUserCanDeleteNyItem()
    {

    }
}
