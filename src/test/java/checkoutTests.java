import Pages.AddcourseTowishlist;
import Pages.LoginPage;
import Pages.checkout;
import Pages.constantHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkoutTests extends testBase {


    @Test
    public void openCheckoutPageAsGuest() {
        new checkout(driver).openCart();
        Assert.assertTrue(new constantHelper(driver).isforwardtologin(), "as a guest ,user doesn't forward to login when clicking on add to wish list ");


    }

    @Test
    public void openCheckoutPageAsUser() {

        new checkout(driver).openCart();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
    }
    @Test
    public void openCheckoutAndCheckTotalPrice() {


    }
    @Test
    public void openCheckoutAndRemoveItemAndCheckTotalPrice() {


    }

}