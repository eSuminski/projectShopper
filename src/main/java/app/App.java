package app;

import DAO.*;
import Service.*;
import controllers.ShopperController;
import controllers.CustomerController;
import controllers.ShoppingListController;
import io.javalin.Javalin;

public class App {
    public static void main(String[] args){
        Javalin app = Javalin.create(config ->{
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });
        CustomerDAO customerDAO = new CustomerDAOImp();
        CustomerServices customerServices = new CustomerServicesImp(customerDAO);
        CustomerController customerController = new CustomerController(customerServices);

        ShopperDAO shopperDAO = new ShopperDAOImp();
        ShopperServices shopperServices = new ShopperServicesImp(shopperDAO);
        ShopperController shopperController = new ShopperController(shopperServices);

        ShoppingListDAO shoppingListDAO = new ShoppingListDAOImp();
        ShoppingListServices shoppingListServices = new ShoppingListServicesImp(shoppingListDAO);
        ShoppingListController shoppingListController = new ShoppingListController(shoppingListServices);


        //routes and assign handler
        //create customer route
        app.post ("/customer", customerController.createCustomer);

        //create shopper route
        app.post ("/shopper", shopperController.createShopper);

        //create shopping list
        app.post ("/shoppingList", shoppingListController.createShoppingList);

        app.start();
    }
}
