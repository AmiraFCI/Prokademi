import Pages.AddcourseTowishlist;
import Pages.LoginPage;
import Pages.constantHelper;
import Pages.lecturerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lecturersTests extends testBase{

    @Test
    public void checkIfCanEnterToLecturerDetailsAsUser(){
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
         new lecturerPage(driver).clickOnLecturerTab().clickOnLecturer().openCourseformLecturer();
        Assert.assertTrue(new lecturerPage(driver).checkTitleforsurethatcourseDetailesExists(),"user can't open course details ");
    }

    @Test
    public void checkIfCanOpenDetailsofCourseAndbuyItAsUser()
    {
        new constantHelper(driver).UserClickOnLogin();
        new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
        new lecturerPage(driver).clickOnLecturerTab().clickOnLecturer()
                .openCourseformLecturer();
        new constantHelper(driver).clickOnBUyBtn().openCart();
        Assert.assertTrue(new lecturerPage(driver).checkTitleforsurethatcourseDetailesExists(),"user can't open course details ");
    }
    @Test
    public void checkIfCanOpenDetailsofCourseAndAddItToWishListAsUser()
    {
new constantHelper(driver).UserClickOnLogin();
new LoginPage(driver).enterEmail("amira.fci.1997@gmail.com").enterPassword("asd123").clickLoginButton();
       new lecturerPage(driver).clickOnLecturerTab().clickOnLecturer()
.openCourseformLecturer();
        new constantHelper(driver).clickOnaddToWishListBtn()
                .openProfile()
                .openWishListTabFromProfilePage();
        Assert.assertTrue(new lecturerPage(driver).IsCourseExistAtWishlist(),"the cousre doesn't find at wish list ");
    }

    @Test
    public void checkIfCanOpenDetailsofCourseAguest()
    {
        new lecturerPage(driver).clickOnLecturerTab().clickOnLecturer()
                .openCourseformLecturer();
        Assert.assertTrue(new lecturerPage(driver).checkTitleforsurethatcourseDetailesExists(),"user can't open course details ");
    }
    @Test
    public void checkIfCanOpenDetailsofCourseAndbuyItAguest()
    {
        new lecturerPage(driver).clickOnLecturerTab().clickOnLecturer()
                .openCourseformLecturer();
        new constantHelper(driver).clickOnBUyBtn();
        Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to log in");
    }
    @Test
    public void checkIfCanOpenDetailsofCourseAndAddItToWishListAguest()
    {
        new lecturerPage(driver).clickOnLecturerTab().clickOnLecturer()
                .openCourseformLecturer();
        new constantHelper(driver).clickOnaddToWishListBtn();
        Assert.assertTrue(new constantHelper(driver).isforwardtologin(),"not forwarded to log in");
    }
}
