package serviceTest;

import DAO.ShopperLoginDAO;
import DAO.ShopperLoginDAOImp;
import Service.ShopperLoginServiceImp;
import Service.ShopperLoginServices;
import entities.ShopperLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopperLoginServiceTest {
    static ShopperLoginDAO shopperLoginDAO = new ShopperLoginDAOImp();
    static ShopperLoginServices shopperLoginServices = new ShopperLoginServiceImp(shopperLoginDAO);

    @Test
    void validateShopperLogin(){
        ShopperLogin shopperLogin = shopperLoginServices.getShopperLoginServices("princess", "lilmeanie");
        Assert.assertEquals(shopperLogin.getShopperUsername(), "princess");
        Assert.assertEquals(shopperLogin.getShopperPassword(),"lilmeanie");
    }
}
