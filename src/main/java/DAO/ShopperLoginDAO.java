package DAO;

import entities.ShopperLogin;

public interface ShopperLoginDAO {
    ShopperLogin getShopperLoginByCredentials(String username, String password);
}
