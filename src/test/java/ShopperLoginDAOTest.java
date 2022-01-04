import DAO.ShopperLoginDAO;
import DAO.ShopperLoginDAOImp;
import entities.ShopperLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopperLoginDAOTest {
    ShopperLoginDAO shopperLoginDAO = new ShopperLoginDAOImp();

    @Test
    void validateCustomerLogin() {
        ShopperLogin shopperLogin = shopperLoginDAO.getShopperLoginByCredentials("tester", "abc123");
        Assert.assertEquals(shopperLogin.getUsername(), "tester");
        Assert.assertEquals(shopperLogin.getPassword(), "abc123");
    }
}
