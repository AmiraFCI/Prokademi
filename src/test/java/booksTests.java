import Pages.LoginPage;
import Pages.books;
import Pages.constantHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class booksTests extends testBase {
    //////////////////////new  book section (user/guest )

@Test
public void checkIfCanOpenDetailsofNewBookAndbuyItAsGuest(){
    new books(driver).openBooksTab().clickNewBookTab().openNewDetailsBook();
   // new constantHelper(driver).clickOnBUyBtn();
  //  Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
}
    @Test
    public void checkIfCanOpenDetailsofNewBookAddItToWishListAsGuest(){
        new books(driver).openBooksTab().clickNewBookTab().openNewDetailsBook();
       // new constantHelper(driver).clickOnaddToWishListBtn();
       // Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
    }
    @Test
    public void checkIfCanOpenDetailsofNewBookAddBuyItAsUser(){
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab().clickNewBookTab().openNewDetailsBook();
        // new constantHelper(driver).clickOnBUyBtn().openCart();
        // Assert.assertTrue("هنتاكد انه الكتاب موجود ف الكارت");
    }
    @Test
    public void checkIfCanOpenDetailsofNewBookAddItToWishListAsUser(){
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab().clickNewBookTab().openNewDetailsBook();
        new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        //Assert.assertTrue("هنتاكد انه الكتاب موجود ف الويش ليست");
    }



    //////////////////////recommended  book section (user/guest )
   @Test
    public void checkIfCanOpenDetailsofRecommendedBookAddItToWishListAsGuest(){
       new books(driver).openBooksTab().clickRecommendedBookTab().openrecommendedBookDetailsBook();
      // new constantHelper(driver).clickOnaddToWishListBtn();
     //  Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");

   }
  @Test
    public void checkIfCanOpenDetailsofRecommendedBookAndbuyItAsGuest() {
      new books(driver).openBooksTab().clickRecommendedBookTab().openrecommendedBookDetailsBook();
     // new constantHelper(driver).clickOnBUyBtn();
      //Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
  }




    @Test
    public void checkIfCanOpenDetailsofRecommendedBookAddBuyItAsUser(){
       new constantHelper(driver).UserClickOnLogin();
       new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
       new books(driver).openBooksTab()
               .clickRecommendedBookTab().openrecommendedBookDetailsBook();
     //   new constantHelper(driver).clickOnBUyBtn().openCart();
        // Assert.assertTrue("هنتاكد انه الكتاب موجود ف الكارت");
   }

    @Test
    public void checkIfCanOpenDetailsofRecommendedBookAddItToWishListAsUser(){

        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab()
                .clickRecommendedBookTab().
        openrecommendedBookDetailsBook();
        new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        //Assert.assertTrue("هنتاكد انه الكتاب موجود ف الويش ليست");
    }



//////////////////////All book section (user/guest )

  @Test
    public void checkIfCanOpenDetailsofAllBookAddItToWishListAsUser(){
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab().openAllBookDetailsBook();
        new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        //Assert.assertTrue("هنتاكد انه الكتاب موجود ف الويش ليست");
    }
    @Test
    public void checkIfCanOpenDetailsofAllBookAddItToWishListAsGuest(){
        new books(driver).openBooksTab().openAllBookDetailsBook();
        new constantHelper(driver).clickOnaddToWishListBtn();
        //Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
    }


    @Test
    public void checkIfCanOpenDetailsofAllBookAddBuyItAsUser(){
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab().openAllBookDetailsBook();
        //   new constantHelper(driver).clickOnBUyBtn().openCart();
        // Assert.assertTrue("هنتاكد انه الكتاب موجود ف الكارت");
    }
    @Test
    public void checkIfCanOpenDetailsofAllBookAddBuyItAsGuest(){

        new books(driver).openBooksTab().openAllBookDetailsBook();
        // new constantHelper(driver).clickOnBUyBtn();
        //Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
    }


/////Marks at book

@Test
    public void checkAddBookToCartFromCartMarkAsGuest(){

    new books(driver).openBooksTab().clickOnCartMarkBook();
    Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
}
@Test
public void checkAddBookToWishListFromWishListMarkAsGuest() {

        new books(driver).openBooksTab().clickOnWishListMarkBook();
        Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
    }
    @Test
    public void checkAddBookToCartFromCartMarkAsUser() {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab().clickOnCartMarkBook();
        new constantHelper(driver).clickOnBUyBtn();
        // Assert.assertTrue("هنتاكد انه الكتاب موجود ف الكارت");
    }
    @Test
    public void checkAddBookToWishListFromWishListMarkAsUser() {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new books(driver).openBooksTab().
                clickOnWishListMarkBook();
        //new constantHelper(driver).openProfile().openWishListTabFromProfilePage();
        // Assert.assertTrue("هنتاكد انه الكتاب موجود ف الوش ليست ");
    }

    @Test
    public void checdonatedBookfromgiftMarkAsUser() {

        new books(driver).openBooksTab();

        //Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to login in");
    }

}


