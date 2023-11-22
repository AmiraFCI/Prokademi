
import Pages.LoginPage;
import Pages.constantHelper;
import Utilities.utiliy;
import com.aventstack.extentreports.ExtentTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sun.source.tree.AssertTree;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.addCousreToCart;
import org.testng.annotations.Test;

import java.time.Duration;

public class addCousreToCartTests extends testBase{


    //check add to cart btn clickable
    @Test
    public void isAddToCartClickable(){
  new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
  new addCousreToCart(driver).addCousreToCart();
   Assert.assertTrue(new addCousreToCart(driver).isBuyButtonClickable(),"item isn't clickable ");

    }


  //check add to cart btn exist
    @Test
    public void isAddtoCatbtnexist(){

        new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
        new addCousreToCart(driver).addCousreToCart();
        Assert.assertTrue(new addCousreToCart(driver).isElementPresent(),"item isn't exist ");

    }


   //check message when adding course to cart
    @Test
  public void addedTocartSuccess()
    {
        new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
        new addCousreToCart(driver).addCousreToCart().cofMesageforAdding();
        Assert.assertTrue(new addCousreToCart(driver).cofMesageforAdding(),"the message isn't correct / no message appear  ");

    }


   //check lang of message
  /*  @Test
    public void checkMessagelanguagueenglish()
    {


    }*/

    //for check the count at cart changed
   @Test
  public void checkCountChangedOncart()
     {
         new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
         new addCousreToCart(driver).addCousreToCart();

         int intialItemCartCount=new addCousreToCart(driver).getCartItemCount();
       int   updatedItemCartCount=new addCousreToCart(driver).getCartItemCount();
        Assert.assertEquals(updatedItemCartCount,intialItemCartCount +1);

     }


    //check if adding purchased item to cart
     /*@Test
    public void checkifthecoursepurchasedbefore()
     {
         new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
         new addCousreToCart(driver).addCousreToCart();
         Assert.assertTrue(new addCousreToCart(driver).checkifthecoursepurchased(),"message is shown with this item is purchased ");

     }*/
//check if item exist at cart after log in
     @Test
   public void checkIfCourseExistAtCart()
    {
        new constantHelper(driver).openCousesTab().UserClickOncategory().UserSelectCourse();
        new addCousreToCart(driver).addCousreToCart();
        new constantHelper(driver).openCart();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();

        Assert.assertTrue(new addCousreToCart(driver).checkCourseexist(),"the course isn't exist ");


    }
    //check forward to log in as guest
    @Test
    public void checkAddTocartAsguest()
    {
        new constantHelper(driver).openCousesTab()
                .UserClickOncategory()
                .UserSelectCourse();
        new addCousreToCart(driver)
                .addCousreToCart();
        new constantHelper(driver).openCart();
        new constantHelper(driver).forwardToLogin();

        Assert.assertTrue(new constantHelper(driver).forwardToLogin(),"not forward to log in as guest ");



    }
    @Test
    public void checkAddingTocartAsUser()
    {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new constantHelper(driver).openCousesTab()
                .UserClickOncategory()
                .UserSelectCourse();
        new addCousreToCart(driver)
                .addCousreToCart();
                new constantHelper(driver).openCart();
      Assert.assertTrue(new addCousreToCart(driver).checkCourseexist(),"the course isn't exist ");
    }

}
