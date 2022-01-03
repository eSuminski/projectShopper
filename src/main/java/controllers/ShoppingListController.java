package controllers;

import Service.ShoppingListServices;
import com.google.gson.Gson;
import entities.ShoppingList;
import io.javalin.http.Handler;

public class ShoppingListController {
    ShoppingListServices shoppingListServices;

    public ShoppingListController(ShoppingListServices shoppingListServices){
        this.shoppingListServices = shoppingListServices;
    }

    public Handler createShoppingList = ctx ->{
        Gson gson = new Gson();
        ShoppingList newShoppingList = gson.fromJson(ctx.body(), ShoppingList.class);
        ShoppingList createdShoppingList = this.shoppingListServices.createShoppingList(newShoppingList);
        String createdShoppingListJson = gson.toJson(createdShoppingList);
        ctx.result(createdShoppingListJson);
        ctx.status(201);
    };
}
