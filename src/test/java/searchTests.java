import Pages.Search;
import Utilities.utiliy;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.constantHelper.driver;

public class
 searchTests extends testBase{
    String itemName = "amira";

    @Test
    public void searchaboutcourseandopenit ()
    {
        new Search(driver).SearchField(itemName).clickSearchButton().UserSelectcourseName();
        Assert.assertTrue(new Search(driver).checkifCOursepageopened(),"user can't show course  details ");

    }
    @Test
    public void searchaboutmoduleandopenit()
    {
        new Search(driver).SearchField(itemName).clickSearchButton().UserSelectmoduleName();
        Assert.assertTrue(new Search(driver).checkifModulepageopened(),"user can't show module  details ");


    }
    @Test
    public void searchaboutbookandopenit()
    {
        new Search(driver).SearchField(itemName).clickSearchButton().UserSelectbookName();
        Assert.assertTrue(new Search(driver).checkifBookpageopened(),"user can't show book details ");
    }
    @Test
    public void searchaboutactivityandopenit()
    {
        new Search(driver).SearchField(itemName).clickSearchButton().UserSelectactivityName();
        Assert.assertTrue(new Search(driver).checkifActivitypageopened(),"user can't show activity details ");


    }

    @Test
    public void searchaboutLecturerandopenit()
    {
        new Search(driver).SearchField(itemName).clickSearchButton().UserSelectlecturerName();
        Assert.assertTrue(new Search(driver).checkiflecturerpageopened(),"user can't show lecturer details ");


    }
    @Test
    public void searchaboutExcursionandopenit()
    {
        new Search(driver).SearchField(itemName).clickSearchButton().UserSelectExcursionName();
        Assert.assertTrue(new Search(driver).checkifExcursionpageopened(),"user can't show excursion details ");


    }
}
