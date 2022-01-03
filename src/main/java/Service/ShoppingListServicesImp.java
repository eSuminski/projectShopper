package Service;

import DAO.ShoppingListDAO;
import entities.ShoppingList;

public class ShoppingListServicesImp implements ShoppingListServices {
    ShoppingListDAO shoppingListDAO;

    public ShoppingListServicesImp(ShoppingListDAO shoppingListDAO){
        this.shoppingListDAO = shoppingListDAO;
    }

    @Override
    public ShoppingList createShoppingList(ShoppingList shoppingList){
        return this.shoppingListDAO.createShoppingList(shoppingList);
    }
}

