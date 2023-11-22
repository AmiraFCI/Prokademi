import Pages.FooterSection;
import org.testng.Assert;
import org.testng.annotations.Test;



public class homePageTests extends testBase{

    @Test
    public void testGooglePlayLinkExist() {
        Assert.assertTrue(new FooterSection(driver).getGooglePlayLink(), "Google Play link is not displayed.");
      // Assert.assertTrue(new FooterSection(driver).getGooglePlayLink().isEnabled(), "Facebook Share button is not clickable.");
    }
   /* @Test
    public void testContactUsLinkExistAtfooter() {
        Assert.assertTrue(webpage.getContactUsLink().isDisplayed(), "Contact Us link is not displayed.");

    }

    @Test
    public void testEmailExistAtfooter() {
        Assert.assertTrue(webpage.getEmail().isDisplayed(), "Email is not displayed.");
    }

    @Test
    public void testPhoneExist() {
        Assert.assertTrue(webpage.getPhone().isDisplayed(), "Phone is not displayed.");
    }

    @Test
    public void testFacebookShareButtonExist() {
        Assert.assertTrue(webpage.getFacebookShareButton().isDisplayed(), "Facebook Share button is not displayed.");
    }

    @Test
    public void testInstagramShareButtonExist() {
        Assert.assertTrue(webpage.getInstagramShareButton().isDisplayed(), "Instagram Share button is not displayed.");
    }

    @Test
    public void testTwitterShareButtonExist() {
        Assert.assertTrue(webpage.getTwitterShareButton().isDisplayed(), "Twitter Share button is not displayed.");
    }

    @Test
    public void testElementsAreClickable() {
        Assert.assertTrue(webpage.getContactUsLink().isEnabled(), "Contact Us link is not clickable.");
        Assert.assertTrue(webpage.getEmail().isEnabled(), "Email is not clickable.");
        Assert.assertTrue(webpage.getPhone().isEnabled(), "Phone is not clickable.");
        Assert.assertTrue(webpage.getFacebookShareButton().isEnabled(), "Facebook Share button is not clickable.");
        Assert.assertTrue(webpage.getInstagramShareButton().isEnabled(), "Instagram Share button is not clickable.");
        Assert.assertTrue(webpage.getTwitterShareButton().isEnabled(), "Twitter Share button is not clickable.");
    }

    // Existing test methods



    @Test
    public void testAppleStoreLinkExist() {
        Assert.assertTrue(webpage.getAppleStoreLink().isDisplayed(), "Apple Store link is not displayed.");
    }

    @Test
    public void testAppDownloadLinksAreClickable() {
        Assert.assertTrue(webpage.getGooglePlayLink().isEnabled(), "Google Play link is not clickable.");
        Assert.assertTrue(webpage.getAppleStoreLink().isEnabled(), "Apple Store link is not clickable.");
    }*/

}




