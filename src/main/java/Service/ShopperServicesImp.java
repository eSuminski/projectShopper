package Service;

import DAO.ShopperDAO;
import entities.Shopper;

public class ShopperServicesImp implements ShopperServices {

    ShopperDAO shopperDAO;
    public ShopperServicesImp(ShopperDAO shopperDAO){
        this.shopperDAO = shopperDAO;
    }


    @Override
    public Shopper createShopper(Shopper shopper) {
        return this.shopperDAO.createShopper(shopper);
    }
}
