package shopperservices;

import DAO.ShopperDAO;
import DAO.ShopperDAOImp;
import Service.ShopperServices;
import Service.ShopperServicesImp;

public class ShopperServicesTest {
    ShopperDAO shopperDAO = new ShopperDAOImp();
    ShopperServices shopperServices = new ShopperServicesImp(shopperDAO);
}
