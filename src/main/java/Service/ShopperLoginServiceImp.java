package Service;

import DAO.ShopperLoginDAO;
import customException.InvalidLogin;
import entities.ShopperLogin;

public class ShopperLoginServiceImp implements ShopperLoginServices{
    ShopperLoginDAO shopperLoginDAO;

    public ShopperLoginServiceImp(ShopperLoginDAO shopperLoginDAO){
        this.shopperLoginDAO = shopperLoginDAO;
    }

    @Override
    public ShopperLogin getShopperLoginServices(String username, String password) {
        try{
            return this.shopperLoginDAO.getShopperLoginByCredentials(username, password);
        }catch(InvalidLogin e){
            throw new InvalidLogin("Sorry credential invalid");
        }
    }
}
