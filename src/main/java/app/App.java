package app;

import DAO.*;
import Service.*;
import controllers.*;
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

        CustomerLoginDAO customerLoginDAO = new CustomerLoginDAOImp();
        CustomerLoginServices customerLoginServices = new CustomerLoginServicesImp(customerLoginDAO);
        CustomerLoginController customerLoginController = new CustomerLoginController(customerLoginServices);

        ShopperLoginDAO shopperLoginDAO = new ShopperLoginDAOImp();
        ShopperLoginServices shopperLoginServices = new ShopperLoginServiceImp(shopperLoginDAO);
        ShopperLoginController shopperLoginController = new ShopperLoginController(shopperLoginServices);


        //routes and assign handler
        //create customer route
        app.post ("/customer", customerController.createCustomer);

        //create shopper route
        app.post ("/shopper", shopperController.createShopper);

        //create shopping list
        app.post ("/shoppingList", shoppingListController.createShoppingList);

        //create customer login route
        app.post("/customerLogin", customerLoginController.getCustomerLoginByCredentials);

        //create shopper login route
        app.post("/shopperLogin", shopperLoginController.getShopperLoginByCredentials);

        app.start();
    }
}
