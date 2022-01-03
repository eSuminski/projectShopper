import DAO.ShopperDAO;
import DAO.ShopperDAOImp;
import entities.Shopper;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ShopperDAOTest {

    ShopperDAO shopperDAO =new ShopperDAOImp();

    @Test
    void createShopper(){
        Shopper newShopper = new Shopper("Mikey","Crazy Turtle","tmnt",
                10001, 0);
        Shopper returnedShopper = shopperDAO.createShopper(newShopper);
        Assert.assertTrue(returnedShopper.getShopperId() !=0);
    }
}
